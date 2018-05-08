[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertionContext](./index.md)

# ComposedAssertionContext

`interface ComposedAssertionContext`

Allows assertions to be composed, or nested, using
[AssertionContext.compose](../-assertion-context/compose.md).

### Functions

| Name | Summary |
|---|---|
| [expect](expect.md) | `abstract fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Start a chain of assertions in the current nested context.`abstract fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Evaluate a block of assertions in the current nested context. |
