---
title: "AssetBuilderCodec"
kind: "class"
package: "com.hypixel.hytale.assetstore.codec"
fqcn: "com.hypixel.hytale.assetstore.codec.AssetBuilderCodec"
api_surface: true
extends: "JsonAsset<K>> extends BuilderCodec<T>"
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
public class AssetBuilderCodec<K, T extends JsonAsset<K>> extends BuilderCodec<T> implements AssetCodec<K, T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `KeyedCodec<Map<String, String[]>>` | `TAGS_CODEC` |
| `private static final` | `String` | `TAG_DOCUMENTATION` |
| `protected final` | `KeyedCodec<K>` | `idCodec` |
| `protected final` | `KeyedCodec<K>` | `parentCodec` |
| `protected final` | `BiConsumer<T, K>` | `idSetter` |
| `protected final` | `BiConsumer<T, AssetExtraInfo.Data>` | `dataSetter` |
| `protected final` | `Function<T, AssetExtraInfo.Data>` | `dataGetter` |
| `` | `T` | `t` |
| `` | `ObjectSchema` | `schema` |
| `` | `KeyedCodec<K>` | `parent` |
| `` | `Schema` | `parentSchema` |
| `` | `Class<? super T>` | `rootClass` |
| `` | `LinkedHashMap<String, Schema>` | `props` |
| `` | `protected final KeyedCodec<K>` | `idCodec` |
| `` | `protected final BiConsumer<T, K>` | `idSetter` |
| `` | `protected final BiConsumer<T, AssetExtraInfo.Data>` | `dataSetter` |
| `` | `protected final Function<T, AssetExtraInfo.Data>` | `dataGetter` |
| `` | `AssetExtraInfo.Data` | `data` |
| `` | `AssetExtraInfo.Data` | `parentData` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `AssetBuilderCodec(@Nonnull AssetBuilderCodec.Builder<K, T> builder)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `KeyedCodec<K>` | `getKeyCodec()` |
| `public` | `KeyedCodec<K>` | `getParentCodec()` |
| `public` | `AssetExtraInfo.Data` | `getData(T t)` |
| `public` | `T` | `decodeJsonAsset(@Nonnull RawJsonReader reader, @Nonnull AssetExtraInfo<K> extraInfo)` |
| `public` | `T` | `decodeAndInheritJsonAsset(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull AssetExtraInfo<K> extraInfo)` |
| `public` | `ObjectSchema` | `toSchema(@Nonnull SchemaContext context)` |
| `public` | `ObjectSchema` | `toSchema(@Nonnull SchemaContext context, @Nullable T def)` |
| `public static` | `<K, T extends JsonAsset<K>> AssetBuilderCodec.Builder<K, T>` | `builder(Class<T> tClass,
        Supplier<T> supplier,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public static` | `<K, T extends JsonAsset<K>> AssetBuilderCodec.Builder<K, T>` | `builder(Class<T> tClass,
        Supplier<T> supplier,
        BuilderCodec<? super T> parentCodec,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public static` | `<K, T extends JsonAsset<K>> AssetBuilderCodec<K, T>` | `wrap(@Nonnull BuilderCodec<T> codec,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `return` | `builder(codec.getInnerClass()` |
| `` | `public` | `Builder(Class<T> tClass,
            Supplier<T> supplier,
            Codec<K> idCodec,
            BiConsumer<T, K> idSetter,
            Function<T, K> idGetter,
            BiConsumer<T, AssetExtraInfo.Data> dataSetter,
            @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `public` | `Builder(Class<T> tClass,
            Supplier<T> supplier,
            BuilderCodec<? super T> parentCodec,
            Codec<K> idCodec,
            BiConsumer<T, K> idSetter,
            Function<T, K> idGetter,
            BiConsumer<T, AssetExtraInfo.Data> dataSetter,
            @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `public AssetBuilderCodec<K, T>` | `build()` |

## Inner Types

- `AssetBuilderCodec.Builder`

## Related Types

- [AssetCodec](AssetCodec.md)
