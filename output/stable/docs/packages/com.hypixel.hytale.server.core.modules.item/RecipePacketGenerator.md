---
title: "RecipePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item"
fqcn: "com.hypixel.hytale.server.core.modules.item.RecipePacketGenerator"
api_surface: false
extends: "AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "item"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.item`

```java
public class RecipePacketGenerator extends AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> loadedAssets, @Nonnull AssetUpdateQuery query)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)` |
