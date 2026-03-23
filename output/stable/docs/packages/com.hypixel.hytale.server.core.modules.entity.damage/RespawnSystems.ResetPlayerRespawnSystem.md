---
title: "RespawnSystems.ResetPlayerRespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ResetPlayerRespawnSystem"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.ResetPlayerRespawnSystem extends RespawnSystems.OnRespawnSystem
```

Records the current system time as the player's last spawn time on respawn, enabling spawn protection. Requires the entity to have a `Player` component.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [DamageSystems.PlayerDamageFilterSystem](DamageSystems.PlayerDamageFilterSystem.md) -- checks spawn protection
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
