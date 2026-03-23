---
title: "BlockGroupPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.BlockGroupPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "blocktype"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype`

```java
public class BlockGroupPacketGenerator extends DefaultAssetPacketGenerator<String, BlockGroup>
```

Generates `UpdateBlockGroups` network packets for synchronizing block group assets to clients. Produces init, update, and remove packets wrapping `BlockGroup.toPacket()` data.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(@Nonnull DefaultAssetMap<String, BlockGroup>, Map<String, BlockGroup>)` | `ToClientPacket` | Creates an `UpdateBlockGroups` packet with `UpdateType.Init` containing all block groups. |
| `generateUpdatePacket(@Nonnull Map<String, BlockGroup>)` | `ToClientPacket` | Creates an `UpdateBlockGroups` packet with `UpdateType.AddOrUpdate` for changed groups. |
| `generateRemovePacket(@Nonnull Set<String>)` | `@Nullable ToClientPacket` | Creates an `UpdateBlockGroups` packet with `UpdateType.Remove`. Returns `null`. |

## Related Types

- `BlockGroup` -- the asset type this generator serializes
- `UpdateBlockGroups` -- the packet type produced
