---
title: "BlockModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block"
fqcn: "com.hypixel.hytale.server.core.modules.block.BlockModule"
api_surface: false
extends: "com.hypixel.hytale.server.core.plugin.JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "module"
  - "plugin"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.block`

```java
public class BlockModule extends JavaPlugin
```

Server plugin responsible for block-level ECS components and systems. Registers `ChunkStore` component types for block state information, launch pads, respawn blocks, and block map markers. Also handles entity creation for block entities on chunk load and provides static utilities for looking up block components by world position.

## Fields

| Field | Type | Description |
|---|---|---|
| `MANIFEST` | `PluginManifest` | Core plugin manifest; depends on `LegacyModule`. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `get()` | `BlockModule` | Returns the singleton instance. |
| `ensureBlockEntity(WorldChunk chunk, int x, int y, int z)` | `Ref<ChunkStore>` | Deprecated. Ensures a block entity exists at the given position, creating one from the block type's definition if needed. |
| `getBlockEntity(World world, int x, int y, int z)` | `Ref<ChunkStore>` | Returns the block entity reference at the given world coordinates, or null. |
| `getComponent(ComponentType<ChunkStore, T> componentType, World world, int x, int y, int z)` | `T` | Returns a specific component from the block entity at the given world coordinates. |
| `getMigrationSystemType()` | `SystemType<ChunkStore, MigrationSystem>` | Returns the migration system type. |
| `getBlockStateInfoComponentType()` | `ComponentType<ChunkStore, BlockStateInfo>` | Returns the block state info component type. |
| `getLaunchPadComponentType()` | `ComponentType<ChunkStore, LaunchPad>` | Returns the launch pad component type. |
| `getRespawnBlockComponentType()` | `ComponentType<ChunkStore, RespawnBlock>` | Returns the respawn block component type. |
| `getBlockMapMarkerComponentType()` | `ComponentType<ChunkStore, BlockMapMarker>` | Returns the block map marker component type. |
| `getBlockMapMarkersResourceType()` | `ResourceType<ChunkStore, BlockMapMarkersResource>` | Returns the block map markers resource type. |
| `getBlockStateInfoNeedRebuildResourceType()` | `ResourceType<ChunkStore, BlockStateInfoNeedRebuild>` | Returns the block state info rebuild resource type. |

## Inner Classes

### BlockStateInfo

```java
public static class BlockStateInfo implements Component<ChunkStore>
```

ECS component linking a block entity to its chunk position. Stores a block index and a reference to the parent chunk.

### BlockStateInfoNeedRebuild

```java
public static class BlockStateInfoNeedRebuild implements Resource<ChunkStore>
```

ECS resource flag indicating whether block state info needs rebuilding. Provides `markAsNeedRebuild()` and `invalidateAndReturnIfNeedRebuild()`.

### BlockStateInfoRefSystem

```java
public static class BlockStateInfoRefSystem extends RefSystem<ChunkStore>
```

ECS ref system that manages block entity references within `BlockComponentChunk` when entities are added or removed.

### MigrationSystem

```java
public abstract static class MigrationSystem extends HolderSystem<ChunkStore>
```

Abstract base for block data migration systems.

### MigrateLaunchPad

```java
@Deprecated(forRemoval = true)
public static class MigrateLaunchPad extends MigrationSystem
```

Deprecated migration system that moves legacy `launchPad` unknown component data into the typed `LaunchPad` component.
