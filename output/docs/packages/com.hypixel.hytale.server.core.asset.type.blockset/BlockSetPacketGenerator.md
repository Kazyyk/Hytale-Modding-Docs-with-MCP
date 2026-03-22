---
title: "BlockSetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blockset"
fqcn: "com.hypixel.hytale.server.core.asset.type.blockset.BlockSetPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "blockset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blockset`

```java
public class BlockSetPacketGenerator extends AssetPacketGenerator<String, BlockSet, IndexedLookupTableAssetMap<String, BlockSet>>
```

Generates init, update, and remove network packets for `BlockSet` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(IndexedLookupTableAssetMap<String, BlockSet> assetMap, Map<String, BlockSet> assets)` | `ToClientPacket` | Instance method. |
