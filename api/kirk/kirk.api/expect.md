[kirk](../index.md) / [kirk.api](index.md) / [expect](./expect.md)

# expect

`fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Start a chain of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T)/subject).
This is the entry-point for the assertion API.

### Parameters

`subject` - the subject of the chain of assertions.

**Return**
an assertion for [subject](expect.md#kirk.api$expect(kirk.api.expect.T)/subject).

`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Evaluate a block of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T, kotlin.Function1((kirk.api.Assertion((kirk.api.expect.T)), kotlin.Unit)))/subject).
This is the entry-point for the assertion API.

### Parameters

`subject` - the subject of the block of assertions.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#kirk.api$expect(kirk.api.expect.T, kotlin.Function1((kirk.api.Assertion((kirk.api.expect.T)), kotlin.Unit)))/subject).

