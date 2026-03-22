---
title: "ObjectMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.ObjectMapCodec"
api_surface: false
extends: "Map<K, V>>"
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
public class ObjectMapCodec<K, V, M extends Map<K, V>> implements Codec<Map<K, V>>, WrappedCodec<V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<V>` | `codec` |
| `private final` | `Supplier<M>` | `supplier` |
| `private final` | `Function<K, String>` | `keyToString` |
| `private final` | `Function<String, K>` | `stringToKey` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Map<K, V>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `K` | `decodedKey` |
| `` | `ObjectSchema` | `s` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ObjectMapCodec(Codec<V> codec, Supplier<M> supplier, Function<K, String> keyToString, Function<String, K> stringToKey)` |
| `public` | `ObjectMapCodec(Codec<V> codec, Supplier<M> supplier, Function<K, String> keyToString, Function<String, K> stringToKey, boolean unmodifiable)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<V>` | `getChildCodec()` |
| `` | `public Map<K, V>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var14)` |
| `public` | `BsonValue` | `encode(@Nonnull Map<K, V> map, ExtraInfo extraInfo)` |
| `` | `public Map<K, V>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var10)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |

## Related Types

- [MapCodec](MapCodec.md)
