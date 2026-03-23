---
title: "InventoryHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.InventoryHelper"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class InventoryHelper
```

Static utility class for NPC inventory management. Provides methods for finding items by pattern/name, checking hotbar/inventory contents, equipping items, and managing armor slots.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `matchesItem(String pattern, ItemStack itemStack)` |
| `public static` | `boolean` | `matchesItem(List<String> patterns, ItemStack itemStack)` |
| `public static` | `boolean` | `itemKeyExists(String name)` |
| `public static` | `boolean` | `itemKeyIsBlockType(String name)` |
| `public static` | `boolean` | `itemDropListKeyExists(String name)` |
| `public static` | `byte` | `findHotbarSlotWithItem(Inventory inventory, String name)` |
| `public static` | `short` | `findHotbarSlotWithItem(Inventory inventory, List<String> name)` |
| `public static` | `byte` | `findHotbarEmptySlot(Inventory inventory)` |
| `public static` | `short` | `findInventorySlotWithItem(Inventory inventory, String name)` |
| `public static` | `short` | `findInventorySlotWithItem(Inventory inventory, List<String> name)` |
| `public static` | `int` | `countItems(ItemContainer container, List<String> name)` |
| `public static` | `int` | `countFreeSlots(ItemContainer container)` |
| `public static` | `boolean` | `hotbarContainsItem(Inventory inventory, String name)` |
| `public static` | `boolean` | `hotbarContainsItem(Inventory inventory, List<String> name)` |
| `public static` | `boolean` | `holdsItem(Inventory inventory, String name)` |
| `public static` | `boolean` | `containsItem(Inventory inventory, String name)` |
| `public static` | `boolean` | `containsItem(Inventory inventory, List<String> name)` |
| `public static` | `boolean` | `clearItemInHand(Inventory inventory, byte slotHint)` |
| `public static` | `void` | `removeItemInHand(Inventory inventory, int count)` |
| `public static` | `boolean` | `checkHotbarSlot(Inventory inventory, byte slot)` |
