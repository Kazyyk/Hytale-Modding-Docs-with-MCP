---
title: "InteractionPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.InteractionPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator<String, Interaction, IndexedLookupTableAssetMap<String, Interaction>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "packet"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

```java
public class InteractionPacketGenerator extends AssetPacketGenerator<String, Interaction, IndexedLookupTableAssetMap<String, Interaction>>
```

Generates `UpdateInteractions` packets for synchronizing `Interaction` assets to clients. Produces init, update, and remove packets mapping interaction IDs to their indexed protocol representations.

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(IndexedLookupTableAssetMap, Map)` | `ToClientPacket` | Creates an init packet with all interactions |
| `generateUpdatePacket(IndexedLookupTableAssetMap, Map, AssetUpdateQuery)` | `ToClientPacket` | Creates an add/update packet for changed interactions |
| `generateRemovePacket(IndexedLookupTableAssetMap, Set, AssetUpdateQuery)` | `ToClientPacket` | Creates a remove packet for deleted interactions |
