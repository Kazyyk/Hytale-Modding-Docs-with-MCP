---
title: "BlockModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block"
fqcn: "com.hypixel.hytale.server.core.modules.block.BlockModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "module"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block`

```java
public class BlockModule extends JavaPlugin
```

Core plugin module for the block entity system. Registers chunk store components (`BlockStateInfo`, `ItemContainerBlock`, `LaunchPad`, `RespawnBlock`, `BlockMapMarker`), their associated systems, spatial indexing for item container blocks, and block entity preprocessing during chunk load. Provides static accessors for looking up block entities by world coordinates.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockModule` | `get()` |
| `public static` | `Ref<ChunkStore>` | `ensureBlockEntity(WorldChunk chunk, int x, int y, int z)` |
| `public static` | `Ref<ChunkStore>` | `getBlockEntity(World world, int x, int y, int z)` |
| `public static` | `<T extends Component<ChunkStore>> T` | `getComponent(ComponentType<ChunkStore, T> componentType, World world, int x, int y, int z)` |

## Instance Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ComponentType<ChunkStore, BlockStateInfo>` | `getBlockStateInfoComponentType()` |
| `public` | `ComponentType<ChunkStore, LaunchPad>` | `getLaunchPadComponentType()` |
| `public` | `ComponentType<ChunkStore, RespawnBlock>` | `getRespawnBlockComponentType()` |
| `public` | `ComponentType<ChunkStore, BlockMapMarker>` | `getBlockMapMarkerComponentType()` |
| `public` | `ComponentType<ChunkStore, ItemContainerBlock>` | `getItemContainerBlockComponentType()` |

## Inner Classes

| Class | Kind | Description |
|---|---|---|
| BlockModule.BlockEntityPreprocessor | class | Thread-local preprocessor for generating block entities during chunk load |
| BlockModule.BlockStateInfo | class | Component tracking a block entity's position within its chunk |
| BlockModule.BlockStateInfoNeedRebuild | class | Resource flag indicating spatial index needs rebuilding |
| BlockModule.BlockStateInfoRefSystem | class | Ref system managing block entity add/remove in chunk component maps |
| BlockModule.ItemContainerStateRefSystem | class | System for item container state tracking |
| BlockModule.MigrateItemContainer | class | Migration system for item container block data |

## Relationships

- Extends `JavaPlugin`
- Manages `ItemContainerBlock` and [BlockReplaceEvent](BlockReplaceEvent.md)
