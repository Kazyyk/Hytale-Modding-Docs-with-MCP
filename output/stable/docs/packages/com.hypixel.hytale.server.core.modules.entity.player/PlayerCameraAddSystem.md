---
title: "PlayerCameraAddSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerCameraAddSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "camera"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerCameraAddSystem extends HolderSystem<EntityStore>
```

An ECS holder system that ensures every player entity has a `CameraManager` component. Queries entities that have a `PlayerRef` but lack a `CameraManager`, and adds one on entity creation.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- other player initialization systems
