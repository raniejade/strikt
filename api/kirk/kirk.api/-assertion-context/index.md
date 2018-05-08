[kirk](../../index.md) / [kirk.api](../index.md) / [AssertionContext](./index.md)

# AssertionContext

`class AssertionContext<T>`

Allows reporting of success or failure by assertion implementations.

This class is the receiver of the lambda passed to [Assertion.assert](../-assertion/assert.md).

**See Also**

[Assertion.assert](../-assertion/assert.md)

### Properties

| Name | Summary |
|---|---|
| [subject](subject.md) | `val subject: `[`T`](index.md#T)<br>The assertion subject. |

### Functions

| Name | Summary |
|---|---|
| [compose](compose.md) | `fun compose(assertions: `[`ComposedAssertions`](../-composed-assertions/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`ComposedAssertionResults`](../-composed-assertion-results/index.md)<br>Allows an assertion to be composed of multiple sub-assertions such as on fields of an object or elements of a collection. |
| [fail](fail.md) | `fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed. |
| [pass](pass.md) | `fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion succeeded. |
