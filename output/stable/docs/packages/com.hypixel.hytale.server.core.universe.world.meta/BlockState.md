---
title: "BlockState"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.BlockState"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "state"
  - "ecs"
  - "chunk"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta`

```java
@Deprecated(forRemoval = true)
public abstract class BlockState implements Component<ChunkStore>
```

Abstract base class for all block states in the world. A block state is an ECS component attached to a specific block position within a `WorldChunk`, stored in the `ChunkStore`. Each block state is associated with a `BlockType` and holds a position (chunk-local coordinates) and an ECS reference. Subclasses implement specific stateful behaviors such as item containers, tickable logic, or network-sendable data.

Block states are serialized via a polymorphic `CodecMapCodec` keyed by a `"Type"` discriminator field. They are registered through [BlockStateModule](BlockStateModule.md) and tracked via [BlockStateRegistration](BlockStateRegistration.md).

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `CodecMapCodec<BlockState>` | Polymorphic codec for serializing/deserializing block states by type key. |
| `BASE_CODEC` | `BuilderCodec<BlockState>` | Base codec encoding the position field. |
| `TYPE_STRUCTURE` | `KeyedCodec<String>` | Codec for the `"Type"` discriminator key. |
| `OPEN_WINDOW` | `String` | Constant `"OpenWindow"`. |
| `CLOSE_WINDOW` | `String` | Constant `"CloseWindow"`. |

## Instance Methods

```java
public void setReference(Ref<ChunkStore> reference)
```

Assigns the ECS reference for this block state. Throws `IllegalArgumentException` if a valid reference is already set.

```java
public Ref<ChunkStore> getReference()
```

```java
public void unloadFromWorld()
```

Clears the chunk association. Throws if the reference is still valid.

```java
public boolean initialize(BlockType blockType)
```

Called when the block state is first loaded or created. Subclasses override to perform initialization. Returns `true` if initialization succeeds.

```java
public void onUnload()
```

Called when the chunk containing this block state is unloaded.

```java
public void validateInitialized()
```

Asserts that this block state has been initialized.

```java
public int getIndex()
```

Returns the block's index within the chunk column, computed from position.

```java
public void setPosition(WorldChunk chunk, @Nullable Vector3i position)
```

Sets the chunk and chunk-local position of this block state. Position X and Z are masked to 0-31.

```java
public void setPosition(@Nonnull Vector3i position)
```

Sets only the position (without changing the chunk reference).

```java
@Nonnull
public Vector3i getPosition()
```

Returns a clone of the chunk-local position.

```java
public int getBlockX()
```

Returns the world X coordinate of this block.

```java
public int getBlockY()
```

Returns the world Y coordinate of this block.

```java
public int getBlockZ()
```

Returns the world Z coordinate of this block.

```java
@Nonnull
public Vector3i getBlockPosition()
```

Returns the world position as a new `Vector3i`.

```java
@Nonnull
public Vector3d getCenteredBlockPosition()
```

Returns the centered world position accounting for block type rotation.

```java
@Nullable
public WorldChunk getChunk()
```

```java
@Nullable
public BlockType getBlockType()
```

Returns the `BlockType` at this block state's position in the chunk.

```java
public int getRotationIndex()
```

Returns the rotation index of the block at this position.

```java
public void markNeedsSave()
```

Marks the containing chunk as needing to be saved.

```java
public BsonDocument saveToDocument()
```

Serializes this block state to a BSON document using the polymorphic codec.

```java
@Nonnull
public Holder<ChunkStore> toHolder()
```

Converts this block state into a detached `Holder` containing all of its ECS components.

## Static Methods

```java
@Nullable
public static BlockState load(BsonDocument doc, @Nonnull WorldChunk chunk, @Nonnull Vector3i pos) throws NoSuchBlockStateException
```

Deserializes a block state from a BSON document, initializes it, and places it at the given position.

```java
@Nullable
@Deprecated
public static BlockState ensureState(@Nonnull WorldChunk worldChunk, int x, int y, int z)
```

Creates and assigns a block state for the block at the given position if the block type defines one.

```java
@Deprecated
public static BlockState getBlockState(@Nullable Ref<ChunkStore> reference, @Nonnull ComponentAccessor<ChunkStore> componentAccessor)
```

Retrieves the `BlockState` component from an ECS reference by searching the archetype for a matching component type.

```java
@Nullable
@Deprecated
public static BlockState getBlockState(int index, @Nonnull ArchetypeChunk<ChunkStore> archetypeChunk)
```

```java
@Nullable
@Deprecated
public static BlockState getBlockState(@Nonnull Holder<ChunkStore> holder)
```

## Related Types

- [BlockStateModule](BlockStateModule.md) -- Plugin that manages block state registration and lifecycle systems.
- [BlockStateRegistration](BlockStateRegistration.md) -- Registration handle for a block state class.
- [BlockStateRegistry](BlockStateRegistry.md) -- Registry facade used by plugins to register block states.
