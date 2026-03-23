---
title: "BlockPlacementHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.BlockPlacementHelper"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class BlockPlacementHelper
```

Static utility class for NPC block placement logic. Validates whether blocks can be placed at specified world positions by checking material compatibility and supporting block requirements.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `canPlaceUnitBlock(World world, BlockType placedBlockType, boolean allowEmptyMaterials, int x, int y, int z)` |
| `public static` | `boolean` | `canPlaceBlock( World world, BlockType placedBlockType, int rotationIndex, boolean allowEmptyMaterials, int x, int y, int z )` |
| `public static` | `boolean` | `testBlock(BlockType placedBlockType, BlockType blockType, boolean allowEmptyMaterials)` |
| `public static` | `boolean` | `testSupportingBlock(BlockType blockType, int rotation, int filler)` |
