---
title: "InventoryComponent.Storage"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Storage"
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
public static class InventoryComponent.Storage extends InventoryComponent implements Component<EntityStore>
```

Main storage inventory section. Extends [InventoryComponent](InventoryComponent.md).

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `BuilderCodec<InventoryComponent.Storage>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Storage>` | `getComponentType()` |
| `public` | `Component<EntityStore>` | `clone()` |
