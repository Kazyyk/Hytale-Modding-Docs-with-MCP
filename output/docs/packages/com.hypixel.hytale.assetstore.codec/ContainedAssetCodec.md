---
title: "ContainedAssetCodec"
kind: "class"
package: "com.hypixel.hytale.assetstore.codec"
fqcn: "com.hypixel.hytale.assetstore.codec.ContainedAssetCodec"
api_surface: true
extends: "JsonAssetWithMap<K, M>, M extends AssetMap<K, T>>"
implements: ["Codec<K>", "ValidatableCodec<K>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "assetstore"
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.assetstore.codec`

```java
public class ContainedAssetCodec<K, T extends JsonAssetWithMap<K, M>, M extends AssetMap<K, T>> implements Codec<K>, ValidatableCodec<K>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `boolean` | `DISABLE_DIRECT_LOADING` |
| `private final` | `Class<T>` | `assetClass` |
| `private final` | `AssetCodec<K, T>` | `codec` |
| `private final` | `ContainedAssetCodec.Mode` | `mode` |
| `private final` | `Function<AssetExtraInfo<K>, K>` | `keyGenerator` |
| `` | `KeyedCodec<K>` | `parentCodec` |
| `` | `K` | `parentId` |
| `` | `AssetStore<K, T, M>` | `assetStore` |
| `` | `K` | `id` |
| `` | `boolean` | `inheritContainerTags` |
| `` | `Object` | `thisAssetParentId` |
| `` | `T` | `parent` |
| `` | `char[]` | `clone` |
| `` | `Path` | `path` |
| `` | `T` | `asset` |
| `` | `int` | `lineStart` |
| `` | `boolean` | `needsSkip` |
| `` | `Schema` | `keySchema` |
| `` | `Schema` | `nestedSchema` |
| `` | `Schema` | `s` |
| `` | `NONE,
        GENERATE_ID,
        INHERIT_ID,
        INHERIT_ID_AND_PARENT,` | `INJECT_PARENT` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ContainedAssetCodec(Class<T> assetClass, AssetCodec<K, T> codec)` |
| `public` | `ContainedAssetCodec(Class<T> assetClass, AssetCodec<K, T> codec, @Nonnull ContainedAssetCodec.Mode mode)` |
| `public` | `ContainedAssetCodec(Class<T> assetClass, AssetCodec<K, T> codec, @Nonnull ContainedAssetCodec.Mode mode, Function<AssetExtraInfo<K>, K> keyGenerator)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `throw new` | `UnsupportedOperationException("Contained asset mode can't be NONE!")` |
| `` | `public Class<T>` | `getAssetClass()` |
| `public` | `K` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `` | `throw new` | `UnsupportedOperationException("Unable to decode asset from codec used outside of an AssetStore")` |
| `public` | `BsonValue` | `encode(@Nonnull K key, ExtraInfo extraInfo)` |
| `public` | `K` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `public` | `void` | `validate(K k, @Nonnull ExtraInfo extraInfo)` |
| `public` | `void` | `validateDefaults(ExtraInfo extraInfo, @Nonnull Set<Codec<?>> tested)` |

## Inner Types

- `ContainedAssetCodec.Mode`

## Related Types

- [AssetCodec](AssetCodec.md)
