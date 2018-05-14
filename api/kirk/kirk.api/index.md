[kirk](../index.md) / [kirk.api](./index.md)

## Package kirk.api

### Types

| Name | Summary |
|---|---|
| [Actual](-actual/index.md) | `data class Actual`<br>A description of the actual value that violated an assertion. |
| [Assertion](-assertion/index.md) | `class Assertion<T>`<br>Holds a subject of type [T](-assertion/index.md#T) that you can then make assertions about. |
| [AssertionContext](-assertion-context/index.md) | `class AssertionContext<T>`<br>Allows reporting of success or failure by assertion implementations. |
| [ComposedAssertionResults](-composed-assertion-results/index.md) | `class ComposedAssertionResults`<br>The results of assertions made inside the block passed to [AssertionContext.compose](-assertion-context/compose.md). |
| [ComposedAssertions](-composed-assertions/index.md) | `class ComposedAssertions<T>`<br>Allows assertions to be composed, or nested, using [AssertionContext.compose](-assertion-context/compose.md). |
| [Result](-result/index.md) | `data class Result`<br>Represents the result of an assertion or a group of assertions. |
| [Status](-status/index.md) | `enum class Status`<br>The basic state of an assertion result. |

### Exceptions

| Name | Summary |
|---|---|
| [AssertionFailed](-assertion-failed/index.md) | `class AssertionFailed : `[`AssertionError`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-assertion-error/index.html)<br>Thrown to indicate an assertion, or a group or chain of assertions has failed. |

### Functions

| Name | Summary |
|---|---|
| [expect](expect.md) | `fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Start a chain of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T)/subject). This is the entry-point for the assertion API.`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Evaluate a block of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T, kotlin.Function1((kirk.api.Assertion((kirk.api.expect.T)), kotlin.Unit)))/subject). This is the entry-point for the assertion API. |
| [throws](throws.md) | `fun <E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`<br>Asserts that [action](throws.md#kirk.api$throws(kotlin.Function0((kotlin.Unit)))/action) throws an exception of type [E](throws.md#E) when executed. |
