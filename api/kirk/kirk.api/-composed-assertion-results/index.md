[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertionResults](./index.md)

# ComposedAssertionResults

`class ComposedAssertionResults`

The results of assertions made inside the block passed to
[AssertionContext.compose](../-assertion-context/compose.md).

### Properties

| Name | Summary |
|---|---|
| [allFailed](all-failed.md) | `val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if *all* nested assertions evaluated using [AssertionContext.compose](../-assertion-context/compose.md) failed, `false` otherwise. |
| [allPassed](all-passed.md) | `val allPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if *all* nested assertions evaluated using [AssertionContext.compose](../-assertion-context/compose.md) passed, `false` otherwise. |
| [anyFailed](any-failed.md) | `val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if any nested assertions evaluated inside [AssertionContext.compose](../-assertion-context/compose.md) failed, `false` otherwise. |
| [anyPassed](any-passed.md) | `val anyPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if any nested assertions evaluated using [AssertionContext.compose](../-assertion-context/compose.md) passed, `false` otherwise. |

### Functions

| Name | Summary |
|---|---|
| [fail](fail.md) | `fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed. |
| [pass](pass.md) | `fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion succeeded. |
| [results](results.md) | `infix fun results(block: `[`ComposedAssertionResults`](./index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`ComposedAssertionResults`](./index.md)<br>A convenient way to chain a result handler after [AssertionContext.compose](../-assertion-context/compose.md). |
