---
title: "DoubleArraySizeValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.DoubleArraySizeValidator"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "codec"
  - "validator"
---
**Package:** `com.hypixel.hytale.codec.validation.validator`

```java
public class DoubleArraySizeValidator implements Validator<double[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `size` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `DoubleArraySizeValidator(int size)` |
| `public` | `void` | `accept(@Nonnull double[] array, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
