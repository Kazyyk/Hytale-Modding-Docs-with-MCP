---
title: "ItemSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.item"
fqcn: "com.hypixel.hytale.server.core.modules.entity.item.ItemSystems"
api_surface: false
extends: ~
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
public class ItemSystems
```

Container for item entity ECS systems: `EnsureRequiredComponents` (adds physics, bounding box, network ID, dynamic light on spawn) and `TrackerSystem` (syncs item updates to entity tracker viewers).
