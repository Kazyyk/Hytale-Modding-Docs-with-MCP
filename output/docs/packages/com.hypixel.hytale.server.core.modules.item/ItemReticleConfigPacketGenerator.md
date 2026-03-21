---
title: "ItemReticleConfigPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.item"
fqcn: "com.hypixel.hytale.server.core.modules.item.ItemReticleConfigPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator<String, ItemReticleConfig, IndexedLookupTableAssetMap<String, ItemReticleConfig>>"
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
public class ItemReticleConfigPacketGenerator extends SimpleAssetPacketGenerator<String, ItemReticleConfig, IndexedLookupTableAssetMap<String, ItemReticleConfig>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Map<String, ItemReticleConfig> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Map<String, ItemReticleConfig> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Set<String> removed)` |
