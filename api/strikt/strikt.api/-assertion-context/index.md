[strikt](../../index.md) / [strikt.api](../index.md) / [AssertionContext](./index.md)

# AssertionContext

`interface AssertionContext<T>`

The receiver of the lambda passed to [Assertion.assert](../-assertion/assert.md).
This class allows evaluation of the [subject](subject.md) value, or of composed
assertions, ultimately resulting in a call to [pass](pass.md) or [fail](fail.md).

### Properties

| Name | Summary |
|---|---|
| [subject](subject.md) | `abstract val subject: `[`T`](index.md#T)<br>The value that is the subject of the assertion. |

### Functions

| Name | Summary |
|---|---|
| [compose](compose.md) | `abstract fun compose(assertions: `[`ComposedAssertions`](../-composed-assertions/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`ComposedAssertionContext`](../-composed-assertion-context/index.md)<br>Allows an assertion to be composed of multiple sub-assertions such as on fields of an object or elements of a collection. |
| [fail](fail.md) | `abstract fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed.`abstract fun fail(actualDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, actualValue: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed providing detail about the actual value of a comparison that caused the assertion to fail. |
| [pass](pass.md) | `abstract fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion succeeded. |
