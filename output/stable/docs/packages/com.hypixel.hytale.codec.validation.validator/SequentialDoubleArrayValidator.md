---
title: "SequentialDoubleArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.SequentialDoubleArrayValidator"
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
public class SequentialDoubleArrayValidator implements Validator<double[]>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `SequentialDoubleArrayValidator` | `NEQ_INSTANCE` | `new SequentialDoubleArrayValidator(false)` |
| `public static final` | `SequentialDoubleArrayValidator` | `ALLOW_EQ_INSTANCE` | `new SequentialDoubleArrayValidator(true)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `allowEquals` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `SequentialDoubleArrayValidator(boolean allowEquals)` |
| `public` | `void` | `accept(@Nonnull double[] doubles, @Nonnull ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
