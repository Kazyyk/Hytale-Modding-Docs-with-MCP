---
title: "ItemUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.ItemUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class ItemUtils
```

Utility class for item-related entity operations. Provides `interactivelyPickupItem()` for adding items to an entity's inventory with event dispatch, and `dropItem()` / `throwItem()` for ejecting items into the world as item entities with configured velocity and transform.
