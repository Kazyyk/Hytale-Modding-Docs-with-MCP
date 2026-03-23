# MountSystems.TrackedMounted

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, MountedComponent>

public static class TrackedMounted extends RefChangeSystem<EntityStore, MountedComponent>

Maintains the bidirectional mount relationship between a mounted entity and its mount target. Reacts to MountedComponent lifecycle events.

## Behavior

- **onComponentAdded:** If the mount target entity is valid, ensures a MountedByComponent exists on the target and adds the mounted entity as a passenger.
- **onComponentRemoved:** Delegates to `MountSystems.handleMountedRemoval()` to clean up both sides of the relationship.
- **onComponentSet:** No-op.

## Query

Matches entities with `MountedComponent`.

## Related Types

- MountSystems -- enclosing class
- MountedByComponent -- the component maintained on mount targets
