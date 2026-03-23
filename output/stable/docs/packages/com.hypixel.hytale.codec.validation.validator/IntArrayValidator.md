---
title: "IntArrayValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.IntArrayValidator"
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
public class IntArrayValidator implements Validator<int[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<Integer>` | `validator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `IntArrayValidator(Validator<Integer> validator)` |
| `public` | `void` | `accept(@Nonnull int[] is, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
