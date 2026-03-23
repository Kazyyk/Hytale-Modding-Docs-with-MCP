---
title: "ItemContainerUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.ItemContainerUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class ItemContainerUtil
```

Utility class for applying common filter configurations to item containers.

## Methods

```java
public static <T extends ItemContainer> T trySetArmorFilters(T container)
```

If the container is a `SimpleItemContainer`, applies `ArmorSlotAddFilter` to the first 5 slots (matching `ItemArmorSlot.VALUES`), `NoDuplicateFilter` to slots 5+, and `SlotFilter.DENY` to any slots beyond the armor slot count.

```java
public static <T extends ItemContainer> T trySetSlotFilters(T container, SlotFilter filter)
```

If the container is a `SimpleItemContainer`, applies the given filter to all slots for the `ADD` action type.
