---
title: "ClearTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ClearTransaction"
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
public class ClearTransaction implements Transaction
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `ClearTransaction` | `EMPTY` | `new ClearTransaction(true, (short)0, ItemStack.EMPTY_ARRAY)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `succeeded` |
| `private final` | `short` | `start` |
| `private final` | `ItemStack[]` | `items` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ClearTransaction(boolean succeeded, short start, @Nonnull ItemStack[] items)` |
| `public` | `boolean` | `succeeded()` |
| `public` | `boolean` | `wasSlotModified(short slot)` |
| `public` | `ItemStack[]` | `getItems()` |
| `public` | `ClearTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ClearTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
