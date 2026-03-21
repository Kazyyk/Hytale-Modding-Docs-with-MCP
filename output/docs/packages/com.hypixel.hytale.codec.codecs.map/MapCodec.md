---
title: "MapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.MapCodec"
api_surface: true
extends: "Map<String, V>>"
implements: ["Codec<Map<String, V>>", "WrappedCodec<V>"]
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
public class MapCodec<V, M extends Map<String, V>> implements Codec<Map<String, V>>, WrappedCodec<V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `MapCodec<String, Map<String, String>>` | `STRING_HASH_MAP_CODEC` |
| `private final` | `Codec<V>` | `codec` |
| `private final` | `Supplier<M>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Map<String, V>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `ObjectSchema` | `schema` |
| `` | `Schema` | `childSchema` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MapCodec(Codec<V> codec, Supplier<M> supplier)` |
| `public` | `MapCodec(Codec<V> codec, Supplier<M> supplier, boolean unmodifiable)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<V>` | `getChildCodec()` |
| `` | `public Map<String, V>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var13)` |
| `public` | `BsonValue` | `encode(@Nonnull Map<String, V> map, ExtraInfo extraInfo)` |
| `` | `public Map<String, V>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var9)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
