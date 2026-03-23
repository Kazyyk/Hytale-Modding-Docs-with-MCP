---
title: "Int2ObjectMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.Int2ObjectMapCodec"
api_surface: false
extends: "null"
implements: ["Codec<Int2ObjectMap<T>>", "WrappedCodec<T>"]
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
public class Int2ObjectMapCodec<T> implements Codec<Int2ObjectMap<T>>, WrappedCodec<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `valueCodec` |
| `private final` | `Supplier<Int2ObjectMap<T>>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Int2ObjectMap<T>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `int` | `decodedKey` |
| `` | `ObjectIterator` | `var4` |
| `` | `it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry<T>` | `entry` |
| `` | `ObjectSchema` | `s` |
| `` | `StringSchema` | `name` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Int2ObjectMapCodec(Codec<T> valueCodec, Supplier<Int2ObjectMap<T>> supplier, boolean unmodifiable)` |
| `public` | `Int2ObjectMapCodec(Codec<T> valueCodec, Supplier<Int2ObjectMap<T>> supplier)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<T>` | `getChildCodec()` |
| `` | `public Int2ObjectMap<T>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var13)` |
| `public` | `BsonValue` | `encode(@Nonnull Int2ObjectMap<T> map, ExtraInfo extraInfo)` |
| `` | `public Int2ObjectMap<T>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var9)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |

## Related Types

- [MapCodec](MapCodec.md)
- [ObjectMapCodec](ObjectMapCodec.md)
