package strikt.api

/**
 * The receiver of the lambda passed to [Assertion.assert].
 * This class allows evaluation of the [subject] value, or of composed
 * assertions, ultimately resulting in a call to [pass] or [fail].
 */
interface AssertionContext<T> {
  /**
   * The value that is the subject of the assertion.
   */
  val subject: T

  /**
   * Report that the assertion succeeded.
   */
  fun pass()

  /**
   * Report that the assertion failed optionally providing additional detail.
   *
   * @param actual the value(s) that violated the assertion.
   * @param message a message describing the failure.
   * @param cause an underlying exception that was the cause of the failure.
   */
  fun fail(
    actual: Any? = null,
    message: String? = if (actual == null) null else "found %s",
    cause: Throwable? = null
  ) = fail(Failure(actual, message, cause))

  fun fail(failure: Failure)
}