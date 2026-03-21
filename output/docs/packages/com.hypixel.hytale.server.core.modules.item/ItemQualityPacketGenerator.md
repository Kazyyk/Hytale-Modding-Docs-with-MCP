---
title: "ItemQualityPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item"
fqcn: "com.hypixel.hytale.server.core.modules.item.ItemQualityPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "item"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.item`

```java
public class ItemQualityPacketGenerator extends SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> assets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> loadedAssets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Set<String> removed)` |
