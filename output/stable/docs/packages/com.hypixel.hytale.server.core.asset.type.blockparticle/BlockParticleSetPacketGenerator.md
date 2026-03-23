---
title: "BlockParticleSetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blockparticle"
fqcn: "com.hypixel.hytale.server.core.asset.type.blockparticle.BlockParticleSetPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "blockparticle"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blockparticle`

```java
public class BlockParticleSetPacketGenerator extends DefaultAssetPacketGenerator<String, BlockParticleSet>
```

Generates init, update, and remove network packets for `BlockParticleSet` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(DefaultAssetMap<String, BlockParticleSet> assetMap, Map<String, BlockParticleSet> assets)` | `ToClientPacket` | Instance method. |
| `generateUpdatePacket(Map<String, BlockParticleSet> loadedAssets)` | `ToClientPacket` | Instance method. |
| `generateRemovePacket(Set<String> removed)` | `ToClientPacket` | Instance method. |
