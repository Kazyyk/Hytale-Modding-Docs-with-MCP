---
title: "PickupItemSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.item"
fqcn: "com.hypixel.hytale.server.core.modules.entity.item.PickupItemSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "item"
  - "entity"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.item`

```java
public class PickupItemSystem
```

ECS system that lerps pickup item entities toward their target position over their lifetime, removing them on completion or invalid target.
