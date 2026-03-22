---
title: "FloatCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.FloatCodec"
api_surface: false
extends: ~
implements: ["Codec<Float>", "RawJsonCodec<Float>", "PrimitiveCodec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "codec"
  - "codecs"
  - "simple"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.simple`

```java
public class FloatCodec implements Codec<Float>, RawJsonCodec<Float>, PrimitiveCodec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `STRING_SCHEMA_PATTERN` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Float` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Float t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Float` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable Float def)` |
| `public static` | `float` | `decodeFloat(@Nonnull BsonValue value)` |
| `public static` | `float` | `readFloat(@Nonnull RawJsonReader reader)` |
