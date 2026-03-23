# MountSystems.RemoveMountedBy

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<EntityStore>

public static class RemoveMountedBy extends RefSystem<EntityStore>

Dismounts all passengers when a mount entity is removed from the store. On entity removal, iterates the MountedByComponent passenger list and removes the MountedComponent from each valid passenger whose mount target matches the removed entity (or is already invalid).

## Query

Matches entities with `MountedByComponent`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** For each passenger in the `MountedByComponent`, checks if the passenger's `MountedComponent` targets this entity, and if so removes it.

## Related Types

- MountSystems -- enclosing class
- MountSystems.RemoveMounted -- handles the reverse case (mounted entity removed)
