# PlayerHudManagerSystems.InitializeSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerHudManagerSystems.InitializeSystem extends RefSystem<EntityStore>

An ECS ref system that sends the initial HUD component visibility state to the player's client when the entity is added to the store. Queries entities with both `PlayerRef` and `Player` components. Calls `HudManager.sendVisibleHudComponents()` on the player's packet handler.

## Related Types

- PlayerHudManagerSystems -- parent container class
