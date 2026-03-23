---
title: "FloatArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.FloatArrayValidator"
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
public class FloatArrayValidator implements Validator<float[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Validator<Float>` | `validator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `FloatArrayValidator(Validator<Float> validator)` |
| `public` | `void` | `accept(@Nullable float[] floats, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
