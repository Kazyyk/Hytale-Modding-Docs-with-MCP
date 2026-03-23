---
title: "MapValueValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.MapValueValidator"
api_surface: true
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
public class MapValueValidator<V> implements Validator<Map<?, V>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<V>` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MapValueValidator(Validator<V> value)` |
| `public` | `Validator<V>` | `getValueValidator()` |
| `public` | `void` | `accept(@Nonnull Map<?, V> map, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
