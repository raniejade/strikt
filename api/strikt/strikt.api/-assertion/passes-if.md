[strikt](../../index.md) / [strikt.api](../index.md) / [Assertion](index.md) / [passesIf](./passes-if.md)

# passesIf

`fun passesIf(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertion: `[`T`](index.md#T)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Assertion`](index.md)`<`[`T`](index.md#T)`>`

Evaluates a boolean condition.
This is useful for implementing the simplest types of assertion function.

### Parameters

`description` - a description for the condition the assertion evaluates.

`assertion` - a function that returns `true` (the assertion passes) or
`false` (the assertion fails).

**Return**
this assertion, in order to facilitate a fluent API.

