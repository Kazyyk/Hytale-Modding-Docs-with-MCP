---
title: "EqualizerEffectPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.equalizereffect"
fqcn: "com.hypixel.hytale.server.core.asset.type.equalizereffect.EqualizerEffectPacketGenerator"
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
  - "equalizereffect"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.equalizereffect`

```java
public class EqualizerEffectPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,EqualizerEffect> assetMap, Map<String,EqualizerEffect> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,EqualizerEffect> assetMap, Map<String,EqualizerEffect> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,EqualizerEffect> assetMap, Set<String> removed)` |
