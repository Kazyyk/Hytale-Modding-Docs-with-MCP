---
title: "UniqueInArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.UniqueInArrayValidator"
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
public class UniqueInArrayValidator<T> implements Validator<T[]>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `UniqueInArrayValidator<?>` | `INSTANCE` | `new UniqueInArrayValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `UniqueInArrayValidator()` |
| `public` | `void` | `accept(@Nonnull T[] arr, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
