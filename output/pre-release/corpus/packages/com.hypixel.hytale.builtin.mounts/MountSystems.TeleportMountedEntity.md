# MountSystems.TeleportMountedEntity

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, Teleport>

public static class TeleportMountedEntity extends RefChangeSystem<EntityStore, Teleport>

Dismounts an entity when it is teleported. Reacts to `Teleport` component being added to entities with a MountedComponent, and removes the `MountedComponent`.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`Teleport` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Dependencies

Ordered `BEFORE` both `TeleportSystems.MoveSystem` and `TeleportSystems.PlayerMoveSystem` with `CLOSEST` priority.

## Related Types

- MountSystems -- enclosing class
- MountSystems.MountedEntityDeath -- similar dismount-on-event pattern
