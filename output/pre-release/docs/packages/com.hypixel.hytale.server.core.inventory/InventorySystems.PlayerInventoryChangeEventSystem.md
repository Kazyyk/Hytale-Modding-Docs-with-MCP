---
title: "InventorySystems.PlayerInventoryChangeEventSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventorySystems.PlayerInventoryChangeEventSystem"
api_surface: false
extends: "EntityEventSystem<EntityStore, InventoryChangeEvent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:38Z"
tags:
  - "inventory"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public static class InventorySystems.PlayerInventoryChangeEventSystem extends EntityEventSystem<EntityStore, InventoryChangeEvent>
```

Handles `InventoryChangeEvent` for players. In Creative mode, auto-saves the hotbar when the hotbar container changes.

## Relationships

- Part of [InventorySystems](InventorySystems.md)
- Operates on [InventoryComponent](InventoryComponent.md) subclasses
