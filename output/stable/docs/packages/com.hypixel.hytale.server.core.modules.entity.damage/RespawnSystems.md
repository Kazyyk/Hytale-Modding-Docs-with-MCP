---
title: "RespawnSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class RespawnSystems
```

Container class for ECS systems triggered when an entity respawns (when the [DeathComponent](DeathComponent.md) is removed). Systems handle stat reset, effect clearing, interaction cleanup, broken item checks, and UI cleanup.

## Inner Types

- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- abstract base for respawn component-change systems
- [RespawnSystems.ResetStatsRespawnSystem](RespawnSystems.ResetStatsRespawnSystem.md) -- resets all entity stats
- [RespawnSystems.ResetPlayerRespawnSystem](RespawnSystems.ResetPlayerRespawnSystem.md) -- records spawn time
- [RespawnSystems.ClearEntityEffectsRespawnSystem](RespawnSystems.ClearEntityEffectsRespawnSystem.md) -- clears active effects
- [RespawnSystems.ClearInteractionsRespawnSystem](RespawnSystems.ClearInteractionsRespawnSystem.md) -- clears interaction manager
- [RespawnSystems.CheckBrokenItemsRespawnSystem](RespawnSystems.CheckBrokenItemsRespawnSystem.md) -- warns about broken items
- [RespawnSystems.ClearRespawnUI](RespawnSystems.ClearRespawnUI.md) -- closes the respawn page

## Related Types

- [DeathComponent](DeathComponent.md) -- removal of this component triggers respawn systems
- [DeathSystems](DeathSystems.md) -- handles death (component addition)
- [DamageModule](DamageModule.md) -- registers all respawn systems
