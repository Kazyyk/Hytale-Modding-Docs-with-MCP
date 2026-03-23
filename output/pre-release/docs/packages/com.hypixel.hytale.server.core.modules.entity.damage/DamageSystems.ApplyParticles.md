---
title: "DamageSystems.ApplyParticles"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ApplyParticles"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "particles"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.ApplyParticles extends DamageEventSystem
```

Spawns impact particles when a damage event carries `IMPACT_PARTICLES` metadata. Part of the inspect damage group. Spawns world-space particles at the hit location and sends model-space particles as `SpawnModelParticles` packets to nearby players within the configured view distance. If the damage can be predicted, the source player is excluded from receiving world particles to avoid duplication.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.Particles](Damage.Particles.md) -- the particle data read from the meta store
- [DamageEventSystem](DamageEventSystem.md) -- base class
