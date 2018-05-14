[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertions](index.md) / [assert](./assert.md)

# assert

`fun assert(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertion: `[`AssertionContext`](../-assertion-context/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](index.md#T)`>`

Evaluates a composed assertion on the original subject.
This creates a new assertion in the composed context using the same
subject as the overall assertion.
This is useful because it allows for the overall assertion to contain much
more detail in any failure message.

