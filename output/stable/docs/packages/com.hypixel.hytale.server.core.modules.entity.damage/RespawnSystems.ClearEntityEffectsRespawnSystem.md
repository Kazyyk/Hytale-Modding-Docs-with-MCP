---
title: "RespawnSystems.ClearEntityEffectsRespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ClearEntityEffectsRespawnSystem"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "effects"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.ClearEntityEffectsRespawnSystem extends RespawnSystems.OnRespawnSystem
```

Clears all active entity effects on respawn via `EffectControllerComponent.clearEffects()`. Requires the entity to have an `EffectControllerComponent`.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [DeathSystems.ClearEntityEffects](DeathSystems.ClearEntityEffects.md) -- similar system on death
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
