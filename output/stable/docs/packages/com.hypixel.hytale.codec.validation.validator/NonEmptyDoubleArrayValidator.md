---
title: "NonEmptyDoubleArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.NonEmptyDoubleArrayValidator"
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
public class NonEmptyDoubleArrayValidator implements Validator<double[]>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `NonEmptyDoubleArrayValidator` | `INSTANCE` | `new NonEmptyDoubleArrayValidator()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `NonEmptyDoubleArrayValidator()` |
| `public` | `void` | `accept(@Nullable double[] doubles, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
