[kirk](../../index.md) / [kirk.api](../index.md) / [AssertionContext](index.md) / [expect](./expect.md)

# expect

`abstract fun <E> expect(subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Start a chain of assertions under the current group.

Simpler assertions will not need this but if you want to make
"sub-assertions" about multiple properties of an object, or all elements of
a collection for example, you can do so with `expect` and then use
[allFailed](all-failed.md), [anyFailed](any-failed.md), [allPassed](all-passed.md) and [anyPassed](any-passed.md) to make a decision
about the overall result.
The results of assertions chained from this method are included under the
overall assertion result.

### Parameters

`subject` - the subject of the chain of assertions, usually a property
or element of the subject of the surrounding assertion.

**Return**
an assertion for [subject](expect.md#kirk.api.AssertionContext$expect(kirk.api.AssertionContext.expect.E)/subject).

`abstract fun <E> expect(subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Evaluate a block of assertions under the current group.

Simpler assertions will not need this but if you want to make
"sub-assertions" about multiple properties of an object, or all elements of
a collection for example, you can do so with `expect` and then use
[allFailed](all-failed.md), [anyFailed](any-failed.md), [allPassed](all-passed.md) and [anyPassed](any-passed.md) to make a decision
about the overall result.
The results of assertions chained from this method are included under the
overall assertion result.

### Parameters

`subject` - the subject of the block of assertions, usually a property
or element of the subject of the surrounding assertion.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#kirk.api.AssertionContext$expect(kirk.api.AssertionContext.expect.E, kotlin.Function1((kirk.api.Assertion((kirk.api.AssertionContext.expect.E)), kotlin.Unit)))/subject).

