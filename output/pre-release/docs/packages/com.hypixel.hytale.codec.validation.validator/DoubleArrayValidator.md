---
title: "DoubleArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.DoubleArrayValidator"
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
public class DoubleArrayValidator implements Validator<double[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<Double>` | `validator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `DoubleArrayValidator(Validator<Double> validator)` |
| `public` | `void` | `accept(@Nonnull double[] ds, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
