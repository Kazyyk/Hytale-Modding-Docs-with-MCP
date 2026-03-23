---
title: "NonEmptyArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonEmptyArrayValidator"
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
public class NonEmptyArrayValidator<T> extends NonNullValidator<T[]>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NonEmptyArrayValidator<?>` | `INSTANCE` | `new NonEmptyArrayValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `NonEmptyArrayValidator()` |
| `public` | `void` | `accept(@Nullable T[] t, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
