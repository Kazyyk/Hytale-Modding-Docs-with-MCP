---
title: "Object2IntMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.Object2IntMapCodec"
api_surface: false
extends: "null"
implements: ["Codec<Object2IntMap<T>>", "WrappedCodec<T>"]
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
public class Object2IntMapCodec<T> implements Codec<Object2IntMap<T>>, WrappedCodec<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `keyCodec` |
| `private final` | `Supplier<Object2IntMap<T>>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Object2IntMap<T>` | `map` |
| `` | `T` | `decodedKey` |
| `` | `ObjectIterator` | `var4` |
| `` | `T` | `key` |
| `` | `String` | `encodedKey` |
| `` | `ObjectSchema` | `s` |
| `` | `StringSchema` | `key` |
| `` | `String` | `title` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Object2IntMapCodec(Codec<T> keyCodec, Supplier<Object2IntMap<T>> supplier, boolean unmodifiable)` |
| `public` | `Object2IntMapCodec(Codec<T> keyCodec, Supplier<Object2IntMap<T>> supplier)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<T>` | `getChildCodec()` |
| `` | `public Object2IntMap<T>` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `public` | `BsonValue` | `encode(@Nonnull Object2IntMap<T> map, ExtraInfo extraInfo)` |
| `` | `public Object2IntMap<T>` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |

## Related Types

- [MapCodec](MapCodec.md)
