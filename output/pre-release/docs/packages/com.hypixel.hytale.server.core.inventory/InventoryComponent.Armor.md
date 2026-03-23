---
title: "InventoryComponent.Armor"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Armor"
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
public static class InventoryComponent.Armor extends InventoryComponent implements Component<EntityStore>
```

Armor inventory section. Applies armor-specific slot filters after decode. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Armor>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Armor>` | `getComponentType()` |
| `public` | `void` | `ensureCapacity(short capacity, List<ItemStack> remainder)` |
| `public` | `Component<EntityStore>` | `clone()` |
