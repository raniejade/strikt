[kirk](../index.md) / [kirk.assertions](index.md) / [contains](./contains.md)

# contains

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](contains.md#E)`>, E> `[`Assertion`](../kirk.api/-assertion/index.md)`<`[`T`](contains.md#T)`>.contains(vararg elements: `[`E`](contains.md#E)`): `[`Assertion`](../kirk.api/-assertion/index.md)`<`[`T`](contains.md#T)`>`

Asserts that all [elements](contains.md#kirk.assertions$contains(kirk.api.Assertion((kirk.assertions.contains.T)), kotlin.Array((kirk.assertions.contains.E)))/elements) are present in the subject.
The elements may exist in any order any number of times and the subject may
contain further elements that were not specified.
If either the subject or [elements](contains.md#kirk.assertions$contains(kirk.api.Assertion((kirk.assertions.contains.T)), kotlin.Array((kirk.assertions.contains.E)))/elements) are empty the assertion always fails.

