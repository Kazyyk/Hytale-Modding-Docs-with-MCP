---
title: "BlockMountComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.BlockMountComponent"
api_surface: false
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class BlockMountComponent implements Component<ChunkStore>
```

A `ChunkStore` ECS component that tracks entities seated on a block-based mount point (seat or bed). Maintains bidirectional maps between `BlockMountPoint` instances and seated entity references. Created by [BlockMountAPI.mountOnBlock()](BlockMountAPI.md) when an entity first sits on a block.

## Component Type

```java
public static ComponentType<ChunkStore, BlockMountComponent> getComponentType()
```

Delegates to `MountPlugin.getInstance().getBlockMountComponentType()`.

## Constructors

```java
public BlockMountComponent()
```

Default constructor.

```java
public BlockMountComponent(BlockMountType type, Vector3i blockPos, BlockType expectedBlockType, int expectedRotation)
```

Constructs a component with the mount type, block position, expected block type, and rotation index.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getType()` | `BlockMountType` | The mount type (`Seat` or `Bed`). |
| `getBlockPos()` | `Vector3i` | The world-space block position. |
| `getExpectedBlockType()` | `BlockType` | The block type at mount creation time. |
| `getExpectedRotation()` | `int` | The block rotation index at mount creation time. |

## Seat Management

### isDead

```java
public boolean isDead()
```

Returns `true` if no entities are seated after cleaning invalid references. Used by [MountSystems.TrackedMounted](MountSystems.TrackedMounted.md) to determine whether the component should be removed.

### putSeatedEntity

```java
public void putSeatedEntity(@Nonnull BlockMountPoint mountPoint, @Nonnull Ref<EntityStore> seatedEntity)
```

Records that the given entity is seated at the specified mount point.

### removeSeatedEntity

```java
public void removeSeatedEntity(@Nonnull Ref<EntityStore> seatedEntity)
```

Removes the entity from the seat tracking maps.

### getSeatBlockBySeatedEntity

```java
@Nullable
public BlockMountPoint getSeatBlockBySeatedEntity(Ref<EntityStore> seatedEntity)
```

Returns the `BlockMountPoint` occupied by the given entity, or `null`.

### getSeatedEntities

```java
@Nonnull
public Collection<? extends Ref<EntityStore>> getSeatedEntities()
```

Returns all currently seated entity references.

### findAvailableSeat

```java
@Nullable
public BlockMountPoint findAvailableSeat(@Nonnull Vector3i targetBlock, @Nonnull BlockMountPoint[] choices, @Nonnull Vector3f whereWasClicked)
```

Finds the closest unoccupied mount point to the click position. Cleans invalid references first, then iterates all choices computing squared distance to `whereWasClicked` in world space. Returns the closest available seat, or `null` if all are occupied.

## Clone

```java
@Nonnull
@Override
public Component<ChunkStore> clone()
```

Returns a shallow copy with cloned seat maps.

## Related Types

- [BlockMountAPI](BlockMountAPI.md) -- creates and populates this component
- [MountSystems.RemoveBlockSeat](MountSystems.RemoveBlockSeat.md) -- dismounts seated entities when this chunk entity is removed
- [MountSystems.TrackerUpdate](MountSystems.TrackerUpdate.md) -- reads this component for network updates
