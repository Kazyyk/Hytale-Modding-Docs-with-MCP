---
title: "RegistrationTransactionRecord"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.transaction"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.transaction.RegistrationTransactionRecord"
api_surface: false
extends: "TransactionRecord"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.transaction`

```java
public class RegistrationTransactionRecord extends TransactionRecord
```

Concrete implementation extending `TransactionRecord`.

## Fields

| Field | Type | Description |
|---|---|---|
| `registration` | `BooleanConsumer` | BooleanConsumer field. |

## Constructors

| Constructor | Description |
|---|---|
| `RegistrationTransactionRecord(BooleanConsumer registration)` | Creates a new RegistrationTransactionRecord instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `revert()` | `void` | public method. |
| `complete()` | `void` | public method. |
| `unload()` | `void` | public method. |
| `shouldBeSerialized()` | `boolean` | public method. |
| `toString()` | `String` | public method. |
| `wrap(@Nonnull EventRegistry registry)` | `TransactionRecord[]` | static public method. |
| `append(@Nonnull TransactionRecord[] arr, @Nonnull EventRegistry registry)` | `TransactionRecord[]` | static public method. |
