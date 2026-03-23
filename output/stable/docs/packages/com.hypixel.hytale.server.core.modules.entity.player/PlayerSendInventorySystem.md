---
title: "PlayerSendInventorySystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSendInventorySystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "inventory"
  - "network"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerSendInventorySystem extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that sends inventory updates to the client when the player's inventory is dirty. Each tick, checks `Inventory.consumeIsDirty()` and sends the full inventory packet if changes occurred. Also calls `WindowManager.updateWindows()` to synchronize open UI windows.

Queries entities with `Player` and `PlayerRef`.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- other player systems
