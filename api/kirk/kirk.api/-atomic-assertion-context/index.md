[kirk](../../index.md) / [kirk.api](../index.md) / [AtomicAssertionContext](./index.md)

# AtomicAssertionContext

`interface AtomicAssertionContext<T>`

Allows reporting of success or failure by assertion implementations.

### Properties

| Name | Summary |
|---|---|
| [subject](subject.md) | `abstract val subject: `[`T`](index.md#T)<br>The assertion subject. |

### Functions

| Name | Summary |
|---|---|
| [fail](fail.md) | `abstract fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed. |
| [pass](pass.md) | `abstract fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion succeeded. |

### Inheritors

| Name | Summary |
|---|---|
| [NestedAssertionContext](../-nested-assertion-context/index.md) | `interface NestedAssertionContext<T> : `[`AtomicAssertionContext`](./index.md)`<`[`T`](../-nested-assertion-context/index.md#T)`>`<br>Allows grouping of assertions under a single main assertion and reporting of success or failure. This class is used for more complex assertions such as on all elements of a collection or multiple fields of an object. |
