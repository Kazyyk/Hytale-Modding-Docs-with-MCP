---
title: "TagTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.TagTransaction"
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
public class TagTransaction extends ListTransaction<TagSlotTransaction>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ActionType` | `action` |
| `private final` | `int` | `tagIndex` |
| `private final` | `int` | `remainder` |
| `private final` | `boolean` | `allOrNothing` |
| `private final` | `boolean` | `exactAmount` |
| `private final` | `boolean` | `filter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `TagTransaction( boolean succeeded, @Nonnull ActionType action, int tagIndex, int remainder, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<TagSlotTransaction> slotTransactions )` |
| `public` | `ActionType` | `getAction()` |
| `public` | `int` | `getTagIndex()` |
| `public` | `int` | `getRemainder()` |
| `public` | `boolean` | `isAllOrNothing()` |
| `public` | `boolean` | `isExactAmount()` |
| `public` | `boolean` | `isFilter()` |
| `public` | `TagTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `TagTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
