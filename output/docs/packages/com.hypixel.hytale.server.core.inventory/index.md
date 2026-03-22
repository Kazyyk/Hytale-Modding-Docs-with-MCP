---
title: "com.hypixel.hytale.server.core.inventory"
kind: "package"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

Core inventory system for managing item containers, item stacks, material quantities, and resource tracking for entities.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [Inventory](Inventory.md) | class | public | Entity inventory with hotbar, storage, armor, utility, tools, and backpack sections |
| [ItemContext](ItemContext.md) | class | public | Binds an item stack to its container and slot |
| [ItemStack](ItemStack.md) | class | public | Quantity of an item with durability and metadata |
| [MaterialQuantity](MaterialQuantity.md) | class | public | Material quantity for crafting identified by item ID, resource type, or tag |
| [ResourceQuantity](ResourceQuantity.md) | class | public | Named resource quantity for crafting and resource systems |
