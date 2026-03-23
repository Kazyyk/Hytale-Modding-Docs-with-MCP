---
title: "DeathSystems.PlayerKilledPlayer"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.PlayerKilledPlayer"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "player"
  - "pvp"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.PlayerKilledPlayer extends DeathSystems.OnDeathSystem
```

Sends a "killed entity" chat message to the attacking player when they kill a named player entity via `PHYSICAL` or `PROJECTILE` damage. Only triggers if both the victim and attacker are `Player` entities and the victim has a `Nameplate` component.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
- [DamageCause](DamageCause.md) -- checks for `PHYSICAL` and `PROJECTILE`
