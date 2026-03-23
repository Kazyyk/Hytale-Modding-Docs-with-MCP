---
title: "LivingEntity"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.LivingEntity"
api_surface: true
extends: "Entity"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public abstract class LivingEntity extends Entity
```

Abstract base class for entities with health, inventory, equipment, and stat modifiers. Extends `Entity` and adds an `Inventory` (deserialized via codec), a `StatModifiersManager` for equipment-based stat calculations, fall distance tracking, and armor inventory change event handling. Subclasses must implement `createDefaultInventory()`. Provides breathing logic that checks invulnerability and fluid/material state.
