---
title: "PlayerSystems.EnsureEffectControllerSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.EnsureEffectControllerSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.EnsureEffectControllerSystem extends HolderSystem<EntityStore>
```

An ECS holder system that ensures every player entity has an `EffectControllerComponent`. Queries entities with a `PlayerRef` and adds the component on entity creation.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
