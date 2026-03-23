---
title: "InventoryComponent.Hotbar"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Hotbar"
api_surface: false
extends: "InventoryComponent"
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:38Z"
tags:
  - "inventory"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public static class InventoryComponent.Hotbar extends InventoryComponent implements Component<EntityStore>
```

Hotbar inventory section with active slot tracking. Tracks which slot is currently selected by the player. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Hotbar>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Hotbar>` | `getComponentType()` |
| `public` | `byte` | `getActiveSlot()` |
| `public` | `void` | `setActiveSlot(byte activeSlot)` |
| `public` | `ItemStack` | `getActiveItem()` |
| `public` | `void` | `ensureCapacity(short capacity, List<ItemStack> remainder)` |
| `public` | `Component<EntityStore>` | `clone()` |
