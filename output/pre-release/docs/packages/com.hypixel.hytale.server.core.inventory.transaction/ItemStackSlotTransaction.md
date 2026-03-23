---
title: "ItemStackSlotTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ItemStackSlotTransaction"
api_surface: true
extends: "SlotTransaction"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "inventory"
---
**Package:** `com.hypixel.hytale.server.core.inventory.transaction`

```java
public class ItemStackSlotTransaction extends SlotTransaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `addToExistingSlot` |
| `private final` | `ItemStack` | `query` |
| `private final` | `ItemStack` | `remainder` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ItemStackSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, boolean addToExistingSlot, @Nullable ItemStack query, @Nullable ItemStack remainder )` |
| `public` | `boolean` | `isAddToExistingSlot()` |
| `public` | `ItemStack` | `getQuery()` |
| `public` | `ItemStack` | `getRemainder()` |
| `public` | `ItemStackSlotTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ItemStackSlotTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
