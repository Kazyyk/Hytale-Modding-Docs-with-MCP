---
title: "ArmorSlotAddFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.ArmorSlotAddFilter"
api_surface: false
extends: ~
implements: ["ItemSlotFilter"]
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
  - "armor"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public class ArmorSlotAddFilter implements ItemSlotFilter
```

Slot filter that only permits items whose armor slot matches the configured `ItemArmorSlot`. Allows `null` items (empty slots). Used by `ItemContainerUtil.trySetArmorFilters` to restrict the first 5 slots of an armor container.

## Constructors

```java
public ArmorSlotAddFilter(ItemArmorSlot itemArmorSlot)
```

Creates a filter for the given armor slot.

## Methods

```java
@Override
public boolean test(@Nullable Item item)
```

Returns `true` if the item is `null`, or if the item has armor data with a matching armor slot.

```java
public ItemArmorSlot getItemArmorSlot()
```

Returns the armor slot this filter requires.
