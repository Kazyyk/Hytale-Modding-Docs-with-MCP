---
title: "RespawnSystems.ResetStatsRespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ResetStatsRespawnSystem"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "stats"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.ResetStatsRespawnSystem extends RespawnSystems.OnRespawnSystem
```

Resets all entity stats to their default values on respawn. Requires the entity to have both `Player` and `EntityStatMap` components. Iterates through all stat values and calls `resetStatValue()` on each.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
