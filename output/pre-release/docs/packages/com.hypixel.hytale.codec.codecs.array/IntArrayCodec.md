---
title: "IntArrayCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.array"
fqcn: "com.hypixel.hytale.codec.codecs.array.IntArrayCodec"
api_surface: false
extends: ~
implements: ["Codec<int[]>", "RawJsonCodec<int[]>"]
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
public class IntArrayCodec implements Codec<int[]>, RawJsonCodec<int[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int[]` | `EMPTY_INT_ARRAY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int[]` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull int[] ints, ExtraInfo extraInfo)` |
| `public` | `int[]` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
