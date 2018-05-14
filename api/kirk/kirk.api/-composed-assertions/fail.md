[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertions](index.md) / [fail](./fail.md)

# fail

`fun fail(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Sometimes you just need to fail with a description.
This method lets you do that.
It's useful when you want to test for a condition in a composed assertion
for which there's no applicable description for a "passing" state.

### Parameters

`description` - a description for the failure.