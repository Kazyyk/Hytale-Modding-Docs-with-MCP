---
title: "TransactionRecord"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.transaction"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.transaction.TransactionRecord"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.transaction`

```java
public abstract class TransactionRecord
```

Class in the transaction subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `status` | `TransactionStatus` | TransactionStatus field. |
| `reason` | `String` | String field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getStatus()` | `TransactionStatus` | public method. |
| `revert()` | `void` | public method. |
| `complete()` | `void` | public method. |
| `unload()` | `void` | public method. |
| `shouldBeSerialized()` | `boolean` | public method. |
| `fail(String reason)` | `TransactionRecord` | public method. |
| `toString()` | `String` | public method. |
| `appendTransaction(@Nullable TransactionRecord[] transactions, @Nonnull T transaction)` | `TransactionRecord[]` | static public method. |
