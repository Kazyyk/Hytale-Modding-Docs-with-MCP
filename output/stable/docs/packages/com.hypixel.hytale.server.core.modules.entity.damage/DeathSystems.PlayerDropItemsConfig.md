---
title: "DeathSystems.PlayerDropItemsConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.PlayerDropItemsConfig"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.PlayerDropItemsConfig extends DeathSystems.OnDeathSystem
```

Configures the item loss parameters on the [DeathComponent](DeathComponent.md) from the world's `DeathConfig` before items are actually dropped. Runs before [DeathSystems.DropPlayerDeathItems](DeathSystems.DropPlayerDeathItems.md). Sets the loss mode, amount loss percentage, and durability loss percentage.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.DropPlayerDeathItems](DeathSystems.DropPlayerDeathItems.md) -- runs after this system
- [DeathComponent](DeathComponent.md) -- configured by this system
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
