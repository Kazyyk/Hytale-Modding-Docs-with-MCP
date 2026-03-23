---
title: "NonEmptyFloatArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonEmptyFloatArrayValidator"
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
public class NonEmptyFloatArrayValidator implements Validator<float[]>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NonEmptyFloatArrayValidator` | `INSTANCE` | `new NonEmptyFloatArrayValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `NonEmptyFloatArrayValidator()` |
| `public` | `void` | `accept(@Nullable float[] floats, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
