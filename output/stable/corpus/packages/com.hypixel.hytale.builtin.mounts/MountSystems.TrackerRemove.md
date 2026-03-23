# MountSystems.TrackerRemove

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, MountedComponent>

public static class TrackerRemove extends RefChangeSystem<EntityStore, MountedComponent>

Reacts to MountedComponent removal on visible entities. When the component is removed:
1. If the mount was a block mount, stops the movement animation via `AnimationUtils.stopAnimation`.
2. Queues a `ComponentUpdateType.Mounted` remove update to all viewers tracking the entity.

## Query

Matches entities with `EntityTrackerSystems.Visible`.

## Watched Component

`MountedComponent` -- reacts to removal only; `onComponentAdded` and `onComponentSet` are no-ops.

## Related Types

- MountSystems -- enclosing class
- MountSystems.TrackerUpdate -- handles update packets
