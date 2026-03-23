---
title: "BlockBreakingDecalPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blockbreakingdecal"
fqcn: "com.hypixel.hytale.server.core.asset.type.blockbreakingdecal.BlockBreakingDecalPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "blockbreakingdecal"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blockbreakingdecal`

```java
public class BlockBreakingDecalPacketGenerator extends DefaultAssetPacketGenerator<String, BlockBreakingDecal>
```

Generates init, update, and remove network packets for `BlockBreakingDecal` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(DefaultAssetMap<String, BlockBreakingDecal> assetMap, Map<String, BlockBreakingDecal> assets)` | `ToClientPacket` | Instance method. |
| `generateUpdatePacket(Map<String, BlockBreakingDecal> loadedAssets)` | `ToClientPacket` | Instance method. |
| `generateRemovePacket(Set<String> removed)` | `ToClientPacket` | Instance method. |
