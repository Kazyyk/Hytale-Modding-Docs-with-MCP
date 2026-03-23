# PlayerSavingSystems.SaveDataResource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Resource<EntityStore>

public static class PlayerSavingSystems.SaveDataResource implements Resource<EntityStore>

An ECS resource that holds the countdown timer for periodic player data saving. The delay resets to 10 seconds after each save cycle.

## Related Types

- PlayerSavingSystems -- parent container class
- PlayerSavingSystems.TickingSystem -- system that decrements this timer
