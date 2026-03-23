---
title: "DeathSystems.PlayerDeathScreen"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.PlayerDeathScreen"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "ui"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.PlayerDeathScreen extends DeathSystems.OnDeathSystem
```

Opens the respawn page on the player's page manager when a player dies, if `showDeathMenu` is true. Generates the death message from the killing `Damage` event and passes it along with the item loss data to the `RespawnPage`.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathComponent](DeathComponent.md) -- reads death message and item loss data
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
