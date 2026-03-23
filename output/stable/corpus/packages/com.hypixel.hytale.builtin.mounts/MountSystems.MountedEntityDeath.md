# MountSystems.MountedEntityDeath

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, DeathComponent>

public static class MountedEntityDeath extends RefChangeSystem<EntityStore, DeathComponent>

Dismounts an entity when it dies. Reacts to `DeathComponent` being added to entities that have a MountedComponent, and removes the `MountedComponent` via the command buffer.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`DeathComponent` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Related Types

- MountSystems -- enclosing class
- MountSystems.TeleportMountedEntity -- similar dismount-on-event pattern
