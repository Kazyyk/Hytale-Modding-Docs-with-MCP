# VoiceModule.PositionSnapshot

Type: record | Package: com.hypixel.hytale.server.core.modules.voice

public record VoiceModule.PositionSnapshot(double x, double y, double z, boolean isUnderwater, long worldId, int networkId, boolean isDead, long timestamp)

Immutable snapshot of a player's position data used for voice routing calculations. Includes the eye-height-adjusted Y coordinate, world ID for cross-world isolation, network entity ID, death state, and the timestamp when the snapshot was taken.

## See Also

- VoiceModule
