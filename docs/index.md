# ![Strikt](img/logo.png)

Strikt is an assertion library for Kotlin intended for use with a test runner such as [JUnit](https://junit.org/junit5/) or [Spek](http://spekframework.org/).
It's inspired by [AssertJ](https://joel-costigliola.github.io/assertj/), [Atrium](https://robstoll.github.io/atrium/) and [Hamkrest](https://github.com/npryce/hamkrest).
However, none of those provided exactly what I wanted so I decided to create my own.

Strikt gets you…

## Strong typing

Assertion functions can "narrow" the type of the assertion:

```kotlin
val subject: Any? = "The Enlightened take things Lightly"
expect(subject)                // type: Assertion<Any?>
  .isNotNull()                 // type: Assertion<Any>
  .isA<String>()               // type: Assertion<String>
  .matches(Regex("[\\w\\s]+")) // only available on Assertion<CharSequence>
```

Assertions can "map" to properties and method results in a type safe way:

```kotlin
val subject = Pantheon.ERIS
expect(subject)
  .map(Deity::realm)  // type safe reference to a property narrows assertion
  .map { toString() } // narrows assertion to return type of method call
  .isEqualTo("discord and confusion")
```

## Easy "soft" assertions

```kotlin
val subject: "The Enlightened take things Lightly"
expect(subject) {
  hasLength(5)          // fails
  matches(Regex("\d+")) // fails
  startsWith("T")       // still evaluated and passes
}
```

## Useful, structured diagnostics

```
Multiple Failures (2 failures)
	has length 5 : found 35
	matches the regular expression /\d+/
```

## Extensibility

Easy custom assertions:

```kotlin
fun Assertion<LocalDate>.isStTibsDay() =
  assert("is St. Tib's Day") {
    when (MonthDay.from(subject)) {
      MonthDay.of(2, 29) -> pass()
      else               -> fail()
    }
  }

expect(LocalDate.of(2018, 5, 15)).isStTibsDay()
```

With the same diagnostic quality:

```
Expect that 2018-05-15 (1 failure)
    is St. Tib's Day 
```

Easy custom narrowing:

```kotlin
val Assertion<Deity>.realm: Assertion<String>
  get() = map(Deity::realm)

val subject = Pantheon.ERIS
expect(subject).realm.isEqualTo("discord and confusion")
```

## Simple setup 

One dependency. Two imports. Go!

```groovy
repositories { 
  jcenter() 
}

dependencies {
  testCompile "io.strikt:strikt-core:0.6.0"
}
```

```kotlin
import strikt.api.*
import strikt.assertions.*
```

## Simple API, complex capabilities

```kotlin
val subject = Pantheon.values()
expect(subject).any {
  culture.isEqualTo("Grœco-Californian")
  realm.isEqualTo("discord and confusion")
  aliases.contains("Discordia")
}
```

## Detailed reporting

```
▼ Expect that [Eris, Thor]
  ✓ at least one element matches:
    ▼ Expect that Eris
      ▼ .culture "Grœco-Californian"
        ✓ is equal to "Grœco-Californian"
      ▼ .realm "discord and confusion"
        ✓ is equal to "discord and confusion"
      ▼ .aliases ["Ἔρις", "Discordia"]
        ✓ contains the elements ["Discordia"]
          ▼ Expect that ["Ἔρις", "Discordia"]
            ✓ contains "Discordia"
    ▼ Expect that Thor
      ▼ .culture "Norse"
        ✗ is equal to "Grœco-Californian"
      ▼ .realm "thunder"
        ✗ is equal to "discord and confusion"
      ▼ .aliases ["Þórr", "Þunor"]
        ✗ contains the elements ["Discordia"]
          ▼ Expect that ["Þórr", "Þunor"]
            ✗ contains "Discordia"
```