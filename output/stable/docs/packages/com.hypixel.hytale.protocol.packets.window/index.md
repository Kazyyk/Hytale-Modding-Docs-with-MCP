---
title: "com.hypixel.hytale.protocol.packets.window"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.window"
fqcn: "com.hypixel.hytale.protocol.packets.window"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "window"
---

**Package:** `com.hypixel.hytale.protocol.packets.window`

Window and inventory interaction network packets for the Hytale protocol. Defines the window action hierarchy for crafting, slot selection, block changes, sorting, tier upgrades, and category updates, plus window open/close/update packets.

## Types

| Type | Kind | Description |
|---|---|---|
| [WindowAction](WindowAction.md) | class | Abstract base class for all window actions. |
| [WindowType](WindowType.md) | enum | Enumeration of window types: Inventory, Chest, Crafting, Anvil, Vendor, Enchanting, Cauldron, Loom. |
| [CancelCraftingAction](CancelCraftingAction.md) | class | Window action to cancel an in-progress crafting operation. |
| [ChangeBlockAction](ChangeBlockAction.md) | class | Window action to change the block associated with a window. |
| [ClientOpenWindow](ClientOpenWindow.md) | class | Client-to-server packet (ID 143) requesting a window be opened, specifying window type and entity reference. |
| [CloseWindow](CloseWindow.md) | class | Bidirectional packet (ID 144) signaling a window close. |
| [CraftItemAction](CraftItemAction.md) | class | Window action to craft an item by specifying source slot, destination slot, and quantity. |
| [CraftRecipeAction](CraftRecipeAction.md) | class | Window action to craft using a specific recipe. |
| [OpenWindow](OpenWindow.md) | class | Server-to-client packet (ID 142) opening a window, specifying type, title, slot count, and window data. |
| [SelectSlotAction](SelectSlotAction.md) | class | Window action representing a slot selection or item move. |
| [SendWindowAction](SendWindowAction.md) | class | Client-to-server packet (ID 145) wrapping a `WindowAction` for server processing. |
| [SetActiveAction](SetActiveAction.md) | class | Window action setting the active hotbar slot. |
| [SortItemsAction](SortItemsAction.md) | class | Window action to sort items within a window. |
| [TierUpgradeAction](TierUpgradeAction.md) | class | Window action for upgrading a tier in a window (e. |
| [UpdateCategoryAction](UpdateCategoryAction.md) | class | Window action to update the selected category in a window. |
| [UpdateWindow](UpdateWindow.md) | class | Server-to-client packet (ID 146) updating window contents with an array of `ItemStackNet` items and metadata. |
