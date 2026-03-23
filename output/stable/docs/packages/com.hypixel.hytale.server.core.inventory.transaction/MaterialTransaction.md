---
title: "MaterialTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.MaterialTransaction"
api_surface: true
extends: "ListTransaction"
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
public class MaterialTransaction extends ListTransaction<MaterialSlotTransaction>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ActionType` | `action` |
| `private final` | `MaterialQuantity` | `material` |
| `private final` | `int` | `remainder` |
| `private final` | `boolean` | `allOrNothing` |
| `private final` | `boolean` | `exactAmount` |
| `private final` | `boolean` | `filter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MaterialTransaction( boolean succeeded, @Nonnull ActionType action, @Nonnull MaterialQuantity material, int remainder, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<MaterialSlotTransaction> slotTransactions )` |
| `public` | `ActionType` | `getAction()` |
| `public` | `MaterialQuantity` | `getMaterial()` |
| `public` | `int` | `getRemainder()` |
| `public` | `boolean` | `isAllOrNothing()` |
| `public` | `boolean` | `isExactAmount()` |
| `public` | `boolean` | `isFilter()` |
| `public` | `MaterialTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `MaterialTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
