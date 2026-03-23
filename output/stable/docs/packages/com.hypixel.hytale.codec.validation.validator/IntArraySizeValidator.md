---
title: "IntArraySizeValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.IntArraySizeValidator"
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
public class IntArraySizeValidator implements Validator<int[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `size` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `IntArraySizeValidator(int size)` |
| `public` | `void` | `accept(@Nonnull int[] array, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
