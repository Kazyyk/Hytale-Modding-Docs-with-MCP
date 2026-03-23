---
title: "SimpleItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.SimpleItemContainer"
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
public class SimpleItemContainer extends ItemContainer
```

Standard fixed-capacity item container backed by a `Short2ObjectMap<ItemStack>`. Provides thread-safe read/write operations via `ReentrantReadWriteLock`. Supports slot filtering, global filtering, codec serialization, and utility methods for adding/dropping items with overflow handling.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SimpleItemContainer>` | `CODEC` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SimpleItemContainer(short capacity)` |
| `public` | `SimpleItemContainer(SimpleItemContainer other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `short` | `getCapacity()` |
| `public` | `SimpleItemContainer` | `clone()` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `void` | `setGlobalFilter(FilterType globalFilter)` |
| `public` | `void` | `setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)` |
| `public` | `ItemStack` | `getItemStack(short slot)` |
| `public static` | `ItemContainer` | `getNewContainer(short capacity)` |
| `public static` | `boolean` | `addOrDropItemStack(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, ItemStack itemStack)` |
| `public static` | `boolean` | `addOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)` |
| `public static` | `boolean` | `tryAddOrderedOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)` |

## Relationships

- Extends `ItemContainer`
- Used by [InventoryComponent](../com.hypixel.hytale.server.core.inventory/InventoryComponent.md) and [ItemContainerBlock](../com.hypixel.hytale.server.core.modules.block.components/ItemContainerBlock.md)
