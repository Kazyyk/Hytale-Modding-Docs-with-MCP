---
title: "DamageSystems.ReticleEvents"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ReticleEvents"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "reticle"
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.ReticleEvents extends DamageEventSystem
```

Sends reticle hit/kill events to the attacking player. Part of the inspect damage group. When positive damage is dealt from an entity source, sends an `ON_HIT` reticle event to the source player, or `ON_KILL` if the target entity is dead. These events trigger crosshair feedback animations on the client.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.EntitySource](Damage.EntitySource.md) -- required source type
- [DeathComponent](DeathComponent.md) -- checked to determine kill vs hit
- [DamageEventSystem](DamageEventSystem.md) -- base class
