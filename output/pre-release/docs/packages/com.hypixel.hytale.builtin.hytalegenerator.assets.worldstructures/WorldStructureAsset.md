---
title: "WorldStructureAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.WorldStructureAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "worldstructures"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures`

```java
public abstract class WorldStructureAsset implements Cleanable, JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String,WorldStructureAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<WorldStructureAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public abstract` | `WorldStructure` | `build(WorldStructureAsset.Argument var1)` |
| `@Nonnull public abstract` | `PositionProviderAsset` | `getSpawnPositionsAsset()` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |

## Inner Types

- `WorldStructureAsset.Argument`
