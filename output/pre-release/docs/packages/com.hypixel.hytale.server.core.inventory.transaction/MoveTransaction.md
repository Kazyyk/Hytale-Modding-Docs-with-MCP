---
title: "MoveTransaction"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.MoveTransaction"
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
public class MoveTransaction<T extends Transaction> implements Transaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `succeeded` |
| `private final` | `SlotTransaction` | `removeTransaction` |
| `private final` | `MoveType` | `moveType` |
| `private final` | `ItemContainer` | `otherContainer` |
| `private final` | `T` | `addTransaction` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `MoveTransaction( boolean succeeded, @Nonnull SlotTransaction removeTransaction, @Nonnull MoveType moveType, @Nonnull ItemContainer otherContainer, T addTransaction )` |
| `public` | `boolean` | `succeeded()` |
| `public` | `SlotTransaction` | `getRemoveTransaction()` |
| `public` | `MoveType` | `getMoveType()` |
| `public` | `ItemContainer` | `getOtherContainer()` |
| `public` | `T` | `getAddTransaction()` |
| `public` | `MoveTransaction<T>` | `toInverted(@Nonnull ItemContainer itemContainer)` |
| `public` | `boolean` | `wasSlotModified(short slot)` |
| `public` | `MoveTransaction<T>` | `toParent(ItemContainer parent, short start, ItemContainer container)` |
| `public` | `MoveTransaction<T>` | `fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)` |
| `public` | `String` | `toString()` |
