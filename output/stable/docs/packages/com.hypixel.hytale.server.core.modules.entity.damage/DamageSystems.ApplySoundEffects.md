---
title: "DamageSystems.ApplySoundEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ApplySoundEffects"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "sound"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.ApplySoundEffects extends DamageEventSystem
```

Plays impact sound effects when a damage event carries `IMPACT_SOUND_EFFECT` or `PLAYER_IMPACT_SOUND_EFFECT` metadata. Part of the inspect damage group. The general impact sound is played as a 3D sound at the hit location for all nearby players (excluding the attacker). The player-specific impact sound is played only for the damaged player if they are a `Player` entity.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.SoundEffect](Damage.SoundEffect.md) -- the sound data read from the meta store
- [DamageEventSystem](DamageEventSystem.md) -- base class
