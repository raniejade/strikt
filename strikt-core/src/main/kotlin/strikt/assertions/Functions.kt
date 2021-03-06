package strikt.assertions

import strikt.api.Assertion

inline fun <reified E : Throwable> Assertion<() -> Unit>.throws(): Assertion<E> {
  var exception: E? = null
  assert("throws %s", E::class.java) {
    val caught = try {
      subject()
      null
    } catch (e: Throwable) {
      e
    }
    when (caught) {
      null -> fail(message = "nothing was thrown")
      is E -> {
        pass()
        exception = caught
      }
      else -> fail(actual = caught.javaClass, message = "%s was thrown", cause = caught)
    }
  }
  return if (exception != null) map { exception!! } else throw IllegalStateException()
}
