[strikt](../index.md) / [strikt.assertions](index.md) / [contains](./contains.md)

# contains

`fun <T : `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`> `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains.md#T)`>.contains(expected: `[`Regex`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-regex/index.html)`): `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains.md#T)`>`

Asserts that the subject contains a match for the [expected](contains.md#strikt.assertions$contains(strikt.api.Assertion((strikt.assertions.contains.T)), kotlin.text.Regex)/expected) regular
expression.

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](contains.md#E)`>, E> `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains.md#T)`>.contains(vararg elements: `[`E`](contains.md#E)`): `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains.md#T)`>`

Asserts that all [elements](contains.md#strikt.assertions$contains(strikt.api.Assertion((strikt.assertions.contains.T)), kotlin.Array((strikt.assertions.contains.E)))/elements) are present in the subject.
The elements may exist in any order any number of times and the subject may
contain further elements that were not specified.
If either the subject or [elements](contains.md#strikt.assertions$contains(strikt.api.Assertion((strikt.assertions.contains.T)), kotlin.Array((strikt.assertions.contains.E)))/elements) are empty the assertion always fails.

