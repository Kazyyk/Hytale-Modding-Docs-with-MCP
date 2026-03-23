---
title: "ResourceSlotTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ResourceSlotTransaction"
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
public class ResourceSlotTransaction extends SlotTransaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ResourceQuantity` | `query` |
| `private final` | `int` | `remainder` |
| `private final` | `int` | `consumed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ResourceSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull ResourceQuantity query, int remainder, int consumed )` |
| `public` | `ResourceQuantity` | `getQuery()` |
| `public` | `int` | `getRemainder()` |
| `public` | `int` | `getConsumed()` |
| `public` | `ResourceSlotTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ResourceSlotTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
