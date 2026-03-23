---
title: "ItemSlotFilter"
kind: "interface"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.ItemSlotFilter"
api_surface: false
extends: "SlotFilter"
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
public interface ItemSlotFilter extends SlotFilter
```

Extension of [SlotFilter](SlotFilter.md) that extracts the `Item` from the `ItemStack` before testing. The default `test(FilterActionType, ItemContainer, short, ItemStack)` implementation delegates to `test(Item)`, resolving the item from the stack for ADD actions or from the slot contents for REMOVE/DROP actions.

## Methods

```java
boolean test(@Nullable Item var1)
```

Tests whether the given item is permitted. Returns `true` to allow, `false` to block. A `null` item (empty slot) is typically allowed.

## Known Implementations

- [ArmorSlotAddFilter](ArmorSlotAddFilter.md)
- [NoDuplicateFilter](NoDuplicateFilter.md)
- [ResourceFilter](ResourceFilter.md)
- [TagFilter](TagFilter.md)
