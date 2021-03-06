package strikt.api.reporting

import strikt.api.Failure
import strikt.api.Status
import strikt.api.Status.Failed
import strikt.api.Status.Passed
import strikt.api.Status.Pending

sealed class Reportable {
  abstract val status: Status
  private var parent: Reportable? = null

  val root: Reportable
    get() = parent.let {
      when (it) {
        null -> this
        else -> it.root
      }
    }

  val results: Collection<Reportable>
    get() = _results

  fun append(result: Reportable) {
    result.parent = this
    _results.add(result)
  }

  val anyFailed: Boolean
    get() = results.any { it.status == Failed }

  val allFailed: Boolean
    get() = results.isNotEmpty() && results.all { it.status == Failed }

  val anyPassed: Boolean
    get() = results.any { it.status == Passed }

  val allPassed: Boolean
    get() = results.isNotEmpty() && results.all { it.status == Passed }

  private val _results = mutableListOf<Reportable>()
}

data class Subject<T>(
  val description: String,
  val value: T
) : Reportable() {
  override val status: Status
    get() = when {
      results.all { it.status == Passed } -> Passed
      results.all { it.status == Pending } -> Pending
      else -> Failed
    }
}

/**
 * Represents the result of an assertion or a group of assertions.
 *
 * @property status The status of the result.
 * @property description The description of the assertion as passed to
 * [strikt.api.Assertion.assert].
 * @property actual The actual value or values that violated the assertion.
 * This property is optional as it does not make sense for all types of
 * assertion.
 * However, it can help improve diagnostic messages where it _is_ appropriate.
 * @property results Contains the results of any nested assertions.
 */
data class Result
internal constructor(
  val description: String,
  val expected: Any?
) : Reportable() {
  private var _status: Status = Pending
  private var failure: Failure? = null

  fun pass() {
    _status = Passed
  }

  fun fail(failure: Failure? = null) {
    _status = Failed
    this.failure = failure
  }

  override val status: Status
    get() = _status

  val actual: Any?
    get() = failure?.actual

  val message: String?
    get() = failure?.message

  val cause: Throwable?
    get() = failure?.cause
}
