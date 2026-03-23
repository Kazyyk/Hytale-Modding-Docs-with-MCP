---
title: "MergedEnumMapCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.map"
fqcn: "com.hypixel.hytale.codec.codecs.map.MergedEnumMapCodec"
api_surface: false
extends: "Enum<K>, V, M extends Enum<M>>"
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
public class MergedEnumMapCodec<K extends Enum<K>, V, M extends Enum<M>> implements Codec<Map<K, V>>, WrappedCodec<V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Class<K>` | `clazz` |
| `private final` | `K[]` | `enumConstants` |
| `private final` | `String[]` | `enumKeys` |
| `private final` | `Class<M>` | `mergeClazz` |
| `private final` | `M[]` | `mergeEnumConstants` |
| `private final` | `String[]` | `mergeEnumKeys` |
| `private final` | `Function<M, K[]>` | `unmergeFunction` |
| `private final` | `BiFunction<V, V, V>` | `mergeResultFunction` |
| `private final` | `EnumCodec.EnumStyle` | `enumStyle` |
| `private final` | `Codec<V>` | `codec` |
| `private final` | `Supplier<EnumMap<K, V>>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |
| `` | `EnumCodec.EnumStyle` | `currentStyle` |
| `` | `K` | `e` |
| `` | `EnumCodec.EnumStyle` | `currentMergeStyle` |
| `` | `M` | `e` |
| `` | `BsonDocument` | `bsonDocument` |
| `` | `Map<K, V>` | `map` |
| `` | `String` | `key` |
| `` | `BsonValue` | `value` |
| `` | `V` | `decode` |
| `` | `K` | `k` |
| `` | `V` | `v` |
| `` | `K[]` | `mergedEnum` |
| `` | `ObjectSchema` | `schema` |
| `` | `StringSchema` | `values` |
| `` | `Schema` | `childSchema` |
| `` | `Map<String, Schema>` | `properties` |
| `` | `String[]` | `enum_` |
| `` | `String` | `entry` |
| `` | `M` | `m` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz, @Nonnull Class<M> mergeClass, Function<M, K[]> unmergeFunction, BiFunction<V, V, V> mergeResultFunction, Codec<V> codec)` |
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier)` |
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier,
        boolean unmodifiable)` |
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz,
        EnumCodec.EnumStyle enumStyle,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier,
        boolean unmodifiable)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Codec<V>` | `getChildCodec()` |
| `` | `public Map<K, V>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", value, extraInfo, var13)` |
| `` | `private void` | `put0(@Nonnull Map<K, V> map, String key, V decode)` |
| `public` | `BsonValue` | `encode(@Nonnull Map<K, V> map, ExtraInfo extraInfo)` |
| `` | `public Map<K, V>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `` | `throw new` | `CodecException("Failed to decode", reader, extraInfo, var9)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `protected` | `K` | `getEnum(String value)` |
| `` | `protected K[]` | `getMergedEnum(String value)` |

## Related Types

- [EnumMapCodec](EnumMapCodec.md)
- [MapCodec](MapCodec.md)
