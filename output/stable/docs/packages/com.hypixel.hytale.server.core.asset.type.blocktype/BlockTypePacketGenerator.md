---
title: "BlockTypePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.BlockTypePacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "blocktype"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype`

```java
public class BlockTypePacketGenerator extends AssetPacketGenerator<String, BlockType, BlockTypeAssetMap<String, BlockType>>
```

Generates `UpdateBlockTypes` network packets for synchronizing block type assets to clients. Maps block type string keys to integer indices via `BlockTypeAssetMap` and includes cache rebuild flags from `AssetUpdateQuery`.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(@Nonnull BlockTypeAssetMap, @Nonnull Map)` | `ToClientPacket` | Creates an `UpdateBlockTypes` init packet with all block types indexed by integer ID, plus max ID and full cache rebuild. |
| `generateUpdatePacket(@Nonnull BlockTypeAssetMap, @Nonnull Map, @Nonnull AssetUpdateQuery)` | `ToClientPacket` | Creates an add/update packet with selective cache rebuild flags. Result is wrapped in `CachedPacket`. |
| `generateRemovePacket(@Nonnull BlockTypeAssetMap, @Nonnull Set, @Nonnull AssetUpdateQuery)` | `ToClientPacket` | Creates a remove packet with block type stubs (name only). Wrapped in `CachedPacket`. |

## Related Types

- `BlockType` -- the asset type this generator serializes
- `UpdateBlockTypes` -- the packet type produced
- `BlockTypeAssetMap` -- provides string-to-integer key mapping
