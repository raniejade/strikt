[strikt](../../index.md) / [strikt.api](../index.md) / [ComposedAssertions](index.md) / [expect](./expect.md)

# expect

`fun <E> expect(subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Start a chain of assertions in the current nested context.

### Parameters

`subject` - the subject of the chain of assertions, usually a property
or element of the subject of the surrounding assertion.

**Return**
an assertion for [subject](expect.md#strikt.api.ComposedAssertions$expect(strikt.api.ComposedAssertions.expect.E)/subject).

`fun <E> expect(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`E`](expect.md#E)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Start a chain of assertions in the current nested context.

### Parameters

`description` - a description for [subject](expect.md#strikt.api.ComposedAssertions$expect(kotlin.String, strikt.api.ComposedAssertions.expect.E)/subject) with a [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) style
placeholder for the value itself.

`subject` - the subject of the chain of assertions, usually a property
or element of the subject of the surrounding assertion.

**Return**
an assertion for [subject](expect.md#strikt.api.ComposedAssertions$expect(kotlin.String, strikt.api.ComposedAssertions.expect.E)/subject).

`fun <E> expect(subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Evaluate a block of assertions in the current nested context.

### Parameters

`subject` - the subject of the block of assertions, usually a property
or element of the subject of the surrounding assertion.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#strikt.api.ComposedAssertions$expect(strikt.api.ComposedAssertions.expect.E, kotlin.Function1((strikt.api.Assertion((strikt.api.ComposedAssertions.expect.E)), kotlin.Unit)))/subject).

`fun <E> expect(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`E`](expect.md#E)`, block: `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../-assertion/index.md)`<`[`E`](expect.md#E)`>`

Evaluate a block of assertions in the current nested context.

### Parameters

`description` - a description for [subject](expect.md#strikt.api.ComposedAssertions$expect(kotlin.String, strikt.api.ComposedAssertions.expect.E, kotlin.Function1((strikt.api.Assertion((strikt.api.ComposedAssertions.expect.E)), kotlin.Unit)))/subject) with a [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) style
placeholder for the value itself.

`subject` - the subject of the block of assertions, usually a property
or element of the subject of the surrounding assertion.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#strikt.api.ComposedAssertions$expect(kotlin.String, strikt.api.ComposedAssertions.expect.E, kotlin.Function1((strikt.api.Assertion((strikt.api.ComposedAssertions.expect.E)), kotlin.Unit)))/subject).

