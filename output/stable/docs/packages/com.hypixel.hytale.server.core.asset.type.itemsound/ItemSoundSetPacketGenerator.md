---
title: "ItemSoundSetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.itemsound"
fqcn: "com.hypixel.hytale.server.core.asset.type.itemsound.ItemSoundSetPacketGenerator"
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
  - "itemsound"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.itemsound`

```java
public class ItemSoundSetPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Set<String> removed)` |
