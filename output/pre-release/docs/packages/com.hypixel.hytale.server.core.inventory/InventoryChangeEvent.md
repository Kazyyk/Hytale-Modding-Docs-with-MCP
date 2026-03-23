---
title: "InventoryChangeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryChangeEvent"
api_surface: false
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:38Z"
tags:
  - "inventory"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class InventoryChangeEvent extends EcsEvent
```

ECS event fired when an inventory component's item container changes. Carries the component type that changed, the inventory component instance, the affected item container, and the transaction that caused the change. Dispatched by the various `InventoryChangeEventSystem` implementations during entity ticking.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `InventoryChangeEvent(ComponentType<EntityStore, ? extends InventoryComponent> componentType, InventoryComponent inventory, ItemContainer itemContainer, Transaction transaction)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ComponentType<EntityStore, ? extends InventoryComponent>` | `getComponentType()` |
| `public` | `InventoryComponent` | `getInventory()` |
| `public` | `ItemContainer` | `getItemContainer()` |
| `public` | `Transaction` | `getTransaction()` |

## Relationships

- Extends `EcsEvent`
- Dispatched by [InventorySystems](InventorySystems.md) inner event systems
- References [InventoryComponent](InventoryComponent.md) and `ItemContainer`
