[kirk](../../index.md) / [kirk.api](../index.md) / [NestedAssertionContext](./index.md)

# NestedAssertionContext

`interface NestedAssertionContext<T> : `[`AtomicAssertionContext`](../-atomic-assertion-context/index.md)`<`[`T`](index.md#T)`>`

Allows grouping of assertions under a single main assertion and reporting of
success or failure.
This class is used for more complex assertions such as on all elements of a
collection or multiple fields of an object.

This class is the receiver of the lambda passed to [Assertion.nested](../-assertion/nested.md).

**See Also**

[Assertion.nested](../-assertion/nested.md)

### Properties

| Name | Summary |
|---|---|
| [allFailed](all-failed.md) | `abstract val allFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if *all* assertions in this group failed, `false` otherwise. |
| [allSucceeded](all-succeeded.md) | `abstract val allSucceeded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if *all* assertions in this group passed, `false` otherwise. |
| [anyFailed](any-failed.md) | `abstract val anyFailed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if any assertions in this group failed, `false` otherwise. |
| [anySucceeded](any-succeeded.md) | `abstract val anySucceeded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if any assertions in this group passed, `false` otherwise. |

### Inherited Properties

| Name | Summary |
|---|---|
| [subject](../-atomic-assertion-context/subject.md) | `abstract val subject: `[`T`](../-atomic-assertion-context/index.md#T)<br>The assertion subject. |

### Functions

| Name | Summary |
|---|---|
| [expect](expect.md) | `abstract fun <E> expect(subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`<br>Start a chain of assertions under the current group.`abstract fun <E> expect(subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`<br>Evaluate a block of assertions under the current group. |

### Inherited Functions

| Name | Summary |
|---|---|
| [fail](../-atomic-assertion-context/fail.md) | `abstract fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion failed. |
| [pass](../-atomic-assertion-context/pass.md) | `abstract fun pass(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Report that the assertion succeeded. |
