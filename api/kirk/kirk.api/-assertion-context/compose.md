[kirk](../../index.md) / [kirk.api](../index.md) / [AssertionContext](index.md) / [compose](./compose.md)

# compose

`fun compose(assertions: `[`ComposedAssertions`](../-composed-assertions/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`ComposedAssertionResults`](../-composed-assertion-results/index.md)

Allows an assertion to be composed of multiple sub-assertions such as on
fields of an object or elements of a collection.

The results of assertions made inside the [assertions](compose.md#kirk.api.AssertionContext$compose(kotlin.Function1((kirk.api.ComposedAssertions, kotlin.Unit)))/assertions) block are included
under the overall assertion result.

**Return**
the results of assertions made inside the [assertions](compose.md#kirk.api.AssertionContext$compose(kotlin.Function1((kirk.api.ComposedAssertions, kotlin.Unit)))/assertions) block.

