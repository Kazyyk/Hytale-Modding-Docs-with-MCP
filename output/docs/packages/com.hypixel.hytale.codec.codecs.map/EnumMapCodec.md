---
title: "EnumMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.EnumMapCodec"
api_surface: false
extends: "Enum<K>, V>"
implements: ["Codec<Map<K, V>>", "WrappedCodec<V>"]
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
public class EnumMapCodec<K extends Enum<K>, V> implements Codec<Map<K, V>>, WrappedCodec<V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Class<K>` | `clazz` |
| `private final` | `K[]` | `enumConstants` |
| `private final` | `String[]` | `enumKeys` |
| `private final` | `EnumCodec.EnumStyle` | `enumStyle` |
| `private final` | `Codec<V>` | `codec` |
| `private final` | `Supplier<Map<K, V>>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `private final` | `EnumMap<K, String>` | `keyDocumentation` |
| `` | `EnumCodec.EnumStyle` | `currentStyle` |
| `` | `K` | `e` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Map<K, V>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `K` | `enumKey` |
| `` | `ObjectSchema` | `schema` |
| `` | `StringSchema` | `values` |
| `` | `Map<String, Schema>` | `properties` |
| `` | `Schema` | `childSchema` |
| `` | `Schema` | `subSchema` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `EnumMapCodec(@Nonnull Class<K> clazz, Codec<V> codec)` |
| `public` | `EnumMapCodec(@Nonnull Class<K> clazz, Codec<V> codec, boolean unmodifiable)` |
| `public` | `EnumMapCodec(@Nonnull Class<K> clazz, Codec<V> codec, Supplier<Map<K, V>> supplier)` |
| `public` | `EnumMapCodec(@Nonnull Class<K> clazz, Codec<V> codec, Supplier<Map<K, V>> supplier, boolean unmodifiable)` |
| `public` | `EnumMapCodec(@Nonnull Class<K> clazz, EnumCodec.EnumStyle enumStyle, Codec<V> codec, Supplier<Map<K, V>> supplier, boolean unmodifiable)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `EnumMapCodec<K, V>` | `documentKey(K key, String doc)` |
| `public` | `Codec<V>` | `getChildCodec()` |
| `` | `public Map<K, V>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var14)` |
| `public` | `BsonValue` | `encode(@Nonnull Map<K, V> map, ExtraInfo extraInfo)` |
| `` | `public Map<K, V>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var10)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `protected` | `K` | `getEnum(String value)` |

## Related Types

- [MapCodec](MapCodec.md)
