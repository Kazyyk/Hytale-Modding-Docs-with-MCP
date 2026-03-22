---
title: "ItemStackTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ItemStackTransaction"
api_surface: true
extends: null
implements:
  - "Transaction"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "inventory"
---
**Package:** `com.hypixel.hytale.server.core.inventory.transaction`

```java
public class ItemStackTransaction implements Transaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `succeeded` |
| `private final` | `ActionType` | `action` |
| `private final` | `ItemStack` | `query` |
| `private final` | `ItemStack` | `remainder` |
| `private final` | `boolean` | `allOrNothing` |
| `private final` | `boolean` | `filter` |
| `private final` | `List<ItemStackSlotTransaction>` | `slotTransactions` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ItemStackTransaction( boolean succeeded, @Nullable ActionType action, @Nullable ItemStack query, @Nullable ItemStack remainder, boolean allOrNothing, boolean filter, @Nonnull List<ItemStackSlotTransaction> slotTransactions )` |
| `public` | `boolean` | `succeeded()` |
| `public` | `boolean` | `wasSlotModified(short slot)` |
| `public` | `ActionType` | `getAction()` |
| `public` | `ItemStack` | `getQuery()` |
| `public` | `ItemStack` | `getRemainder()` |
| `public` | `boolean` | `isAllOrNothing()` |
| `public` | `boolean` | `isFilter()` |
| `public` | `List<ItemStackSlotTransaction>` | `getSlotTransactions()` |
| `public` | `ItemStackTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ItemStackTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
