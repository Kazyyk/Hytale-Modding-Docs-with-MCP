---
title: "RequiredMapKeysValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.RequiredMapKeysValidator"
api_surface: false
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
public class RequiredMapKeysValidator<T> implements Validator<Map<T, ?>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `T[]` | `array` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `RequiredMapKeysValidator(T[] array)` |
| `public` | `void` | `accept(@Nonnull Map<T, ?> map, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
