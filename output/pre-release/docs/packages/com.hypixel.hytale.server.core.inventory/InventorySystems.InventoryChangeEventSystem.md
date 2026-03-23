---
title: "InventorySystems.InventoryChangeEventSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventorySystems.InventoryChangeEventSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
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
public abstract static class InventorySystems.InventoryChangeEventSystem extends EntityTickingSystem<EntityStore>
```

Abstract generic base system. Polls `ItemContainerChangeEvent` from the queued change events on the inventory component, wraps each into an `InventoryChangeEvent`, and invokes it on the entity via the command buffer.

## Relationships

- Part of [InventorySystems](InventorySystems.md)
- Operates on [InventoryComponent](InventoryComponent.md) subclasses
