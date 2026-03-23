---
title: "AmbienceFXPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.ambiencefx"
fqcn: "com.hypixel.hytale.server.core.asset.type.ambiencefx.AmbienceFXPacketGenerator"
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
  - "ambiencefx"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.ambiencefx`

```java
public class AmbienceFXPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedAssetMap<String,AmbienceFX> assetMap, Map<String,AmbienceFX> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedAssetMap<String,AmbienceFX> assetMap, Map<String,AmbienceFX> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedAssetMap<String,AmbienceFX> assetMap, Set<String> removed)` |
