[strikt](../index.md) / [strikt.assertions](index.md) / [any](./any.md)

# any

`fun <T : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](any.md#E)`>, E> `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](any.md#T)`>.any(predicate: `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`E`](any.md#E)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](../strikt.api/-assertion/index.md)`<`[`T`](any.md#T)`>`

Asserts that *at least one* element of the subject pass the assertions in
[predicate](any.md#strikt.assertions$any(strikt.api.Assertion((strikt.assertions.any.T)), kotlin.Function1((strikt.api.Assertion((strikt.assertions.any.E)), kotlin.Unit)))/predicate).

