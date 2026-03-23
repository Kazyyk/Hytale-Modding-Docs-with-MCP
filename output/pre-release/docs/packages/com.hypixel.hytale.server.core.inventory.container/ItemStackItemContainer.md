---
title: "ItemStackItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.ItemStackItemContainer"
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
public class ItemStackItemContainer extends ItemContainer
```

Item container backed by an item stack's BSON metadata. Stores sub-items inside the metadata of a parent item stack (e.g., a bag or backpack item). Writes changes back to the parent container whenever items are modified. Not clonable.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `KeyedCodec<BsonDocument>` | `CONTAINER_CODEC` |
| `public static` | `KeyedCodec<Short>` | `CAPACITY_CODEC` |
| `public static` | `KeyedCodec<ItemStack[]>` | `ITEMS_CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ItemContainer` | `getParentContainer()` |
| `public` | `short` | `getItemStackSlot()` |
| `public` | `ItemStack` | `getOriginalItemStack()` |
| `public` | `boolean` | `isItemStackValid()` |
| `public` | `short` | `getCapacity()` |
| `public` | `ItemStack` | `getItemStack(short slot)` |
| `public static` | `void` | `writeToItemStack(ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)` |
| `public static` | `ItemStackItemContainer` | `getContainer(ItemContainer itemContainer, short slot)` |
| `public static` | `ItemStackItemContainer` | `makeContainerWithCapacity(ItemContainer itemContainer, short slot, short capacity)` |
| `public static` | `ItemStackItemContainer` | `ensureContainer(ItemContainer itemContainer, short slot, short capacity)` |
| `public static` | `ItemStackItemContainer` | `ensureConfiguredContainer(ItemContainer itemContainer, short slot, ItemStackContainerConfig config)` |

## Relationships

- Extends `ItemContainer`
