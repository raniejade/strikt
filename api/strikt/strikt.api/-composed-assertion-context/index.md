[strikt](../../index.md) / [strikt.api](../index.md) / [ComposedAssertionContext](./index.md)

# ComposedAssertionContext

`interface ComposedAssertionContext`

Allows the containing assertion to make decisions about whether it has passed
or failed based on the results of composed assertions.

**See Also**

[AssertionContext.compose](../-assertion-context/compose.md)

### Properties

| Name | Summary |
|---|---|
| [allFailed](all-failed.md) | `abstract val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allPassed](all-passed.md) | `abstract val allPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyFailed](any-failed.md) | `abstract val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyPassed](any-passed.md) | `abstract val anyPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| Name | Summary |
|---|---|
| [fail](fail.md) | `abstract fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [pass](pass.md) | `abstract fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [then](then.md) | `open infix fun then(block: `[`ComposedAssertionContext`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>A convenient way to handle to composed assertion results. Chain a call to this method after [AssertionContext.compose](../-assertion-context/compose.md) in order to handle the composed assertion results. |
