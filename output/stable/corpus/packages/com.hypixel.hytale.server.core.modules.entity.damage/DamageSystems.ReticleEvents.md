# DamageSystems.ReticleEvents

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ReticleEvents extends DamageEventSystem

Sends reticle hit/kill events to the attacking player. Part of the inspect damage group. When positive damage is dealt from an entity source, sends an `ON_HIT` reticle event to the source player, or `ON_KILL` if the target entity is dead. These events trigger crosshair feedback animations on the client.

## Related Types

- DamageSystems -- parent class
- Damage.EntitySource -- required source type
- DeathComponent -- checked to determine kill vs hit
- DamageEventSystem -- base class
