[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertions](./index.md)

# ComposedAssertions

`class ComposedAssertions<T>`

Allows assertions to be composed, or nested, using
[AssertionContext.compose](../-assertion-context/compose.md).

### Functions

| Name | Summary |
|---|---|
| [assert](assert.md) | `fun assert(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertion: `[`AssertionContext`](../-assertion-context/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](index.md#T)`>`<br>Evaluates a composed assertion on the original subject. This creates a new assertion in the composed context using the same subject as the overall assertion. This is useful because it allows for the overall assertion to contain much more detail in any failure message. |
| [expect](expect.md) | `fun <E> expect(subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`<br>Start a chain of assertions in the current nested context.`fun <E> expect(subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`<br>Evaluate a block of assertions in the current nested context. |
