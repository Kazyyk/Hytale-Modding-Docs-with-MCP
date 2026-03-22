---
title: "UseEntityTransactionRecord"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.transaction"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.transaction.UseEntityTransactionRecord"
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
public class UseEntityTransactionRecord extends TransactionRecord
```

Concrete implementation extending `TransactionRecord`.

## Fields

| Field | Type | Description |
|---|---|---|
| `objectiveUUID` | `UUID` | UUID field. |
| `taskId` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `UseEntityTransactionRecord(UUID objectiveUUID, String taskId)` | Creates a new UseEntityTransactionRecord instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `revert()` | `void` | public method. |
| `complete()` | `void` | public method. |
| `unload()` | `void` | public method. |
| `shouldBeSerialized()` | `boolean` | public method. |
| `toString()` | `String` | public method. |
