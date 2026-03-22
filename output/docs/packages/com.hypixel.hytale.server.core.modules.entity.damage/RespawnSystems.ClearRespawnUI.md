---
title: "RespawnSystems.ClearRespawnUI"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ClearRespawnUI"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.ClearRespawnUI extends RespawnSystems.OnRespawnSystem
```

Closes the respawn page on the player's page manager by setting the page to `Page.None`. Requires the entity to have a `Player` component.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [DeathSystems.PlayerDeathScreen](DeathSystems.PlayerDeathScreen.md) -- opens the respawn page on death
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
