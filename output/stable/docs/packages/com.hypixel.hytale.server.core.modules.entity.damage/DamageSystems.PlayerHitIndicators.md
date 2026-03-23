---
title: "DamageSystems.PlayerHitIndicators"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.PlayerHitIndicators"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "ui"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.PlayerHitIndicators extends DamageEventSystem
```

Sends a `DamageInfo` packet to the damaged player when they take damage from an entity source. Part of the inspect damage group. The packet contains the source entity's position, the damage amount, and the damage cause in protocol format. Only applies to entities with a `PlayerRef` component.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.EntitySource](Damage.EntitySource.md) -- required source type for hit indicators
- [DamageCause](DamageCause.md) -- converted to packet format via `toPacket()`
- [DamageEventSystem](DamageEventSystem.md) -- base class
