---
title: "SoundSetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.soundset"
fqcn: "com.hypixel.hytale.server.core.asset.type.soundset.SoundSetPacketGenerator"
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
  - "soundset"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.soundset`

```java
public class SoundSetPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Map<String,SoundSet> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Map<String,SoundSet> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Set<String> removed)` |
