---
title: "SortType"
kind: "enum"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.SortType"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:18:36Z"
tags:
  - "inventory"
  - "container"
  - "enum"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public enum SortType
```

Defines sorting strategies for item containers. Each constant provides a `Comparator<ItemStack>` used by `ItemContainer.sortItems()`.

## Enum Constants

| Constant | Sort Key | Notes |
|---|---|---|
| `NAME` | Item translation key | Alphabetical, ascending |
| `TYPE` | Item category (WEAPON, ARMOR, TOOL, ITEM, SPECIAL) | Grouped by type, then by name |
| `RARITY` | Item quality value | Descending by rarity, then by name |

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `SortType[]` | `VALUES` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Comparator<ItemStack>` | `getComparator()` |

## Relationships

- Used by `ItemContainer.sortItems()`
