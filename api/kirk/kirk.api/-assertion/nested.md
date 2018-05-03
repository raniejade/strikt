[kirk](../../index.md) / [kirk.api](../index.md) / [Assertion](index.md) / [nested](./nested.md)

# nested

`abstract fun nested(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertions: `[`NestedAssertionContext`](../-nested-assertion-context/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](index.md)`<`[`T`](index.md#T)`>`

Used by assertion implementations to evaluate a group of conditions that
may individually pass or fail and result in the passing or failure of the
overall assertion.

### Parameters

`description` - a description for the overall assertion.

`assertions` - the assertion implementation that should perform a group
of assertions using [NestedAssertionContext.expect](../-nested-assertion-context/expect.md) and finall result in a
call to [NestedAssertionContext.pass](../-atomic-assertion-context/pass.md) or
[NestedAssertionContext.fail](../-atomic-assertion-context/fail.md).

**Return**
this assertion, in order to facilitate a fluent API.

