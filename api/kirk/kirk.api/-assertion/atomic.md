[kirk](../../index.md) / [kirk.api](../index.md) / [Assertion](index.md) / [atomic](./atomic.md)

# atomic

`abstract fun atomic(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertion: `[`AtomicAssertionContext`](../-atomic-assertion-context/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](index.md)`<`[`T`](index.md#T)`>`

Used by assertion implementations to evaluate a single condition that may
pass or fail.

### Parameters

`description` - a description for the assertion.

`assertion` - the assertion implementation that should result in a call
to [AtomicAssertionContext.pass](../-atomic-assertion-context/pass.md) or [AtomicAssertionContext.fail](../-atomic-assertion-context/fail.md).

**Return**
this assertion, in order to facilitate a fluent API.

