---
title: "DeathSystems.PlayerDeathMarker"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.PlayerDeathMarker"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "map"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.PlayerDeathMarker extends DeathSystems.OnDeathSystem
```

Adds a death marker to the player's world map data when they die, if the world's `WorldMapConfig` has `displayDeathMarker` enabled. Records the position, game time (days since world start), and a unique marker ID in the player's per-world data.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
