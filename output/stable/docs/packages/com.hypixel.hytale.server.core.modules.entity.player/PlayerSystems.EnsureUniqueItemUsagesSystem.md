---
title: "PlayerSystems.EnsureUniqueItemUsagesSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.EnsureUniqueItemUsagesSystem"
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
public static class PlayerSystems.EnsureUniqueItemUsagesSystem extends HolderSystem<EntityStore>
```

An ECS holder system that ensures every player entity has a `UniqueItemUsagesComponent`. Queries entities with `PlayerRef` but without `UniqueItemUsagesComponent`.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
