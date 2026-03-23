# MountSystems.RemoveMounted

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<EntityStore>

public static class RemoveMounted extends RefSystem<EntityStore>

Cleans up mount relationships when a mounted entity is removed from the store. On entity removal, reads the entity's MountedComponent and delegates to `MountSystems.handleMountedRemoval()` to remove the passenger from the mount's MountedByComponent or BlockMountComponent.

## Query

Matches entities with `MountedComponent`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Delegates to `handleMountedRemoval`.

## Related Types

- MountSystems -- enclosing class
- MountSystems.RemoveMountedBy -- handles the reverse case (mount entity removed)
