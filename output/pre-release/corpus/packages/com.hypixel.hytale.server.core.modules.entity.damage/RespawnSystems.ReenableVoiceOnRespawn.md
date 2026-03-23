# RespawnSystems.ReenableVoiceOnRespawn

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RespawnSystems.OnRespawnSystem

public static class RespawnSystems.ReenableVoiceOnRespawn extends RespawnSystems.OnRespawnSystem

Re-enables voice chat for the player on respawn. Unsets the silenced flag on the `VoicePlayerState`, sends updated voice configuration, and schedules an immediate position update for proximity-based voice.

## Relationships

- Inner class of RespawnSystems
- Counterpart to `DeathSystems.StopVoiceOnDeath`
