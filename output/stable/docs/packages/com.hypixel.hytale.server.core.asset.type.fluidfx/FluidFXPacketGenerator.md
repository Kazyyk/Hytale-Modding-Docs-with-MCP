---
title: "FluidFXPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluidfx"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluidfx.FluidFXPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "fluidfx"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluidfx`

```java
public class FluidFXPacketGenerator extends SimpleAssetPacketGenerator<String, FluidFX, IndexedLookupTableAssetMap<String, FluidFX>>
```

Generates init, update, and remove network packets for `FluidFX` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Map<String, FluidFX> assets)` | `ToClientPacket` | Instance method. |
| `generateUpdatePacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Map<String, FluidFX> loadedAssets)` | `ToClientPacket` | Instance method. |
| `generateRemovePacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Set<String> removed)` | `ToClientPacket` | Instance method. |
