[kirk](../../index.md) / [kirk.api](../index.md) / [Actual](./index.md)

# Actual

`data class Actual`

A description of the actual value that violated an assertion.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Actual(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?)`<br>A description of the actual value that violated an assertion. |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>a description of the violation with a [String.format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) placeholder for [value](value.md). |
| [value](value.md) | `val value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>the actual value in question. |
