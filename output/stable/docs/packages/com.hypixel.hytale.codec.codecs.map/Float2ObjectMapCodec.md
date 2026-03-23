---
title: "Float2ObjectMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.Float2ObjectMapCodec"
api_surface: false
extends: "null"
implements: ["Codec<Float2ObjectMap<T>>", "WrappedCodec<T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
  - "map"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.map`

```java
public class Float2ObjectMapCodec<T> implements Codec<Float2ObjectMap<T>>, WrappedCodec<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Pattern` | `FLOAT_PATTERN` |
| `private final` | `Codec<T>` | `valueCodec` |
| `private final` | `Supplier<Float2ObjectMap<T>>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Float2ObjectMap<T>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `float` | `decodedKey` |
| `` | `ObjectIterator` | `var4` |
| `` | `it.unimi.dsi.fastutil.floats.Float2ObjectMap.Entry<T>` | `entry` |
| `` | `ObjectSchema` | `s` |
| `` | `StringSchema` | `name` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Float2ObjectMapCodec(Codec<T> valueCodec, Supplier<Float2ObjectMap<T>> supplier, boolean unmodifiable)` |
| `public` | `Float2ObjectMapCodec(Codec<T> valueCodec, Supplier<Float2ObjectMap<T>> supplier)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<T>` | `getChildCodec()` |
| `` | `public Float2ObjectMap<T>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var13)` |
| `public` | `BsonValue` | `encode(@Nonnull Float2ObjectMap<T> map, ExtraInfo extraInfo)` |
| `` | `public Float2ObjectMap<T>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var9)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |

## Related Types

- [MapCodec](MapCodec.md)
- [ObjectMapCodec](ObjectMapCodec.md)
