[kirk](../../index.md) / [kirk.api](../index.md) / [AssertionContext](index.md) / [fail](./fail.md)

# fail

`fun fail(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Report that the assertion failed.

`fun fail(actualDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, actualValue: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Report that the assertion failed.

### Parameters

`actualDescription` - descriptive text about [actualValue](fail.md#kirk.api.AssertionContext$fail(kotlin.String, kotlin.Any)/actualValue) including a
placeholder in [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) notation for [actualValue](fail.md#kirk.api.AssertionContext$fail(kotlin.String, kotlin.Any)/actualValue).

`actualValue` - the value(s) that violated the assertion.