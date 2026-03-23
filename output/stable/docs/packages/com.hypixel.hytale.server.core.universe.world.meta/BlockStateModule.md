---
title: "BlockStateModule"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.BlockStateModule"
api_surface: true
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "state"
  - "module"
  - "plugin"
  - "ecs"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta`

```java
@Deprecated(forRemoval = true)
public class BlockStateModule extends JavaPlugin
```

Server plugin responsible for registering and managing block state types within the ECS. Provides the bridge between the polymorphic `BlockState.CODEC` system and the ECS component registry. When a block state class is registered, this module creates the corresponding `ComponentType`, installs lifecycle systems (late-init, holder, ref, ticking, and packet systems), and registers codec entries for serialization.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `MANIFEST` | `PluginManifest` | Plugin manifest declaring dependency on `BlockModule`. |

## Static Methods

```java
public static BlockStateModule get()
```

Returns the singleton instance.

## Instance Methods

```java
@Nullable
public <T extends BlockState> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec)
```

Registers a block state class with the given codec key. Installs ECS component type, lifecycle systems, and codec entries.

```java
@Nullable
public <T extends BlockState, D extends StateData> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, @Nullable Codec<T> codec, Class<D> dataClass, @Nullable Codec<D> dataCodec)
```

Registers a block state class along with its associated `StateData` class and codec.

```java
public <T extends BlockState, D extends StateData> void unregisterBlockState(Class<T> clazz, @Nullable Class<D> dataClass)
```

Unregisters a block state class and its data class. Skipped during server shutdown.

```java
@Nullable
public <T extends BlockState> T createBlockState(Class<T> clazz, WorldChunk chunk, Vector3i pos, BlockType blockType)
```

Creates a new block state instance by class, placing it at the given position.

```java
@Nullable
public BlockState createBlockState(String key, WorldChunk chunk, Vector3i pos, BlockType blockType)
```

Creates a new block state instance by codec key.

```java
@Nullable
public <T extends BlockState> ComponentType<ChunkStore, T> getComponentType(@Nullable Class<T> entityClass)
```

Returns the ECS component type for the given block state class.

```java
public ResourceType<ChunkStore, SpatialResource<Ref<ChunkStore>, ChunkStore>> getItemContainerSpatialResourceType()
```

Returns the spatial resource type used for `ItemContainerState` spatial indexing.

## Inner Classes

- `ItemContainerStateRefSystem` -- `RefSystem` that marks the block state info as needing rebuild when `ItemContainerState` entities are added or removed.
- `LegacyBlockStateHolderSystem<T>` -- `HolderSystem` handling removal lifecycle (destroy, unload) for block state entities.
- `LegacyBlockStateRefSystem<T>` -- `RefSystem` handling reference assignment and late initialization.
- `LegacyLateInitBlockStateSystem<T>` -- `EntityTickingSystem` performing deferred initialization for block states loaded alongside `BlockStateInfo`.
- `LegacyLoadPacketBlockStateSystem<T>` -- Sends block state data packets to players on chunk load.
- `LegacyTickingBlockStateSystem<T>` -- `EntityTickingSystem` dispatching `tick()` to `TickableBlockState` instances.
- `LegacyUnloadPacketBlockStateSystem<T>` -- Sends unload packets to players on chunk unload.
