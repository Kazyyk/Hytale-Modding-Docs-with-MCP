---
title: "SortType"
kind: "enum"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.SortType"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "sorting"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public enum SortType
```

Defines inventory sorting strategies. Each constant provides a `Comparator<ItemStack>` that orders items by a specific criterion.

## Enum Constants

| Constant | Sort Key | Inverted | Then Name |
|---|---|---|---|
| `NAME` | Translation key | No | No |
| `TYPE` | Item category (WEAPON, ARMOR, TOOL, ITEM, SPECIAL) | No | Yes |
| `RARITY` | Item quality value | Yes (highest first) | Yes |

## Methods

```java
@Nonnull
public Comparator<ItemStack> getComparator()
```

Returns the comparator for this sort type. Nulls are sorted last.

```java
@Nonnull
public com.hypixel.hytale.protocol.SortType toPacket()
```

Converts this server-side sort type to its protocol equivalent.

```java
@Nonnull
public static SortType fromPacket(@Nonnull com.hypixel.hytale.protocol.SortType sortType_)
```

Converts a protocol sort type to its server-side equivalent.

## Inner Types

### Dummy.ItemType

```java
static enum ItemType
```

Internal enum used by the `TYPE` sort strategy. Classifies items into `WEAPON`, `ARMOR`, `TOOL`, `ITEM`, or `SPECIAL` based on which sub-config fields are present on the `Item`.
