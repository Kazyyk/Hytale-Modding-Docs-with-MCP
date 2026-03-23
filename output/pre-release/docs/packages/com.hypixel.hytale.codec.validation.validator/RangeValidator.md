---
title: "RangeValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.RangeValidator"
api_surface: false
extends: "Comparable"
implements:
  - "Validator"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "codec"
  - "validator"
---
**Package:** `com.hypixel.hytale.codec.validation.validator`

```java
public class RangeValidator<T extends Comparable<T>> implements Validator<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `T` | `min` |
| `private final` | `T` | `max` |
| `private final` | `boolean` | `inclusive` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `RangeValidator(T min, T max, boolean inclusive)` |
| `public` | `void` | `accept(@Nullable T t, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
| `private` | `void` | `updateSchema(Schema target)` |
