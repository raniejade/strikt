[strikt](../index.md) / [strikt.assertions](index.md) / [containsExactlyInAnyOrder](./contains-exactly-in-any-order.md)

# containsExactlyInAnyOrder

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](contains-exactly-in-any-order.md#E)`>, E> `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains-exactly-in-any-order.md#T)`>.containsExactlyInAnyOrder(vararg elements: `[`E`](contains-exactly-in-any-order.md#E)`): `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](contains-exactly-in-any-order.md#T)`>`

Asserts that all [elements](contains-exactly-in-any-order.md#strikt.assertions$containsExactlyInAnyOrder(strikt.api.Assertion((strikt.assertions.containsExactlyInAnyOrder.T)), kotlin.Array((strikt.assertions.containsExactlyInAnyOrder.E)))/elements) *and no others* are present in the subject.
Order is not evaluated, so an assertion on a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) will pass so long as it
contains all the same elements with the same cardinality as [elements](contains-exactly-in-any-order.md#strikt.assertions$containsExactlyInAnyOrder(strikt.api.Assertion((strikt.assertions.containsExactlyInAnyOrder.T)), kotlin.Array((strikt.assertions.containsExactlyInAnyOrder.E)))/elements)
regardless of what order they appear in.

