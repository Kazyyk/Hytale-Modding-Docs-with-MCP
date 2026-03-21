---
title: "SpawnTreasureChestTransactionRecord"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.transaction"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.transaction.SpawnTreasureChestTransactionRecord"
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
public class SpawnTreasureChestTransactionRecord extends TransactionRecord
```

Concrete implementation extending `TransactionRecord`.

## Fields

| Field | Type | Description |
|---|---|---|
| `worldUUID` | `UUID` | UUID field. |
| `blockPosition` | `Vector3i` | Vector3i field. |

## Constructors

| Constructor | Description |
|---|---|
| `SpawnTreasureChestTransactionRecord(UUID worldUUID, Vector3i blockPosition)` | Creates a new SpawnTreasureChestTransactionRecord instance. |
| `SpawnTreasureChestTransactionRecord()` | Creates a new SpawnTreasureChestTransactionRecord instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `revert()` | `void` | public method. |
| `complete()` | `void` | public method. |
| `unload()` | `void` | public method. |
| `shouldBeSerialized()` | `boolean` | public method. |
| `toString()` | `String` | public method. |
