# VoiceModuleConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.voice

public class VoiceModuleConfig

Persistable configuration for the voice module. Stores voice enabled state, max hearing distance, full volume distance, whether dead players can hear voice, and a concurrent set of globally muted player UUIDs.

## Default Values

- voiceEnabled | true
- maxHearingDistance | 32.0f
- fullVolumeDistance | 4.0f
- deadPlayersCanHear | false

## Methods

- boolean isVoiceEnabled()
- void setVoiceEnabled(boolean voiceEnabled)
- float getMaxHearingDistance()
- void setMaxHearingDistance(float maxHearingDistance)
- float getFullVolumeDistance()
- void setFullVolumeDistance(float fullVolumeDistance)
- Set<UUID> getMutedPlayers()
- boolean isPlayerMuted(UUID playerId)
- boolean mutePlayer(UUID playerId)
- boolean unmutePlayer(UUID playerId)
- boolean isDeadPlayersCanHear()
- void setDeadPlayersCanHear(boolean deadPlayersCanHear)
