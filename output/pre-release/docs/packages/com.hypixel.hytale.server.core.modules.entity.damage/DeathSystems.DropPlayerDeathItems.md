---
title: "DeathSystems.DropPlayerDeathItems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.DropPlayerDeathItems"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "items"
  - "drop"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.DropPlayerDeathItems extends DeathSystems.OnDeathSystem
```

Handles item loss and item dropping when a player dies. Only applies to non-Creative mode players. Processes durability loss first (reduces durability on all non-broken items by the configured percentage), then processes item drops based on the loss mode:

- **ALL**: drops all items from the player's inventory.
- **CONFIGURED**: drops a percentage of each item's quantity (items flagged with `dropsOnDeath()`).
- **NONE**: drops nothing.

Dropped items are spawned as item entities at the player's position (offset upward by 1 block). Also recalculates stat modifiers if any armor broke during durability loss.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.PlayerDropItemsConfig](DeathSystems.PlayerDropItemsConfig.md) -- runs before this system to configure loss parameters
- [DeathComponent](DeathComponent.md) -- reads loss configuration
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
