[strikt](../../index.md) / [strikt.api](../index.md) / [Reportable](./index.md)

# Reportable

`sealed class Reportable`

### Properties

| Name | Summary |
|---|---|
| [allFailed](all-failed.md) | `val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allPassed](all-passed.md) | `val allPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyFailed](any-failed.md) | `val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyPassed](any-passed.md) | `val anyPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [results](results.md) | `val results: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Reportable`](./index.md)`>` |
| [root](root.md) | `val root: `[`Reportable`](./index.md) |
| [status](status.md) | `abstract val status: `[`Status`](../-status/index.md) |

### Functions

| Name | Summary |
|---|---|
| [append](append.md) | `fun append(result: `[`Reportable`](./index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [Result](../-result/index.md) | `data class Result : `[`Reportable`](./index.md)<br>Represents the result of an assertion or a group of assertions. |
| [Subject](../-subject/index.md) | `data class Subject<T> : `[`Reportable`](./index.md) |
