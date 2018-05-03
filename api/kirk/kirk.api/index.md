[kirk](../index.md) / [kirk.api](./index.md)

## Package kirk.api

### Types

| Name | Summary |
|---|---|
| [Assertion](-assertion/index.md) | `interface Assertion<T>`<br>Holds a subject of type [T](-assertion/index.md#T) that you can then make assertions about. |
| [AtomicAssertionContext](-atomic-assertion-context/index.md) | `interface AtomicAssertionContext<T>`<br>Allows reporting of success or failure by assertion implementations. |
| [NestedAssertionContext](-nested-assertion-context/index.md) | `interface NestedAssertionContext<T> : `[`AtomicAssertionContext`](-atomic-assertion-context/index.md)`<`[`T`](-nested-assertion-context/index.md#T)`>`<br>Allows grouping of assertions under a single main assertion and reporting of success or failure. This class is used for more complex assertions such as on all elements of a collection or multiple fields of an object. |

### Functions

| Name | Summary |
|---|---|
| [expect](expect.md) | `fun <T> expect(subject: `[`T`](expect.md#T)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Start a chain of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T)/subject). This is the entry-point for the assertion API.`fun <T> expect(subject: `[`T`](expect.md#T)`, block: `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`T`](expect.md#T)`>`<br>Evaluate a block of assertions over [subject](expect.md#kirk.api$expect(kirk.api.expect.T, kotlin.Function1((kirk.api.Assertion((kirk.api.expect.T)), kotlin.Unit)))/subject). This is the entry-point for the assertion API. |
| [throws](throws.md) | `fun <E : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> throws(action: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](-assertion/index.md)`<`[`E`](throws.md#E)`>`<br>Asserts that [action](throws.md#kirk.api$throws(kotlin.Function0((kotlin.Unit)))/action) throws an exception of type [E](throws.md#E) when executed. |
