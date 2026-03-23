# RespawnSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public class RespawnSystems

Container for ECS systems that handle entity respawn (DeathComponent removal). Each inner system extends `OnRespawnSystem` and performs a specific respawn action: resetting stats, clearing effects, clearing interactions, clearing respawn UI, resetting spawn time, checking broken items, and re-enabling voice chat.

## Inner Classes

- RespawnSystems.CheckBrokenItemsRespawnSystem | Notifies player of broken items on respawn
- RespawnSystems.ClearEntityEffectsRespawnSystem | Clears all entity effects on respawn
- RespawnSystems.ClearInteractionsRespawnSystem | Clears interaction manager on respawn
- RespawnSystems.ClearRespawnUI | Resets page to None on respawn
- RespawnSystems.OnRespawnSystem | Abstract base watching DeathComponent removal
- RespawnSystems.ReenableVoiceOnRespawn | Re-enables voice chat on respawn
- RespawnSystems.ResetPlayerRespawnSystem | Records last spawn time
- RespawnSystems.ResetStatsRespawnSystem | Resets all entity stat values to defaults
