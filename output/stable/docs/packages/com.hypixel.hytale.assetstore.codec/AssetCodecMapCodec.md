---
title: "AssetCodecMapCodec"
kind: "class"
package: "com.hypixel.hytale.assetstore.codec"
fqcn: "com.hypixel.hytale.assetstore.codec.AssetCodecMapCodec"
api_surface: true
extends: "JsonAsset<K>> extends StringCodecMapCodec<T, AssetBuilderCodec<K, T>>"
implements: ["AssetCodec<K, T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "assetstore"
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.assetstore.codec`

```java
public class AssetCodecMapCodec<K, T extends JsonAsset<K>> extends StringCodecMapCodec<T, AssetBuilderCodec<K, T>> implements AssetCodec<K, T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `KeyedCodec<K>` | `idCodec` |
| `protected final` | `KeyedCodec<K>` | `parentCodec` |
| `protected final` | `BiConsumer<T, K>` | `idSetter` |
| `protected final` | `Function<T, K>` | `idGetter` |
| `protected final` | `BiConsumer<T, AssetExtraInfo.Data>` | `dataSetter` |
| `protected final` | `Function<T, AssetExtraInfo.Data>` | `dataGetter` |
| `` | `AssetBuilderCodec<K, T>` | `assetCodec` |
| `` | `BsonValue` | `id` |
| `` | `AssetBuilderCodec<K, T>` | `codec` |
| `` | `AssetBuilderCodec<K, T>` | `defaultCodec` |
| `` | `String` | `id` |
| `` | `JsonAsset` | `var7` |
| `` | `JsonAsset` | `var8` |
| `` | `Supplier<T>` | `supplier` |
| `` | `T` | `t` |
| `` | `Schema` | `schema` |
| `` | `AssetBuilderCodec<K, T>` | `def` |
| `` | `Schema` | `idField` |
| `` | `Schema` | `parentField` |
| `` | `AssetBuilderCodec<K, T>` | `bc` |
| `` | `Schema` | `parentSchema` |
| `` | `Schema.InheritSettings` | `settings` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AssetCodecMapCodec(Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public` | `AssetCodecMapCodec(String key,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public` | `AssetCodecMapCodec(Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter,
        boolean allowDefault)` |
| `public` | `AssetCodecMapCodec(String key,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter,
        boolean allowDefault)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `KeyedCodec<K>` | `getKeyCodec()` |
| `public` | `KeyedCodec<K>` | `getParentCodec()` |
| `public` | `AssetExtraInfo.Data` | `getData(T t)` |
| `public` | `AssetCodecMapCodec<K, T>` | `register(@Nonnull String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)` |
| `public` | `AssetCodecMapCodec<K, T>` | `register(@Nonnull Priority priority, @Nonnull String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)` |
| `` | `public T` | `decodeAndInherit(@Nonnull BsonDocument document, T parent, ExtraInfo extraInfo)` |
| `` | `public void` | `decodeAndInherit(@Nonnull BsonDocument document, T t, T parent, ExtraInfo extraInfo)` |
| `` | `public T` | `decodeAndInheritJson(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull ExtraInfo extraInfo)` |
| `` | `public void` | `decodeAndInheritJson(@Nonnull RawJsonReader reader, T t, @Nullable T parent, @Nonnull ExtraInfo extraInfo)` |
| `public` | `T` | `decodeJsonAsset(@Nonnull RawJsonReader reader, @Nonnull AssetExtraInfo<K> extraInfo)` |
| `public` | `T` | `decodeAndInheritJsonAsset(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull AssetExtraInfo<K> extraInfo)` |
| `` | `throw new` | `CodecException("This BuilderCodec is for an abstract or direct codec. To use this codec you must specify an existing object to decode into.")` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `protected` | `void` | `mutateChildSchema(String key, @Nonnull SchemaContext context, BuilderCodec<? extends T> c, @Nonnull ObjectSchema objectSchema)` |

## Related Types

- [AssetBuilderCodec](AssetBuilderCodec.md)
- [AssetCodec](AssetCodec.md)
