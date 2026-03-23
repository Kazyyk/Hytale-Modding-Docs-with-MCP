# RespawnSystems.ResetStatsRespawnSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ResetStatsRespawnSystem extends RespawnSystems.OnRespawnSystem

Resets all entity stats to their default values on respawn. Requires the entity to have both `Player` and `EntityStatMap` components. Iterates through all stat values and calls `resetStatValue()` on each.

## Related Types

- RespawnSystems -- parent class
- RespawnSystems.OnRespawnSystem -- base class
