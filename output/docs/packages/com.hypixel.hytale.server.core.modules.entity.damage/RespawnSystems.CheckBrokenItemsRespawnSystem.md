---
title: "RespawnSystems.CheckBrokenItemsRespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.CheckBrokenItemsRespawnSystem"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "items"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class RespawnSystems.CheckBrokenItemsRespawnSystem extends RespawnSystems.OnRespawnSystem
```

Checks if the player's inventory contains any broken items after respawn and sends a warning message if so. The message uses translation key `server.general.repair.itemBrokenOnRespawn` with red color `#ff5555`. Requires the entity to have a `Player` component.

## Related Types

- [RespawnSystems](RespawnSystems.md) -- parent class
- [RespawnSystems.OnRespawnSystem](RespawnSystems.OnRespawnSystem.md) -- base class
