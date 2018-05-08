[kirk](../../index.md) / [kirk.api](../index.md) / [Result](./index.md)

# Result

`data class Result`

Represents the result of an assertion or a group of assertions.

### Properties

| Name | Summary |
|---|---|
| [assertionCount](assertion-count.md) | `val assertionCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The number of assertions evaluated against [subject](subject.md) |
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The description of the assertion as passed to [Assertion.assert](../-assertion/assert.md). |
| [failureCount](failure-count.md) | `val failureCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The number of assertions that failed. |
| [nestedResults](nested-results.md) | `val nestedResults: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Result`](./index.md)`>`<br>Contains the results of any nested assertions. |
| [passCount](pass-count.md) | `val passCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The number of assertions that passed. |
| [status](status.md) | `val status: `[`Status`](../-status/index.md)<br>The status of the result. |
| [subject](subject.md) | `val subject: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>The subject value of the assertion. |
