---
title: "AudioCategoryPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.audiocategory"
fqcn: "com.hypixel.hytale.server.core.asset.type.audiocategory.AudioCategoryPacketGenerator"
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
  - "audiocategory"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.audiocategory`

```java
public class AudioCategoryPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Set<String> removed)` |
