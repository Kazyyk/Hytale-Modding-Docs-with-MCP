---
title: "SlotFilter"
kind: "interface"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.SlotFilter"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
  - "functional"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public interface SlotFilter
```

Functional interface for per-slot inventory filtering. Determines whether an action (add, remove, or drop) is permitted on a specific slot.

## Constants

| Type | Name | Description |
|---|---|---|
| `SlotFilter` | `ALLOW` | Filter that always returns `true` (permits all actions). |
| `SlotFilter` | `DENY` | Filter that always returns `false` (blocks all actions). |

## Methods

```java
boolean test(FilterActionType var1, ItemContainer var2, short var3, @Nullable ItemStack var4)
```

Tests whether the given action is permitted on the specified slot. Returns `true` to allow, `false` to block.

## Known Implementations

- [ItemSlotFilter](ItemSlotFilter.md) -- extends `SlotFilter` to delegate to an `Item`-based test.
- [ArmorSlotAddFilter](ArmorSlotAddFilter.md) -- restricts a slot to a specific armor slot type.
- [NoDuplicateFilter](NoDuplicateFilter.md) -- prevents duplicate item types in a container.
- [ResourceFilter](ResourceFilter.md) -- restricts a slot to items matching a resource type.
- [TagFilter](TagFilter.md) -- restricts a slot to items matching a tag index.
