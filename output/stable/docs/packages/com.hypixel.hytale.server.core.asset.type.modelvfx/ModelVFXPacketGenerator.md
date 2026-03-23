---
title: "ModelVFXPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.modelvfx"
fqcn: "com.hypixel.hytale.server.core.asset.type.modelvfx.ModelVFXPacketGenerator"
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
  - "modelvfx"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.modelvfx`

```java
public class ModelVFXPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> assets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> loadedAssets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Set<String> removed)` |
