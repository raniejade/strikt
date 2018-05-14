[strikt](../index.md) / [strikt.api](index.md) / [throws](./throws.md)

# throws

`inline fun <reified E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(noinline action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`

Asserts that [action](throws.md#strikt.api$throws(kotlin.Function0((kotlin.Unit)))/action) throws an exception of type [E](throws.md#E) when executed.

**Return**
an assertion over the thrown exception, allowing further assertions
about messages, root causes, etc.

`inline fun <reified E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, noinline action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`

Asserts that [action](throws.md#strikt.api$throws(kotlin.String, kotlin.Function0((kotlin.Unit)))/action) throws an exception of type [E](throws.md#E) when executed.

### Parameters

`description` - a description of [action](throws.md#strikt.api$throws(kotlin.String, kotlin.Function0((kotlin.Unit)))/action).

**Return**
an assertion over the thrown exception, allowing further assertions
about messages, root causes, etc.

