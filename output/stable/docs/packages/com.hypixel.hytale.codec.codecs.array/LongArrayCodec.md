---
title: "LongArrayCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.array"
fqcn: "com.hypixel.hytale.codec.codecs.array.LongArrayCodec"
api_surface: false
extends: ~
implements: ["Codec<long[]>", "RawJsonCodec<long[]>"]
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
public class LongArrayCodec implements Codec<long[]>, RawJsonCodec<long[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `long[]` | `EMPTY_LONG_ARRAY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `long[]` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull long[] longs, ExtraInfo extraInfo)` |
| `public` | `long[]` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
