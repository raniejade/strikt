[kirk](../../index.md) / [kirk.api](../index.md) / [Assertion](index.md) / [map](./map.md)

# map

`fun <R> map(function: `[`T`](index.md#T)`.() -> `[`R`](map.md#R)`): `[`Assertion`](index.md)`<`[`R`](map.md#R)`>`

Maps the assertion subject to the result of [function](map.md#kirk.api.Assertion$map(kotlin.Function1((kirk.api.Assertion.T, kirk.api.Assertion.map.R)))/function).
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

`function` - a lambda whose receiver is the current assertion subject.

**Return**
an assertion whose subject is the value returned by [function](map.md#kirk.api.Assertion$map(kotlin.Function1((kirk.api.Assertion.T, kirk.api.Assertion.map.R)))/function).

