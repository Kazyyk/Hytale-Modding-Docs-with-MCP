---
title: "MaterialSlotTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.MaterialSlotTransaction"
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
public class MaterialSlotTransaction extends SlotTransaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `MaterialQuantity` | `query` |
| `private final` | `int` | `remainder` |
| `private final` | `SlotTransaction` | `transaction` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MaterialSlotTransaction(@Nonnull MaterialQuantity query, int remainder, @Nonnull SlotTransaction transaction)` |
| `public` | `MaterialQuantity` | `getQuery()` |
| `public` | `int` | `getRemainder()` |
| `public` | `SlotTransaction` | `getTransaction()` |
| `public` | `MaterialSlotTransaction` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `MaterialSlotTransaction` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
