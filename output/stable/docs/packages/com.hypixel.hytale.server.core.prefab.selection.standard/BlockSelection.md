---
title: "BlockSelection"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.standard"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.standard.BlockSelection"
api_surface: false
extends: ~
implements:
  - "NetworkSerializable<EditorBlocksChange>"
  - "MetricProvider"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "prefab"
  - "selection"
  - "blocks"
  - "editor"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.standard`

```java
public class BlockSelection implements NetworkSerializable<EditorBlocksChange>, MetricProvider
```

A mutable, thread-safe container representing a selection of blocks, fluids, and entities in a world region. Used by the prefab and editor systems for copy, paste, rotate, flip, and placement operations. Stores blocks as packed `long` coordinates mapped to `BlockHolder` records, fluids as packed coordinates mapped to `FluidHolder` records, and entities as `Holder<EntityStore>` instances with relative `TransformComponent` positions.

All block and fluid access is guarded by a `ReentrantReadWriteLock` (`blocksLock`), and entity access by a separate `ReentrantReadWriteLock` (`entitiesLock`).

Implements `NetworkSerializable<EditorBlocksChange>` for serialization to editor preview packets and `MetricProvider` for diagnostic metrics.

## Constants

```java
public static final Consumer<Ref<EntityStore>> DEFAULT_ENTITY_CONSUMER = ref -> {}
```

No-op entity consumer used as default for placement methods.

```java
public static final MetricsRegistry<BlockSelection> METRICS_REGISTRY
```

Metrics registry exposing lock state, position, anchor, min/max bounds, block count, and entity count.

## Constructors

```java
public BlockSelection()
```

Creates an empty selection with default-capacity backing maps.

```java
public BlockSelection(int initialBlockCapacity, int initialEntityCapacity)
```

Creates an empty selection with the given initial capacities for block and entity storage.

```java
public BlockSelection(@Nonnull BlockSelection other)
```

Copy constructor. Copies all properties, blocks, fluids, and entities from `other`. Throws `IllegalArgumentException` if `other == this`.

## Position and Anchor

```java
public int getX()
public int getY()
public int getZ()
```

Returns the selection's world position.

```java
public int getAnchorX()
public int getAnchorY()
public int getAnchorZ()
```

Returns the selection's anchor offset (origin point for rotation and placement).

```java
public void setPosition(int x, int y, int z)
```

Sets the world position.

```java
public void setAnchor(int anchorX, int anchorY, int anchorZ)
```

Sets the anchor offset in local coordinates.

```java
public void setAnchorAtWorldPos(int anchorX, int anchorY, int anchorZ)
```

Sets the anchor by converting world coordinates to local coordinates relative to the selection position.

## Bounds

```java
@Nonnull
public Vector3i getSelectionMin()
```

Returns a clone of the minimum corner of the selection bounds.

```java
@Nonnull
public Vector3i getSelectionMax()
```

Returns a clone of the maximum corner of the selection bounds.

```java
public boolean hasSelectionBounds()
```

Returns `true` if the selection has non-zero bounds.

```java
public void setSelectionArea(@Nonnull Vector3i min, @Nonnull Vector3i max)
```

Sets the selection bounds, normalizing so `min` is always less than or equal to `max`.

```java
public int getSelectionVolume()
```

Returns the volume of the selection bounding box.

## Counts

```java
public int getBlockCount()
```

Returns the number of blocks in the selection (thread-safe).

```java
public int getFluidCount()
```

Returns the number of fluid entries in the selection (thread-safe).

```java
public int getEntityCount()
```

Returns the number of entities in the selection (thread-safe).

## Block Access

```java
public boolean hasBlockAtWorldPos(int x, int y, int z)
```

Returns `true` if a block exists at the given world position.

```java
public boolean hasBlockAtLocalPos(int x, int y, int z)
```

Returns `true` if a block exists at the given local position.

```java
public int getBlockAtWorldPos(int x, int y, int z)
```

Returns the block ID at the given world position, or `Integer.MIN_VALUE` if not present.

```java
public BlockSelection.BlockHolder getBlockHolderAtWorldPos(int x, int y, int z)
```

Returns the `BlockHolder` at the given world position, or `null` if not present.

## Fluid Access

```java
public int getFluidAtWorldPos(int x, int y, int z)
```

Returns the fluid ID at the given world position, or `Integer.MIN_VALUE` if not present.

```java
public byte getFluidLevelAtWorldPos(int x, int y, int z)
```

Returns the fluid level at the given world position, or `0` if not present.

## Block State Access

```java
public int getSupportValueAtWorldPos(int x, int y, int z)
```

Returns the support value at the given world position, or `0` if not present.

```java
@Nullable
public Holder<ChunkStore> getStateAtWorldPos(int x, int y, int z)
```

Returns a clone of the block state holder at the given world position, or `null` if not present.

## Adding Blocks and Fluids

```java
public void addEmptyAtWorldPos(int x, int y, int z)
```

Adds an air block and empty fluid at the given world position.

```java
public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
```

Adds a block at a world position with the given properties.

```java
public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
```

Adds a block at a local position with the given properties.

```java
public void addFluidAtWorldPos(int x, int y, int z, int fluidId, byte fluidLevel)
```

Adds a fluid at a world position.

```java
public void addFluidAtLocalPos(int x, int y, int z, int fluidId, byte fluidLevel)
```

Adds a fluid at a local position.

## Adding Entities

```java
public void addEntityFromWorld(@Nonnull Holder<EntityStore> entityHolder)
```

Adds an entity from the world, converting its position to local coordinates relative to the selection position.

```java
public void addEntityHolderRaw(Holder<EntityStore> entityHolder)
```

Adds an entity holder directly without position conversion.

```java
public void sortEntitiesByPosition()
```

Sorts entities by their `TransformComponent` position (X, then Y, then Z).

## Iteration

```java
public void forEachBlock(@Nonnull BlockSelection.BlockIterator iterator)
```

Iterates over all blocks in the selection under a read lock.

```java
public void forEachFluid(@Nonnull BlockSelection.FluidIterator iterator)
```

Iterates over all fluids in the selection under a read lock.

```java
public void forEachEntity(Consumer<Holder<EntityStore>> consumer)
```

Iterates over all entities in the selection under a read lock.

```java
public boolean compare(@Nonnull BlockSelection.BlockComparingIterator iterator)
```

Tests all blocks against a predicate. Returns `false` as soon as any block fails the test.

## World Comparison

```java
public boolean canPlace(@Nonnull World world, @Nonnull Vector3i position, @Nullable IntList mask)
```

Returns `true` if every block in the selection can be placed at the given world position. A block can be placed if the target world position contains air or a block ID present in the mask.

```java
public boolean matches(@Nonnull World world, @Nonnull Vector3i position)
```

Returns `true` if the selection matches the world state at the given position (block IDs match exactly).

## Copying from World

```java
public void copyFromAtWorld(int x, int y, int z, @Nonnull WorldChunk other, @Nullable BlockPhysics blockPhysics)
```

Copies a block and fluid from a world chunk at the given world position into the selection.

## Placement

```java
public void placeNoReturn(@Nonnull World world, Vector3i position, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(String feedbackKey, CommandSender feedback, @Nonnull World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(String feedbackKey, CommandSender feedback, @Nonnull FeedbackConsumer feedbackConsumer, @Nonnull World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
public void placeNoReturn(@Nullable String feedbackKey, @Nullable CommandSender feedback, @Nonnull FeedbackConsumer feedbackConsumer, @Nonnull World outerWorld, @Nullable Vector3i position, @Nullable BlockMask blockMask, ComponentAccessor<EntityStore> componentAccessor)
```

Places the selection into the world without returning the previous state. Handles block placement, fluid placement, height map updates, lighting invalidation, entity spawning, and chunk notification. Supports optional [FeedbackConsumer](FeedbackConsumer.md) for progress callbacks and `BlockMask` for exclusion filtering.

```java
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, BlockMask blockMask)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, Vector3i position, BlockMask blockMask)
@Nonnull
public BlockSelection place(CommandSender feedback, @Nonnull World outerWorld, @Nullable Vector3i position, @Nullable BlockMask blockMask, @Nonnull Consumer<Ref<EntityStore>> entityConsumer)
```

Places the selection into the world, returning a new `BlockSelection` containing the previous state (for undo). Handles all block/fluid/entity placement, physics support values, lighting, and chunk notifications.

## Transformation

```java
@Nonnull
public BlockSelection rotate(@Nonnull Axis axis, int angle)
```

Returns a new selection rotated around the anchor point by the given angle on the given axis. Rotates block positions, block rotations, filler offsets, and entity positions and rotations.

```java
@Nonnull
public BlockSelection rotate(@Nonnull Axis axis, int angle, @Nonnull Vector3f originOfRotation)
```

Returns a new selection rotated around a custom origin point instead of the anchor.

```java
@Nonnull
public BlockSelection rotateArbitrary(float yawDegrees, float pitchDegrees, float rollDegrees)
```

Returns a new selection rotated by arbitrary Euler angles using matrix rotation. Performs inverse-mapping from destination space to source space to avoid gaps. Block rotations are snapped to the nearest 90-degree increment.

```java
@Nonnull
public BlockSelection flip(@Nonnull Axis axis)
```

Returns a new selection mirrored along the given axis. Adjusts block rotation tuples and filler offsets according to the block type's flip type. Entity positions and rotations are also flipped.

```java
@Nonnull
public BlockSelection relativize()
@Nonnull
public BlockSelection relativize(int originX, int originY, int originZ)
```

Returns a new selection with all positions offset relative to the given origin (or the anchor). Adjusts position, anchor, bounds, block positions, and entity positions.

## Cloning and Merging

```java
@Nonnull
public BlockSelection cloneSelection()
```

Returns a deep copy of the selection, including cloned block holders and entity holders.

```java
public void add(@Nonnull BlockSelection other)
```

Merges another selection into this one, adjusting positions based on the relative offsets of the two selections.

## Serialization

```java
public void reserializeBlockStates(ChunkStore store, boolean destructive)
```

Re-processes block states through migration systems. Creates block entity holders and state data where missing. If `destructive`, removes unknown components.

```java
public void reserializeEntities(@Nonnull Store<EntityStore> store, boolean destructive) throws IOException
```

Re-processes entity holders through migration systems. If `destructive`, removes unknown components.

```java
public void clearAllSupportValues()
```

Resets all block support values to zero.

## Filler Repair

```java
public void tryFixFiller(boolean allowDestructive)
```

Repairs inconsistent filler block references. Validates that filler blocks point to valid base blocks with matching hitboxes. If `allowDestructive` is `false`, throws `IllegalArgumentException` when a non-air block would need to be replaced.

## Packet Serialization

```java
@Nonnull
public EditorBlocksChange toPacket()
```

Serializes the selection to an `EditorBlocksChange` packet containing block changes (excluding fillers) and fluid changes.

```java
@Nonnull
public EditorBlocksChange toSelectionPacket()
```

Creates a packet containing only the selection bounds (no block data).

```java
@Nonnull
public EditorBlocksChange toPacketWithSelection()
```

Serializes the selection to a packet with both block data and selection bounds.

## Metrics

```java
@Nonnull
@Override
public MetricResults toMetricResults()
```

Returns diagnostic metrics via the `METRICS_REGISTRY`.

## Properties

```java
public void setPrefabId(int id)
```

Sets the prefab ID used when spawning entities during placement.

```java
public void copyPropertiesFrom(@Nonnull BlockSelection other)
```

Copies position, anchor, and bounds from another selection.

## Inner Types

### BlockComparingIterator

```java
@FunctionalInterface
public interface BlockComparingIterator
```

Functional interface for block comparison predicates.

```java
boolean test(int var1, int var2, int var3, BlockSelection.BlockHolder var4)
```

Tests a block at local coordinates (x, y, z) with its data. Return `false` to short-circuit iteration.

### BlockHolder

```java
public record BlockHolder(int blockId, int rotation, int filler, int supportValue, Holder<ChunkStore> holder)
```

Immutable record storing a block's ID, rotation index, filler offset, physics support value, and optional block state holder.

```java
@Nonnull
public BlockSelection.BlockHolder cloneBlockHolder()
```

Returns a copy with a cloned state holder. If the holder is `null`, returns `this`.

### BlockIterator

```java
@FunctionalInterface
public interface BlockIterator
```

Functional interface for block iteration.

```java
void accept(int var1, int var2, int var3, BlockSelection.BlockHolder var4)
```

Called for each block with local coordinates (x, y, z) and its data.

### FallbackMode

```java
public static enum FallbackMode
```

Enum controlling behavior when a block cannot be matched during operations.

| Constant | Description |
|---|---|
| `PASS_THOUGH` | Skip unmatched blocks. |
| `COPY` | Copy unmatched blocks as-is. |

### FluidHolder

```java
public record FluidHolder(int fluidId, byte fluidLevel)
```

Immutable record storing a fluid's ID and level.

### FluidIterator

```java
@FunctionalInterface
public interface FluidIterator
```

Functional interface for fluid iteration.

```java
void accept(int var1, int var2, int var3, int var4, byte var5)
```

Called for each fluid with local coordinates (x, y, z), fluid ID, and fluid level.

## Related Types

- [FeedbackConsumer](FeedbackConsumer.md) -- callback interface for placement progress feedback
- `World` -- world instance used for placement and comparison operations
- `BlockMask` -- exclusion mask for selective placement
- `BlockType` -- block type asset used for rotation and hitbox lookup
- `TransformComponent` -- entity position component adjusted during transform operations
- `PrefabPlaceEntityEvent` -- event fired when an entity is placed from a prefab
