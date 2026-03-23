# MountSystems.RemoveMountedHolder

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: HolderSystem<EntityStore>

public static class RemoveMountedHolder extends HolderSystem<EntityStore>

Strips the MountedComponent from the entity holder during entity removal. This ensures the component is removed at the holder level (pre-archetype), complementing the ref-level cleanup in RemoveMounted.

## Query

Matches entities with `MountedComponent`.

## Behavior

- **onEntityAdd:** No-op.
- **onEntityRemoved:** Calls `holder.removeComponent(mountedComponentType)`.

## Related Types

- MountSystems -- enclosing class
- MountSystems.RemoveMounted -- ref-level removal cleanup
