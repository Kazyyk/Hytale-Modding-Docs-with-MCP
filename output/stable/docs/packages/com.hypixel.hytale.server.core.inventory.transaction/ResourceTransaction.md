---
title: "ResourceTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ResourceTransaction"
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
public class ResourceTransaction extends ListTransaction<ResourceSlotTransaction>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ActionType` | `action` |
| `private final` | `ResourceQuantity` | `resource` |
| `private final` | `int` | `remainder` |
| `private final` | `int` | `consumed` |
| `private final` | `boolean` | `allOrNothing` |
| `private final` | `boolean` | `exactAmount` |
| `private final` | `boolean` | `filter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ResourceTransaction( boolean succeeded, @Nonnull ActionType action, @Nonnull ResourceQuantity resource, int remainder, int consumed, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<ResourceSlotTransaction> slotTransactions )` |
| `public` | `ActionType` | `getAction()` |
| `public` | `ResourceQuantity` | `getResource()` |
| `public` | `int` | `getRemainder()` |
| `public` | `int` | `getConsumed()` |
| `public` | `boolean` | `isAllOrNothing()` |
| `public` | `boolean` | `isExactAmount()` |
| `public` | `boolean` | `isFilter()` |
| `public` | `ResourceTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ResourceTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
