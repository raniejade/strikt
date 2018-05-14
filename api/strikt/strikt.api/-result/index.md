[strikt](../../index.md) / [strikt.api](../index.md) / [Result](./index.md)

# Result

`data class Result : `[`Reportable`](../-reportable/index.md)

Represents the result of an assertion or a group of assertions.

### Properties

| Name | Summary |
|---|---|
| [actual](actual.md) | `val actual: `[`Described`](../../strikt.internal/-described/index.md)`<*>?`<br>The actual value or values that violated the assertion. This property is optional as it does not make sense for all types of assertion. However, it can help improve diagnostic messages where it *is* appropriate. |
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>The description of the assertion as passed to [Assertion.assert](../-assertion/assert.md). |
| [status](status.md) | `val status: `[`Status`](../-status/index.md)<br>The status of the result. |

### Inherited Properties

| Name | Summary |
|---|---|
| [allFailed](../-reportable/all-failed.md) | `val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allPassed](../-reportable/all-passed.md) | `val allPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyFailed](../-reportable/any-failed.md) | `val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyPassed](../-reportable/any-passed.md) | `val anyPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [results](../-reportable/results.md) | `val results: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Reportable`](../-reportable/index.md)`>` |
| [root](../-reportable/root.md) | `val root: `[`Reportable`](../-reportable/index.md) |

### Functions

| Name | Summary |
|---|---|
| [fail](fail.md) | `fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun fail(actualDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, actualValue: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [pass](pass.md) | `fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [append](../-reportable/append.md) | `fun append(result: `[`Reportable`](../-reportable/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
