---
title: "ReverbEffectPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.reverbeffect"
fqcn: "com.hypixel.hytale.server.core.asset.type.reverbeffect.ReverbEffectPacketGenerator"
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
  - "reverbeffect"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.reverbeffect`

```java
public class ReverbEffectPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Set<String> removed)` |
