---
title: "TagSlotTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.TagSlotTransaction"
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
public class TagSlotTransaction extends SlotTransaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `query` |
| `private final` | `int` | `remainder` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `TagSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull int query, int remainder )` |
| `public` | `int` | `getQuery()` |
| `public` | `int` | `getRemainder()` |
| `public` | `TagSlotTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `TagSlotTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
