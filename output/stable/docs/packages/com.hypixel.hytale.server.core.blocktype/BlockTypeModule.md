---
title: "BlockTypeModule"
kind: "class"
package: "com.hypixel.hytale.server.core.blocktype"
fqcn: "com.hypixel.hytale.server.core.blocktype.BlockTypeModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "plugin"
  - "chunk"
  - "filler-blocks"
---

**Package:** `com.hypixel.hytale.server.core.blocktype`

```java
public class BlockTypeModule extends JavaPlugin
```

Core plugin that manages block type processing within chunks. Handles filler block validation and placement for multi-block structures (blocks whose hitbox spans multiple grid cells), block state initialization on newly generated chunks, and legacy section migration.

On setup, this plugin:
- Registers bench codecs for `Crafting`, `Processing`, `DiagramCrafting`, and `StructuralCrafting` bench types
- Registers the [BlockPhysics](../com.hypixel.hytale.server.core.blocktype.component/BlockPhysics.md) component on the `ChunkStore` registry
- Registers the `MigrateLegacySections` system for legacy chunk data migration

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `public static final` | `int` | `SET_BLOCK_SETTINGS` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_UP` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_DOWN` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_NORTH` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_SOUTH` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_EAST` |
| `public static final` | `String` | `DEBUG_CUBE_TEXTURE_WEST` |
| `public static final` | `String` | `DEBUG_MODEL_MODEL` |
| `public static final` | `String` | `DEBUG_MODEL_BLOCK_TEXTURE` |
| `public static final` | `String` | `DEBUG_MODEL_ENTITY_TEXTURE` |
| `private static` | `BlockTypeModule` | `instance` |
| `private` | `ComponentType<ChunkStore, BlockPhysics>` | `blockPhysicsComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockTypeModule` | `get()` |
| `public` | | `BlockTypeModule(@Nonnull JavaPluginInit init)` |
| `protected` | `void` | `setup()` |
| `public` | `ComponentType<ChunkStore, BlockPhysics>` | `getBlockPhysicsComponentType()` |
| `public static` | `void` | `breakOrSetFillerBlocks(@Nonnull BlockTypeAssetMap<String, BlockType> blockTypeAssetMap, @Nonnull IndexedLookupTableAssetMap<String, BlockBoundingBoxes> hitboxAssetMap, @Nonnull ChunkAccessor<?> accessor, @Nonnull BlockAccessor chunk, int finalX, int finalY, int finalZ, @Nonnull BlockType blockType, int rotation)` |

## Inner Classes

| Modifier | Name | Description |
|---|---|---|
| `private static` | `FixFillerBlocksSystem` | Deprecated system that fixed filler blocks for newly generated chunks by checking neighboring chunks. |
| `private static` | `MigrateLegacySections` | Deprecated migration system that moves legacy `BlockPhysics` data from `BlockSection` to section holders. |

## Related Types

- [BlockPhysics](../com.hypixel.hytale.server.core.blocktype.component/BlockPhysics.md) -- registered component for block physics/support data
- `ItemModule` -- dependency
- `LegacyModule` -- dependency
