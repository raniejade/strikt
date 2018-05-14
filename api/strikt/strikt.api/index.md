[strikt](../index.md) / [strikt.api](./index.md)

## Package strikt.api

### Types

| Name | Summary |
|---|---|
| [Assertion](-assertion/index.md) | `class Assertion<T>`<br>Holds a subject of type [T](-assertion/index.md#T) that you can then make assertions about. |
| [AssertionContext](-assertion-context/index.md) | `interface AssertionContext<T>`<br>The receiver of the lambda passed to [Assertion.assert](-assertion/assert.md). This class allows evaluation of the [subject](-assertion-context/subject.md) value, or of composed assertions, ultimately resulting in a call to [pass](-assertion-context/pass.md) or [fail](-assertion-context/fail.md). |
| [ComposedAssertionContext](-composed-assertion-context/index.md) | `interface ComposedAssertionContext`<br>Allows the containing assertion to make decisions about whether it has passed or failed based on the results of composed assertions. |
| [ComposedAssertions](-composed-assertions/index.md) | `class ComposedAssertions<T>`<br>Allows assertions to be composed, or nested. This class is the receiver of the lambda passed to [AssertionContext.compose](-assertion-context/compose.md). |
| [Reportable](-reportable/index.md) | `sealed class Reportable` |
| [Result](-result/index.md) | `data class Result : `[`Reportable`](-reportable/index.md)<br>Represents the result of an assertion or a group of assertions. |
| [Status](-status/index.md) | `enum class Status`<br>The basic state of an assertion result. |
| [Subject](-subject/index.md) | `data class Subject<T> : `[`Reportable`](-reportable/index.md) |

### Exceptions

| Name | Summary |
|---|---|
| [AssertionFailed](-assertion-failed/index.md) | `class AssertionFailed : `[`AssertionError`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-assertion-error/index.html)<br>Thrown to indicate an assertion, or a group or chain of assertions has failed. |

### Functions

| Name | Summary |
|---|---|
| [expect](expect.md) | `fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>`fun <T> expect(subjectDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Start a chain of assertions over [subject](expect.md#strikt.api$expect(strikt.api.expect.T)/subject). This is the entry-point for the assertion API.`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>`fun <T> expect(subjectDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Evaluate a block of assertions over [subject](expect.md#strikt.api$expect(strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject). This is the entry-point for the assertion API. |
| [throws](throws.md) | `fun <E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`<br>`fun <E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`<br>Asserts that [action](throws.md#strikt.api$throws(kotlin.Function0((kotlin.Unit)))/action) throws an exception of type [E](throws.md#E) when executed. |
