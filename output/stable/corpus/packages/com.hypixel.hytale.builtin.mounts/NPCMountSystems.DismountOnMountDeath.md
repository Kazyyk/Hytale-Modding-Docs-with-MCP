# NPCMountSystems.DismountOnMountDeath

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: DeathSystems.OnDeathSystem

public static class DismountOnMountDeath extends DeathSystems.OnDeathSystem

Resets the player's movement settings when a mounted NPC dies. Reacts to `DeathComponent` being added to NPC entities that have an NPCMountComponent. Reads the mount component's owner player reference and, if the player is still valid, calls `MountPlugin.resetOriginalPlayerMovementSettings()`.

## Query

Matches entities with `NPCMountComponent`.

## Related Types

- NPCMountSystems -- enclosing class
- NPCMountSystems.DismountOnPlayerDeath -- handles the reverse case (player dies)
