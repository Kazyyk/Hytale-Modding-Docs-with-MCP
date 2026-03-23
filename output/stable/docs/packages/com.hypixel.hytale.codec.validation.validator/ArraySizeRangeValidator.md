---
title: "ArraySizeRangeValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.ArraySizeRangeValidator"
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
public class ArraySizeRangeValidator<T> implements Validator<T[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `min` |
| `private` | `int` | `max` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ArraySizeRangeValidator(int min, int max)` |
| `public` | `void` | `accept(@Nonnull T[] array, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
