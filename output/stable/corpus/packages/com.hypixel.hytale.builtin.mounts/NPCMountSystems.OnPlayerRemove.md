# NPCMountSystems.OnPlayerRemove

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<EntityStore>

public static class OnPlayerRemove extends RefSystem<EntityStore>

Dismounts the player from their NPC mount when the player entity is removed from the store (e.g., on disconnect). Delegates to `MountPlugin.checkDismountNpc()`.

## Query

Matches entities with `Player`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Reads the `Player` component and delegates to `MountPlugin.checkDismountNpc()`.

## Related Types

- NPCMountSystems -- enclosing class
- NPCMountSystems.DismountOnPlayerDeath -- handles dismount on player death
