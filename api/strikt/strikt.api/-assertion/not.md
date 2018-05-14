[strikt](../../index.md) / [strikt.api](../index.md) / [Assertion](index.md) / [not](./not.md)

# not

`fun not(): `[`Assertion`](index.md)`<`[`T`](index.md#T)`>`

Reverses any assertions chained after this method.

``` kotlin
val subject: String? = "covfefe"
expect(subject)
  .not()
  .isNull()
  .isUpperCase()
```

**Return**
an assertion that negates the results of any assertions applied to
its subject.

