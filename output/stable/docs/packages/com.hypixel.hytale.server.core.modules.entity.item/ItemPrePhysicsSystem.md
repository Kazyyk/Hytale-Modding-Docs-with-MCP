---
title: "ItemPrePhysicsSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.item"
fqcn: "com.hypixel.hytale.server.core.modules.entity.item.ItemPrePhysicsSystem"
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
public class ItemPrePhysicsSystem
```

ECS system running before main physics. Moves items out of solid blocks by finding nearest open space, and applies gravity with terminal velocity.
