[strikt](../../index.md) / [strikt.api](../index.md) / [AssertionContext](index.md) / [fail](./fail.md)

# fail

`abstract fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Report that the assertion failed.

`abstract fun fail(actualDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, actualValue: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Report that the assertion failed providing detail about the actual value
of a comparison that caused the assertion to fail.

### Parameters

`actualDescription` - descriptive text about [actualValue](fail.md#strikt.api.AssertionContext$fail(kotlin.String, kotlin.Any)/actualValue) including a
placeholder in [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) notation for [actualValue](fail.md#strikt.api.AssertionContext$fail(kotlin.String, kotlin.Any)/actualValue).

`actualValue` - theR value(s) that violated the assertion.