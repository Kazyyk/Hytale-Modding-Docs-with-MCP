---
title: "com.hypixel.hytale.server.core.inventory.container.filter"
kind: "package"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

The filter subpackage defines the slot-filtering system used by item containers. [SlotFilter](SlotFilter.md) is the base functional interface; [ItemSlotFilter](ItemSlotFilter.md) extends it to simplify item-based checks. Concrete implementations restrict slots by armor type, resource type, tag index, or uniqueness.

[FilterActionType](FilterActionType.md) identifies the operation being filtered (ADD, REMOVE, DROP). [FilterType](FilterType.md) provides global input/output gating at the container level.

## API Types

| Type | Kind | Description |
|---|---|---|
| [SlotFilter](SlotFilter.md) | interface | Base functional interface for per-slot filtering. |
| [FilterActionType](FilterActionType.md) | enum | Identifies the action being filtered (ADD, REMOVE, DROP). |
| [FilterType](FilterType.md) | enum | Global container input/output filter. |

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [ItemSlotFilter](ItemSlotFilter.md) | interface | Extension of `SlotFilter` that delegates to `Item`-based tests. |
| [ArmorSlotAddFilter](ArmorSlotAddFilter.md) | class | Restricts a slot to a specific armor slot type. |
| [NoDuplicateFilter](NoDuplicateFilter.md) | class | Prevents duplicate item types in a container. |
| [ResourceFilter](ResourceFilter.md) | class | Restricts a slot to items matching a resource type. |
| [TagFilter](TagFilter.md) | class | Restricts a slot to items matching a tag index. |
