---
title: "GrowthModifierAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.GrowthModifierAsset"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blocktype"
  - "config"
  - "farming"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.farming`

```java
public abstract class GrowthModifierAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String, GrowthModifierAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<GrowthModifierAsset>` | `ABSTRACT_CODEC` |
| `private static` | `AssetStore<String, GrowthModifierAsset, DefaultAssetMap<String, GrowthModifierAsset>>` | `ASSET_STORE` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `double` | `modifier` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GrowthModifierAsset()` |
| `public` | `GrowthModifierAsset(String id)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, GrowthModifierAsset, DefaultAssetMap<String, GrowthModifierAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, GrowthModifierAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `double` | `getModifier()` |
| `public` | `double` | `getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int x,
        int y,
        int z,
        boolean initialTick)` |
| `@Nonnull @Override public` | `String` | `toString()` |
