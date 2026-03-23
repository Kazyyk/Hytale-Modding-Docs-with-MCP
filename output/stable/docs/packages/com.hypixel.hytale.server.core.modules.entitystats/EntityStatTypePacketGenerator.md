---
title: "EntityStatTypePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.EntityStatTypePacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "networking"
  - "assets"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public class EntityStatTypePacketGenerator extends SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>
```

Generates `UpdateEntityStatTypes` packets for client synchronization of entity stat type assets. Produces init, update, and remove packets mapping stat indices to their protocol representations.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(IndexedLookupTableAssetMap, Map)` | `ToClientPacket` | Creates an `Init` packet with all stat types and the max ID. |
| `generateUpdatePacket(IndexedLookupTableAssetMap, Map)` | `ToClientPacket` | Creates an `AddOrUpdate` packet for changed stat types. |
| `generateRemovePacket(IndexedLookupTableAssetMap, Set)` | `ToClientPacket` | Creates a `Remove` packet for deleted stat types. |
