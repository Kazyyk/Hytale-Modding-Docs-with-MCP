---
title: "ListTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ListTransaction"
api_surface: true
extends: "Transaction>"
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
public class ListTransaction<T extends Transaction> implements Transaction
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `ListTransaction<?>` | `EMPTY_SUCCESSFUL_TRANSACTION` | `new ListTransaction(true)` |
| `public static final` | `ListTransaction<?>` | `EMPTY_FAILED_TRANSACTION` | `new ListTransaction(false)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `succeeded` |
| `private final` | `List<T>` | `list` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T extends Transaction> ListTransaction<T>` | `getEmptyTransaction(boolean succeeded)` |
| `private` | `` | `ListTransaction(boolean succeeded)` |
| `public` | `` | `ListTransaction(boolean succeeded, @Nonnull List<T> list)` |
| `public` | `boolean` | `succeeded()` |
| `public` | `boolean` | `wasSlotModified(short slot)` |
| `public` | `List<T>` | `getList()` |
| `public` | `int` | `size()` |
| `public` | `ListTransaction<T>` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `ListTransaction<T>` | `fromParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `String` | `toString()` |
