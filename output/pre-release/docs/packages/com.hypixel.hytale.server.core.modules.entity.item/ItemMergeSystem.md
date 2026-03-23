---
title: "ItemMergeSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.item"
fqcn: "com.hypixel.hytale.server.core.modules.entity.item.ItemMergeSystem"
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
public class ItemMergeSystem
```

ECS system that merges nearby identical item entities within a 2-block radius. Combines stacks up to the item's max stack size and refreshes despawn timers.
