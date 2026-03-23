---
title: "InventoryComponent.Tool"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Tool"
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
public static class InventoryComponent.Tool extends InventoryComponent implements Component<EntityStore>
```

Tool inventory section with active slot and wielding state tracking. The `usingToolsItem` flag indicates whether the entity is currently using a tool item versus a hotbar item. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Tool>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Tool>` | `getComponentType()` |
| `public` | `byte` | `getActiveSlot()` |
| `public` | `void` | `setActiveSlot(byte activeSlot)` |
| `public` | `ItemStack` | `getActiveItem()` |
| `public` | `boolean` | `isUsingToolsItem()` |
| `public` | `void` | `setUsingToolsItem(boolean usingToolsItem)` |
| `public` | `void` | `ensureCapacity(short capacity, List<ItemStack> remainder)` |
| `public` | `Component<EntityStore>` | `clone()` |
