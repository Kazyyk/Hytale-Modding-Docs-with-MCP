---
title: "ValueCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.ui"
fqcn: "com.hypixel.hytale.server.core.ui.ValueCodec"
api_surface: false
extends: ~
implements: ["Codec<Value<T>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.ui`

```java
public class ValueCodec<T> implements Codec<Value<T>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ValueCodec<Object>` | `REFERENCE_ONLY` |
| `public static final` | `ValueCodec<String>` | `STRING` |
| `public static final` | `ValueCodec<LocalizableString>` | `LOCALIZABLE_STRING` |
| `public static final` | `ValueCodec<Integer>` | `INTEGER` |
| `public static final` | `ValueCodec<PatchStyle>` | `PATCH_STYLE` |
| `protected` | `Codec<T>` | `codec` |

## Constructors

| Modifier | Signature |
|---|---|
| `` | `ValueCodec(Codec<T> codec)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Value<T>` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `public` | `BsonValue` | `encode(@Nonnull Value<T> r, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
