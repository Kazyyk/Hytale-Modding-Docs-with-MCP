---
title: "InventoryComponent.Utility"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Utility"
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
public static class InventoryComponent.Utility extends InventoryComponent implements Component<EntityStore>
```

Utility inventory section with slot filters that restrict to usable utility items. Tracks the active utility slot. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Utility>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Utility>` | `getComponentType()` |
| `public` | `byte` | `getActiveSlot()` |
| `public` | `void` | `setActiveSlot(byte activeSlot)` |
| `public` | `ItemStack` | `getActiveItem()` |
| `public` | `void` | `ensureCapacity(short capacity, List<ItemStack> remainder)` |
| `public` | `Component<EntityStore>` | `clone()` |
