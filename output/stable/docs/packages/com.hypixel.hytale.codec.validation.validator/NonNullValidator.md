---
title: "NonNullValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonNullValidator"
api_surface: true
extends: null
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
public class NonNullValidator<T> implements Validator<T>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NonNullValidator<?>` | `INSTANCE` | `new NonNullValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `` | `NonNullValidator()` |
| `public` | `void` | `accept(@Nullable T t, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
