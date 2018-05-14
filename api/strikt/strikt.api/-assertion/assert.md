[strikt](../../index.md) / [strikt.api](../index.md) / [Assertion](index.md) / [assert](./assert.md)

# assert

`fun assert(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, assertion: `[`AssertionContext`](../-assertion-context/index.md)`<`[`T`](index.md#T)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Assertion`](index.md)`<`[`T`](index.md#T)`>`

Evaluates a condition that may pass or fail.

This method can be used directly in a test but is typically used inside an
extension method on `Assertion<T>` such as those provided in the
[strikt.assertions](../../strikt.assertions/index.md) package.

``` kotlin
val subject = Person(
  name = "David",
  birthDate = LocalDate.of(1947, 1, 8)
)

// use assert in a test for a one-off assertion
expect(subject)
  .assert("is older than 21") {
    if (subject.birthDate < LocalDate.now().minus(21, YEARS)) {
      pass()
    } else {
      fail()
    }
  }

// alternatively define a reusable assertion function
fun Assertion<Person>.isOlderThan(age: Int) =
  assert("is older than $age") {
    if (subject.birthDate < LocalDate.now().minus(age.toLong(), YEARS)) {
      pass()
    } else {
      fail()
    }
  }

// which can then be used just like standard assertions
expect(subject).isOlderThan(21)
```

### Parameters

`description` - a description for the condition the assertion evaluates.

`assertion` - the assertion implementation that should result in a call
to [AssertionContext.pass](../-assertion-context/pass.md) or [AssertionContext.fail](../-assertion-context/fail.md).

**Return**
this assertion, in order to facilitate a fluent API.

**See Also**

[AssertionContext.pass](../-assertion-context/pass.md)

[AssertionContext.fail](../-assertion-context/fail.md)

