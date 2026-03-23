---
title: "ItemPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item"
fqcn: "com.hypixel.hytale.server.core.modules.item.ItemPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator<String, Item, DefaultAssetMap<String, Item>>"
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
public class ItemPacketGenerator extends AssetPacketGenerator<String, Item, DefaultAssetMap<String, Item>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Map<String, Item> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Map<String, Item> loadedAssets, @Nonnull AssetUpdateQuery query)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)` |
