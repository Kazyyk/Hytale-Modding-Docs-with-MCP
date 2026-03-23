---
title: "EntityModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.EntityModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:03Z"
tags:
  - "entity"
  - "module"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class EntityModule extends JavaPlugin
```

Core plugin module registering all entity-related ECS components, systems, and resources. Handles registration of transform, model, bounding box, inventory, physics, damage, interaction, tracking, movement, player, item, condition, effect, and teleport components and systems. One of the largest modules in the server; depends on `Universe` and `CollisionModule`.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `EntityModule` | `get()` |

## Key Component Type Accessors

Returns `ComponentType` instances for:
- Inventory components (Armor, Backpack, Hotbar, Storage, Tool, Utility, Combined)
- Transform, Model, BoundingBox, HeadRotation, SnapshotBuffer
- NetworkId, UUIDComponent, Entity, Player, Frozen
- CachedStatsComponent, and many more

## Relationships

- Extends `JavaPlugin`
- Depends on `Universe`, `CollisionModule`
- Registers [InventorySystems](../com.hypixel.hytale.server.core.inventory/InventorySystems.md) and condition codecs
