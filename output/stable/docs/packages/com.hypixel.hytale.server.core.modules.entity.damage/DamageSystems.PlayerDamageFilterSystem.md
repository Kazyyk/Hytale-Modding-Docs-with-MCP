---
title: "DamageSystems.PlayerDamageFilterSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.PlayerDamageFilterSystem"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "filter"
  - "player"
  - "pvp"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.PlayerDamageFilterSystem extends DamageEventSystem
```

Cancels damage to players who have spawn protection active, and cancels player-vs-player damage when PvP is disabled in the world config. Part of the filter damage group. Checks `Player.hasSpawnProtection()` first; if the player is not protected, checks if PvP is disabled and the source is another player, cancelling the damage if so.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage.EntitySource](Damage.EntitySource.md) -- checked for PvP source detection
- [DamageEventSystem](DamageEventSystem.md) -- base class
