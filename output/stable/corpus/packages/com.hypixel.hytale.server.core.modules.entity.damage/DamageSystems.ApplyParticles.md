# DamageSystems.ApplyParticles

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.ApplyParticles extends DamageEventSystem

Spawns impact particles when a damage event carries `IMPACT_PARTICLES` metadata. Part of the inspect damage group. Spawns world-space particles at the hit location and sends model-space particles as `SpawnModelParticles` packets to nearby players within the configured view distance. If the damage can be predicted, the source player is excluded from receiving world particles to avoid duplication.

## Related Types

- DamageSystems -- parent class
- Damage.Particles -- the particle data read from the meta store
- DamageEventSystem -- base class
