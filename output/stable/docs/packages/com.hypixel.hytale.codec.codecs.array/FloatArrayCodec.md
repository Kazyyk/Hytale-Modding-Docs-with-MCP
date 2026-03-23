---
title: "FloatArrayCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.array"
fqcn: "com.hypixel.hytale.codec.codecs.array.FloatArrayCodec"
api_surface: false
extends: ~
implements: ["Codec<float[]>", "RawJsonCodec<float[]>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "codec"
  - "codecs"
  - "array"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.array`

```java
public class FloatArrayCodec implements Codec<float[]>, RawJsonCodec<float[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `float[]` | `EMPTY_FLOAT_ARRAY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float[]` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull float[] floats, ExtraInfo extraInfo)` |
| `public` | `float[]` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
