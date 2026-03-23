---
title: "RootInteractionPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.RootInteractionPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator<String, RootInteraction, IndexedLookupTableAssetMap<String, RootInteraction>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "packet"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

```java
public class RootInteractionPacketGenerator extends AssetPacketGenerator<String, RootInteraction, IndexedLookupTableAssetMap<String, RootInteraction>>
```

Generates `UpdateRootInteractions` packets for synchronizing `RootInteraction` assets to clients. Produces init, update, and remove packets mapping root interaction IDs to their indexed protocol representations.

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(IndexedLookupTableAssetMap, Map)` | `ToClientPacket` | Creates an init packet with all root interactions |
| `generateUpdatePacket(IndexedLookupTableAssetMap, Map, AssetUpdateQuery)` | `ToClientPacket` | Creates an add/update packet for changed root interactions |
| `generateRemovePacket(IndexedLookupTableAssetMap, Set, AssetUpdateQuery)` | `ToClientPacket` | Creates a remove packet for deleted root interactions |
