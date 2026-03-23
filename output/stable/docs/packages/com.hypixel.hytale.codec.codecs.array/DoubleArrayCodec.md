---
title: "DoubleArrayCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.array"
fqcn: "com.hypixel.hytale.codec.codecs.array.DoubleArrayCodec"
api_surface: false
extends: ~
implements: ["Codec<double[]>", "RawJsonCodec<double[]>"]
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
public class DoubleArrayCodec implements Codec<double[]>, RawJsonCodec<double[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double[]` | `EMPTY_DOUBLE_ARRAY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double[]` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull double[] doubles, ExtraInfo extraInfo)` |
| `public` | `double[]` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
