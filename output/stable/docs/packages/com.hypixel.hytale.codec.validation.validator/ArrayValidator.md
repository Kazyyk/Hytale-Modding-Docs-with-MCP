---
title: "ArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.ArrayValidator"
api_surface: true
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
public class ArrayValidator<T> implements Validator<T[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<T>` | `validator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ArrayValidator(Validator<T> validator)` |
| `public` | `` | `ArrayValidator(LegacyValidator<T> validator)` |
| `public` | `Validator<T>` | `getValidator()` |
| `public` | `void` | `accept(@Nullable T[] ts, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
