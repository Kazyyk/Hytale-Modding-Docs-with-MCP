---
title: "EntityStatTypePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.EntityStatTypePacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entitystats"
  - "network"
  - "packet"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public class EntityStatTypePacketGenerator extends SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>
```

Generates `UpdateEntityStatTypes` network packets for asset synchronization with clients. Supports three packet types: `Init` (full asset dump), `AddOrUpdate` (incremental), and `Remove` (deletions). Each entry maps its asset map index to the protocol representation via `EntityStatType.toPacket()`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Map<String, EntityStatType> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Map<String, EntityStatType> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Set<String> removed)` |
