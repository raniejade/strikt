[kirk](../../index.md) / [kirk.api](../index.md) / [ComposedAssertions](index.md) / [expect](./expect.md)

# expect

`fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>`

Start a chain of assertions in the current nested context.

### Parameters

`subject` - the subject of the chain of assertions, usually a property
or element of the subject of the surrounding assertion.

**Return**
an assertion for [subject](expect.md#kirk.api.ComposedAssertions$expect(kirk.api.ComposedAssertions.expect.T)/subject).

`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`T`](expect.md#T)`>`

Evaluate a block of assertions in the current nested context.

### Parameters

`subject` - the subject of the block of assertions, usually a property
or element of the subject of the surrounding assertion.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#kirk.api.ComposedAssertions$expect(kirk.api.ComposedAssertions.expect.T, kotlin.Function1((kirk.api.Assertion((kirk.api.ComposedAssertions.expect.T)), kotlin.Unit)))/subject).

