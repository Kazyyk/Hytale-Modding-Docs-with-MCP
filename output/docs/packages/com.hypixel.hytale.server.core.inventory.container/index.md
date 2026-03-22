---
title: "com.hypixel.hytale.server.core.inventory.container"
kind: "package"
package: "com.hypixel.hytale.server.core.inventory.container"
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

The inventory container package provides the core abstraction for slot-based item storage. [ItemContainer](ItemContainer.md) is the abstract base with thread-safe operations for adding, removing, moving, and replacing item stacks. Concrete implementations include [SimpleItemContainer](SimpleItemContainer.md) (the standard fixed-capacity container), [CombinedItemContainer](CombinedItemContainer.md) (composite over multiple children), [DelegateItemContainer](DelegateItemContainer.md) (filter wrapper), [EmptyItemContainer](EmptyItemContainer.md) (null object), and [ItemStackItemContainer](ItemStackItemContainer.md) (nested storage inside an item's metadata).

## API Types

| Type | Kind | Description |
|---|---|---|
| [ItemContainer](ItemContainer.md) | class | Abstract base class for all item containers. |
| [CombinedItemContainer](CombinedItemContainer.md) | class | Composite container spanning multiple child containers. |
| [SlotReplacementFunction](SlotReplacementFunction.md) | interface | Functional interface for bulk slot replacement. |
| [SortType](SortType.md) | enum | Inventory sorting strategies (NAME, TYPE, RARITY). |
| [TestRemoveItemSlotResult](TestRemoveItemSlotResult.md) | class | Dry-run removal result accumulator. |

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [SimpleItemContainer](SimpleItemContainer.md) | class | Thread-safe container backed by a sparse slot map. |
| [DelegateItemContainer](DelegateItemContainer.md) | class | Wrapper adding per-slot filters over a delegate container. |
| [EmptyItemContainer](EmptyItemContainer.md) | class | Zero-capacity singleton container (null object). |
| [ItemStackItemContainer](ItemStackItemContainer.md) | class | Nested container stored in an item stack's BSON metadata. |
| [ItemContainerUtil](ItemContainerUtil.md) | class | Utility for applying armor and slot filters. |
| [InternalContainerUtilItemStack](InternalContainerUtilItemStack.md) | class | Internal item-stack add/remove operations. |
| [InternalContainerUtilMaterial](InternalContainerUtilMaterial.md) | class | Internal material-based removal operations. |
| [InternalContainerUtilResource](InternalContainerUtilResource.md) | class | Internal resource-based removal operations. |
| [InternalContainerUtilTag](InternalContainerUtilTag.md) | class | Internal tag-based removal operations. |

## Inner Types

| Type | Kind | Parent | Description |
|---|---|---|---|
| [ItemContainer.ItemContainerChangeEvent](ItemContainer.md#itemcontainerchangeevent) | record | ItemContainer | Event fired on container content changes. |
| [ItemContainer.TempItemData](ItemContainer.md#tempitemdata) | record | ItemContainer | Lightweight item ID + quantity holder. |
| [SortType.Dummy.ItemType](SortType.md#dummyitemtype) | enum | SortType | Internal item categorization for TYPE sorting. |

## Subpackage

- [`com.hypixel.hytale.server.core.inventory.container.filter`](../com.hypixel.hytale.server.core.inventory.container.filter/index.md) -- Slot filter interfaces and implementations.
