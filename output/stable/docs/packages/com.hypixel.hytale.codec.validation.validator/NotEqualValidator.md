---
title: "NotEqualValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NotEqualValidator"
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
public class NotEqualValidator<T extends Comparable<T>> implements Validator<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `T` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `NotEqualValidator(@Nonnull T value)` |
| `public` | `void` | `accept(@Nullable T o, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
