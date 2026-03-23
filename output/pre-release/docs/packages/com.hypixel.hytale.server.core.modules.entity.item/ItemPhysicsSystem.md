---
title: "ItemPhysicsSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.item"
fqcn: "com.hypixel.hytale.server.core.modules.entity.item.ItemPhysicsSystem"
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
public class ItemPhysicsSystem
```

ECS system applying physics to item entities. Resolves block collisions, cancels velocity on ground contact, and removes items that fall below Y=-32.
