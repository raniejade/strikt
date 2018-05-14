[kirk](../../index.md) / [kirk.api](../index.md) / [AssertionFailed](./index.md)

# AssertionFailed

`class AssertionFailed : `[`AssertionError`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-assertion-error/index.html)

Thrown to indicate an assertion, or a group or chain of assertions has
failed.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AssertionFailed(result: `[`Result`](../-result/index.md)`)`<br>Creates an [AssertionFailed](./index.md) exception with a single [result](-init-.md#kirk.api.AssertionFailed$<init>(kirk.api.Result)/result).`AssertionFailed(results: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Result`](../-result/index.md)`>)`<br>Thrown to indicate an assertion, or a group or chain of assertions has failed. |

### Properties

| Name | Summary |
|---|---|
| [assertionCount](assertion-count.md) | `val assertionCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the total number of assertions evaluated. |
| [failureCount](failure-count.md) | `val failureCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the number of assertions that failed. |
| [message](message.md) | `val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the human-readable assertion description. |
| [passCount](pass-count.md) | `val passCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the number of assertions that passed. |
| [results](results.md) | `val results: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Result`](../-result/index.md)`>`<br>the results of the individual assertions that were evaluated. |
