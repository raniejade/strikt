[strikt](../../index.md) / [strikt.api](../index.md) / [Subject](./index.md)

# Subject

`data class Subject<T> : `[`Reportable`](../-reportable/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Subject(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`T`](index.md#T)`)` |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.md) | `val status: `[`Status`](../-status/index.md) |
| [value](value.md) | `val value: `[`T`](index.md#T) |

### Inherited Properties

| Name | Summary |
|---|---|
| [allFailed](../-reportable/all-failed.md) | `val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allPassed](../-reportable/all-passed.md) | `val allPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyFailed](../-reportable/any-failed.md) | `val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [anyPassed](../-reportable/any-passed.md) | `val anyPassed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [results](../-reportable/results.md) | `val results: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Reportable`](../-reportable/index.md)`>` |
| [root](../-reportable/root.md) | `val root: `[`Reportable`](../-reportable/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [append](../-reportable/append.md) | `fun append(result: `[`Reportable`](../-reportable/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
