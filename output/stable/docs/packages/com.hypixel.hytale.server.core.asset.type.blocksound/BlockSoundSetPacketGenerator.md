---
title: "BlockSoundSetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocksound"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocksound.BlockSoundSetPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blocksound"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocksound`

```java
public class BlockSoundSetPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Set<String> removed)` |
