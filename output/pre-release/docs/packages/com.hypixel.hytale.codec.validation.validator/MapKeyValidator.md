---
title: "MapKeyValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.MapKeyValidator"
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
public class MapKeyValidator<K> implements Validator<Map<K, ?>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<K>` | `key` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MapKeyValidator(Validator<K> key)` |
| `public` | `Validator<K>` | `getKeyValidator()` |
| `public` | `void` | `accept(@Nonnull Map<K, ?> map, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
