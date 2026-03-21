---
title: "TagFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.TagFilter"
api_surface: false
extends: ~
implements: ["ItemSlotFilter"]
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
  - "tag"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public class TagFilter implements ItemSlotFilter
```

Slot filter that only permits items whose expanded tag indexes contain the configured tag index. Checks via `item.getData().getExpandedTagIndexes().contains(tagIndex)`.

## Constructors

```java
public TagFilter(int tagIndex)
```

Creates a filter for the given tag index.

## Methods

```java
@Override
public boolean test(@Nullable Item item)
```

Returns `true` if the item is `null` or its expanded tag indexes contain the configured tag index.
