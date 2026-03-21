---
title: "PlayerSystems.EnsurePlayerInput"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.EnsurePlayerInput"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "input"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.EnsurePlayerInput extends HolderSystem<EntityStore>
```

An ECS holder system that ensures every player entity has a [PlayerInput](PlayerInput.md) component. Adds the component on entity add and removes it on entity removal.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
