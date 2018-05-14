[strikt](../../index.md) / [strikt.api](../index.md) / [Assertion](index.md) / [map](./map.md)

# map

`fun <R> map(function: `[`T`](index.md#T)`.() -> `[`R`](map.md#R)`): `[`Assertion`](index.md)`<`[`R`](map.md#R)`>`

Maps the assertion subject to the result of [function](map.md#strikt.api.Assertion$map(kotlin.Function1((strikt.api.Assertion.T, strikt.api.Assertion.map.R)))/function).
This is useful for chaining to property values or method call results on
the subject.

If [function](map.md#strikt.api.Assertion$map(kotlin.Function1((strikt.api.Assertion.T, strikt.api.Assertion.map.R)))/function) is a callable reference, (for example a getter or property
reference) the subject description will be automatically determined for the
returned assertion.

``` kotlin
val subject = Person(
  name = "David",
  birthDate = LocalDate.of(1947, 1, 8)
)

expect(subject) {
  map { name }             // map based on properties...
    .isEqualTo("David")
    .map { toUpperCase() } // ... or methods
    .isEqualTo("DAVID")
  map { birthDate }
    .map { year }
    .isEqualTo(1947)
}

expect(subject)
  .map(Person::name)       // map using a property reference
  .isEqualTo("David")
```

### Parameters

`function` - a lambda whose receiver is the current assertion subject.

**Return**
an assertion whose subject is the value returned by [function](map.md#strikt.api.Assertion$map(kotlin.Function1((strikt.api.Assertion.T, strikt.api.Assertion.map.R)))/function).

`fun <R> map(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, function: `[`T`](index.md#T)`.() -> `[`R`](map.md#R)`): `[`Assertion`](index.md)`<`[`R`](map.md#R)`>`

Maps the assertion subject to the result of [function](map.md#strikt.api.Assertion$map(kotlin.String, kotlin.Function1((strikt.api.Assertion.T, strikt.api.Assertion.map.R)))/function).
This is useful for chaining to property values or method call results on
the subject.

``` kotlin
val subject = Person(
  name = "David",
  birthDate = LocalDate.of(1947, 1, 8)
)

expect(subject) {
  map { name }             // map based on properties...
    .isEqualTo("David")
    .map { toUpperCase() } // ... or methods
    .isEqualTo("DAVID")
  map { birthDate }
    .map { year }
    .isEqualTo(1947)
}

expect(subject)
  .map(Person::name)       // map using a property reference
  .isEqualTo("David")
```

### Parameters

`description` - a description of the mapped result.

`function` - a lambda whose receiver is the current assertion subject.

**Return**
an assertion whose subject is the value returned by [function](map.md#strikt.api.Assertion$map(kotlin.String, kotlin.Function1((strikt.api.Assertion.T, strikt.api.Assertion.map.R)))/function).

