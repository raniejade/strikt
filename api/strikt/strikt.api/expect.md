[strikt](../index.md) / [strikt.api](index.md) / [expect](./expect.md)

# expect

`fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Start a chain of assertions over [subject](expect.md#strikt.api$expect(strikt.api.expect.T)/subject).
This is the entry-point for the assertion API.

### Parameters

`subject` - the subject of the chain of assertions.

**Return**
an assertion for [subject](expect.md#strikt.api$expect(strikt.api.expect.T)/subject).

`fun <T> expect(subjectDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Start a chain of assertions over [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T)/subject).
This is the entry-point for the assertion API.

### Parameters

`subjectDescription` - a description for [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T)/subject) with a [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html)
style placeholder for the value itself.

`subject` - the subject of the chain of assertions.

**Return**
an assertion for [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T)/subject).

`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Evaluate a block of assertions over [subject](expect.md#strikt.api$expect(strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject).
This is the entry-point for the assertion API.

### Parameters

`subject` - the subject of the block of assertions.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#strikt.api$expect(strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject).

`fun <T> expect(subjectDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`

Evaluate a block of assertions over [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject).
This is the entry-point for the assertion API.

### Parameters

`subjectDescription` - a description for [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject) with a [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html)
style placeholder for the value itself.

`subject` - the subject of the block of assertions.

`block` - a closure that can perform multiple assertions that will all
be evaluated regardless of whether preceding ones pass or fail.

**Return**
an assertion for [subject](expect.md#strikt.api$expect(kotlin.String, strikt.api.expect.T, kotlin.Function1((strikt.api.Assertion((strikt.api.expect.T)), kotlin.Unit)))/subject).

