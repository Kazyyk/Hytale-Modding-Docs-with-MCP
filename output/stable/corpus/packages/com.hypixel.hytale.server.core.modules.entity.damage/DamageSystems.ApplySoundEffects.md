# DamageSystems.ApplySoundEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ApplySoundEffects extends DamageEventSystem

Plays impact sound effects when a damage event carries `IMPACT_SOUND_EFFECT` or `PLAYER_IMPACT_SOUND_EFFECT` metadata. Part of the inspect damage group. The general impact sound is played as a 3D sound at the hit location for all nearby players (excluding the attacker). The player-specific impact sound is played only for the damaged player if they are a `Player` entity.

## Related Types

- DamageSystems -- parent class
- Damage.SoundEffect -- the sound data read from the meta store
- DamageEventSystem -- base class
