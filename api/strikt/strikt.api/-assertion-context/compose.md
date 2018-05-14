[strikt](../../index.md) / [strikt.api](../index.md) / [AssertionContext](index.md) / [compose](./compose.md)

# compose

`abstract fun compose(assertions: `[`ComposedAssertions`](../-composed-assertions/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`ComposedAssertionContext`](../-composed-assertion-context/index.md)

Allows an assertion to be composed of multiple sub-assertions such as on
fields of an object or elements of a collection.

The results of assertions made inside the [assertions](compose.md#strikt.api.AssertionContext$compose(kotlin.Function1((strikt.api.ComposedAssertions((strikt.api.AssertionContext.T)), kotlin.Unit)))/assertions) block are included
under the overall assertion result.

**Return**
the results of assertions made inside the [assertions](compose.md#strikt.api.AssertionContext$compose(kotlin.Function1((strikt.api.ComposedAssertions((strikt.api.AssertionContext.T)), kotlin.Unit)))/assertions) block.

