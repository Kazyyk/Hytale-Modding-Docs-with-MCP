---
title: "NoDuplicateFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.NoDuplicateFilter"
api_surface: false
extends: ~
implements: ["ItemSlotFilter"]
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public class NoDuplicateFilter implements ItemSlotFilter
```

Slot filter that prevents adding items whose item ID already exists in the referenced `SimpleItemContainer`. Scans all slots of the container to check for duplicates. Rejects items with a `null` ID.

Used by `ItemContainerUtil.trySetArmorFilters` for armor slots 5 and above.

## Constructors

```java
public NoDuplicateFilter(SimpleItemContainer container)
```

Creates a filter that checks for duplicates in the given container.

## Methods

```java
@Override
public boolean test(@Nullable Item item)
```

Returns `false` if the item is `null`, has no ID, or an item with the same ID already exists in the container.
