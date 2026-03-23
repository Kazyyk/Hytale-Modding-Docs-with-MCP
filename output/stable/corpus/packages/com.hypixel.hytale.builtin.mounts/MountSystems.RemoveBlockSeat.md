# MountSystems.RemoveBlockSeat

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<ChunkStore>

public static class RemoveBlockSeat extends RefSystem<ChunkStore>

A `ChunkStore` system that dismounts all seated entities when a block seat chunk entity is removed. Registered on the chunk store registry by MountPlugin.

## Query

Matches chunk entities with BlockMountComponent.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Collects all seated entity references from the `BlockMountComponent`, removes each from the seat, and schedules removal of the MountedComponent on the world thread for each valid seated entity.

## Related Types

- MountSystems -- enclosing class
- BlockMountComponent -- the component tracking seated entities
