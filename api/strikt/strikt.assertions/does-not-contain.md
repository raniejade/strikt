[strikt](../index.md) / [strikt.assertions](index.md) / [doesNotContain](./does-not-contain.md)

# doesNotContain

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](does-not-contain.md#E)`>, E> `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](does-not-contain.md#T)`>.doesNotContain(vararg elements: `[`E`](does-not-contain.md#E)`): `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](does-not-contain.md#T)`>`

Asserts that none of [elements](does-not-contain.md#strikt.assertions$doesNotContain(strikt.api.Assertion((strikt.assertions.doesNotContain.T)), kotlin.Array((strikt.assertions.doesNotContain.E)))/elements) are present in the subject.

If [elements](does-not-contain.md#strikt.assertions$doesNotContain(strikt.api.Assertion((strikt.assertions.doesNotContain.T)), kotlin.Array((strikt.assertions.doesNotContain.E)))/elements) is empty the assertion always fails.
If the subject is empty the assertion always passe.

