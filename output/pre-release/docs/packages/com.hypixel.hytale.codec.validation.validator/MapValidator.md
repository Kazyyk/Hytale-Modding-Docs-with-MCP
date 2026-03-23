---
title: "MapValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.MapValidator"
api_surface: false
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
public class MapValidator<K, V> implements Validator<Map<K, V>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<K>` | `key` |
| `private` | `Validator<V>` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MapValidator(Validator<K> key, Validator<V> value)` |
| `public` | `void` | `accept(@Nonnull Map<K, V> map, ValidationResults results)` |
| `public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
