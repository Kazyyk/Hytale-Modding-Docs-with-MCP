---
title: "BlockMountAPI"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.BlockMountAPI"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public final class BlockMountAPI
```

Static utility class for mounting entities onto block-based seats and beds. The class has a private constructor and exposes a single static method. It resolves the target block's type, locates an available mount point, positions the entity, and attaches a [MountedComponent](MountedComponent.md) to the entity.

## Methods

### mountOnBlock

```java
@Nonnull
public static BlockMountAPI.BlockMountResult mountOnBlock(
    @Nonnull Ref<EntityStore> entity, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Vector3i targetBlock, @Nonnull Vector3f interactPos
)
```

Attempts to mount the given entity onto a block at the specified position. The method:

1. Checks the entity does not already have a `MountedComponent` (returns `ALREADY_MOUNTED` if so).
2. Resolves the world chunk and chunk reference for the target block.
3. Looks up the `BlockType` at the target position.
4. Determines whether the block has seats or beds; selects the corresponding `BlockMountType`.
5. Ensures a [BlockMountComponent](BlockMountComponent.md) exists on the chunk store for the block.
6. Calls `findAvailableSeat()` to pick the closest unoccupied mount point to the interaction position.
7. Positions the entity's `TransformComponent` at the mount point's world-space position and rotation.
8. Adds a `MountedComponent` to the entity and records the seated entity on the `BlockMountComponent`.

Returns a [BlockMountResult](BlockMountAPI.BlockMountResult.md): either a [Mounted](BlockMountAPI.Mounted.md) record on success or a [DidNotMount](BlockMountAPI.DidNotMount.md) enum value on failure.

## Inner Types

- [BlockMountResult](BlockMountAPI.BlockMountResult.md) -- sealed result interface
- [DidNotMount](BlockMountAPI.DidNotMount.md) -- failure enum
- [Mounted](BlockMountAPI.Mounted.md) -- success record

## Related Types

- [BlockMountComponent](BlockMountComponent.md) -- chunk-store component tracking block seats
- [MountedComponent](MountedComponent.md) -- entity-store component marking an entity as mounted
- [SeatingInteraction](SeatingInteraction.md) -- block interaction that calls `mountOnBlock`
