---
title: "EnumCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs"
fqcn: "com.hypixel.hytale.codec.codecs.EnumCodec"
api_surface: true
extends: null
implements: ["Codec<T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
---

**Package:** `com.hypixel.hytale.codec.codecs`

```java
public class EnumCodec<T extends Enum<T>> implements Codec<T>
```

Codec for serializing and deserializing Enum values.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Class<T>` | `clazz` |
| `@Nonnull private final` | `T[]` | `enumConstants` |
| `@Nonnull private final` | `String[]` | `enumKeys` |
| `private final` | `EnumCodec.EnumStyle` | `enumStyle` |
| `@Nonnull private final` | `EnumMap<T, String>` | `documentation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `EnumCodec(@Nonnull Class<T> clazz)` |
| `public` | | `EnumCodec(@Nonnull Class<T> clazz, EnumCodec.EnumStyle enumStyle)` |
| `@Nonnull public` | `EnumCodec<T>` | `documentKey(T key, String doc)` |
| `@Nonnull public` | `T` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull T r, ExtraInfo extraInfo)` |
| `@Nonnull public` | `T` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable T def)` |
| `@Nullable private` | `T` | `getEnum(String value)` |
