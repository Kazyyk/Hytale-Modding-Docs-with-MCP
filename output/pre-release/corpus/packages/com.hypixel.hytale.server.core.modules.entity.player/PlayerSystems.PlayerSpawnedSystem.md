# PlayerSystems.PlayerSpawnedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerSystems.PlayerSpawnedSystem extends RefSystem<EntityStore>

An ECS ref system that sends the player's initial entity state to themselves when added to the store. Calls the deprecated `sendPlayerSelf()` method which constructs a comprehensive `EntityUpdates` packet including model, skin, equipment, transform, effects, stats, nameplate, and component flags.

## Related Types

- PlayerSystems -- parent container class
