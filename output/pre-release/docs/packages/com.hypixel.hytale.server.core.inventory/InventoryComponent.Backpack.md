---
title: "InventoryComponent.Backpack"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Backpack"
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
public static class InventoryComponent.Backpack extends InventoryComponent implements Component<EntityStore>
```

Resizable backpack inventory section. Can be dynamically resized via `resize()`. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Backpack>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Backpack>` | `getComponentType()` |
| `public` | `void` | `resize(short capacity, List<ItemStack> remainder)` |
| `public` | `Component<EntityStore>` | `clone()` |
