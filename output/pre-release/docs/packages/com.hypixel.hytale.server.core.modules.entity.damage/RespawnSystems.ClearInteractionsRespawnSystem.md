---
title: "RespawnSystems.ClearInteractionsRespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ClearInteractionsRespawnSystem"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.ClearInteractionsRespawnSystem extends RespawnSystems.OnRespawnSystem
```

Clears the entity's `InteractionManager` on respawn, cancelling any active interaction chains. Requires the entity to have an `InteractionManager` component.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [DeathSystems.ClearInteractions](DeathSystems.ClearInteractions.md) -- similar system on death
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
