---
title: "ItemCategoryPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.ItemCategoryPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator<String, ItemCategory>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item`

```java
public class ItemCategoryPacketGenerator extends DefaultAssetPacketGenerator<String, ItemCategory>
```

Concrete implementation extending `DefaultAssetPacketGenerator<String, ItemCategory>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(@Nonnull DefaultAssetMap<String, ItemCategory> assetMap, @Nonnull Map<String, ItemCategory> assets)` | `ToClientPacket` | public method. |
| `generateUpdatePacket(@Nonnull Map<String, ItemCategory> assets)` | `ToClientPacket` | public method. |
| `generateRemovePacket(@Nonnull Set<String> removed)` | `ToClientPacket` | public method. |
