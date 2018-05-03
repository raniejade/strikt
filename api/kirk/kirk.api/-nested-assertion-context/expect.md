[kirk](../../index.md) / [kirk.api](../index.md) / [NestedAssertionContext](index.md) / [expect](./expect.md)

# expect

`abstract fun <E> expect(subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Start a chain of assertions under the current group.

### Parameters

`subject` - the subject of the chain of assertions, usually a property
or element of the subject of the surrounding assertion.

**Return**
an assertion for [subject](expect.md#kirk.api.NestedAssertionContext$expect(kirk.api.NestedAssertionContext.expect.E)/subject).

`abstract fun <E> expect(subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Evaluate a block of assertions under the current group.

### Parameters

`subject` - the subject of the block of assertions, usually a property
or element of the subject of the surrounding assertion.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#kirk.api.NestedAssertionContext$expect(kirk.api.NestedAssertionContext.expect.E, kotlin.Function1((kirk.api.Assertion((kirk.api.NestedAssertionContext.expect.E)), kotlin.Unit)))/subject).

