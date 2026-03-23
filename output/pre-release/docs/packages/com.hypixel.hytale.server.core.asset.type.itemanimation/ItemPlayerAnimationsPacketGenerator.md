---
title: "ItemPlayerAnimationsPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.itemanimation"
fqcn: "com.hypixel.hytale.server.core.asset.type.itemanimation.ItemPlayerAnimationsPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "itemanimation"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.itemanimation`

```java
public class ItemPlayerAnimationsPacketGenerator extends DefaultAssetPacketGenerator<String, ItemPlayerAnimations>
```

Generates init, update, and remove network packets for `ItemPlayerAnimations` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(DefaultAssetMap<String, ItemPlayerAnimations> assetMap, Map<String, ItemPlayerAnimations> assets)` | `ToClientPacket` | Instance method. |
| `generateUpdatePacket(Map<String, ItemPlayerAnimations> loadedAssets)` | `ToClientPacket` | Instance method. |
| `generateRemovePacket(Set<String> removed)` | `ToClientPacket` | Instance method. |
