---
title: "MountedComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountedComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class MountedComponent implements Component<EntityStore>
```

An `EntityStore` ECS component that marks an entity as mounted. Supports two mount targets: another entity (for NPC/entity mounts) or a chunk-store block reference (for block seats and beds). Tracks the attachment offset, controller type, block mount type, mount start time, and a dirty flag for network synchronization.

## Component Type

```java
public static ComponentType<EntityStore, MountedComponent> getComponentType()
```

Delegates to `MountPlugin.getInstance().getMountedComponentType()`.

## Constructors

### Entity mount

```java
public MountedComponent(Ref<EntityStore> mountedToEntity, Vector3f attachmentOffset, MountController controller)
```

Creates a component for mounting to another entity. Records the current system time as the mount start.

### Block mount

```java
public MountedComponent(Ref<ChunkStore> mountedToBlock, Vector3f attachmentOffset, BlockMountType blockMountType)
```

Creates a component for mounting to a block. Sets the controller to `MountController.BlockMount` and records the block mount type.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getMountedToEntity()` | `@Nullable Ref<EntityStore>` | The entity being ridden, or `null` for block mounts. |
| `getMountedToBlock()` | `@Nullable Ref<ChunkStore>` | The block chunk reference, or `null` for entity mounts. |
| `getAttachmentOffset()` | `Vector3f` | Position offset from the mount point. |
| `getControllerType()` | `MountController` | The controller type determining input handling behavior. |
| `getBlockMountType()` | `BlockMountType` | The block mount type (`Seat` or `Bed`), only set for block mounts. |
| `getMountedDurationMs()` | `long` | Milliseconds since the mount began, computed from `System.currentTimeMillis()`. |

### consumeNetworkOutdated

```java
public boolean consumeNetworkOutdated()
```

Returns `true` the first time called after the component is created, then returns `false` on subsequent calls. Used by [MountSystems.TrackerUpdate](MountSystems.TrackerUpdate.md) to determine whether a full network update is needed.

## Clone

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a copy sharing the same entity reference, offset, and controller. Does not copy block mount state.

## Related Types

- [MountedByComponent](MountedByComponent.md) -- tracks passengers on the mount target
- [MountSystems](MountSystems.md) -- systems reacting to this component
- [BlockMountAPI](BlockMountAPI.md) -- creates block-mount instances
- [MountInteraction](MountInteraction.md) -- creates entity-mount instances
