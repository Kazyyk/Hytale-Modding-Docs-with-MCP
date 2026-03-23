---
title: "EmptyItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.EmptyItemContainer"
api_surface: false
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:18:36Z"
tags:
  - "inventory"
  - "container"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class EmptyItemContainer extends ItemContainer
```

Singleton zero-capacity item container used as the default for uninitialized inventory components. All slot operations throw `UnsupportedOperationException`. Filter and change event operations are no-ops.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `EmptyItemContainer` | `INSTANCE` |
| `public static final` | `BuilderCodec<EmptyItemContainer>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `short` | `getCapacity()` |
| `public` | `ClearTransaction` | `clear()` |
| `public` | `EmptyItemContainer` | `clone()` |
| `public` | `boolean` | `isEmpty()` |

## Relationships

- Extends `ItemContainer`
- Used as default by [InventoryComponent](../com.hypixel.hytale.server.core.inventory/InventoryComponent.md)
