[kirk](../index.md) / [kirk.assertions](index.md) / [containsExactly](./contains-exactly.md)

# containsExactly

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](contains-exactly.md#E)`>, E> `[`Assertion`](../kirk.api/-assertion/index.md)`<`[`T`](contains-exactly.md#T)`>.containsExactly(vararg elements: `[`E`](contains-exactly.md#E)`): `[`Assertion`](../kirk.api/-assertion/index.md)`<`[`T`](contains-exactly.md#T)`>`

Asserts that all [elements](contains-exactly.md#kirk.assertions$containsExactly(kirk.api.Assertion((kirk.assertions.containsExactly.T)), kotlin.Array((kirk.assertions.containsExactly.E)))/elements) *and no others* are present in the subject in the
specified order.

If the subject has no guaranteed iteration order (for example a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) this
assertion is probably not appropriate and you should use
[containsExactlyInAnyOrder](contains-exactly-in-any-order.md) instead.

