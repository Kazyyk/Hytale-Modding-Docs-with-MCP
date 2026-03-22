---
title: "SpawnEntityTransactionRecord"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.transaction"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.transaction.SpawnEntityTransactionRecord"
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
public class SpawnEntityTransactionRecord extends TransactionRecord
```

Concrete implementation extending `TransactionRecord`.

## Fields

| Field | Type | Description |
|---|---|---|
| `worldUUID` | `UUID` | UUID field. |
| `entityUUID` | `UUID` | UUID field. |

## Constructors

| Constructor | Description |
|---|---|
| `SpawnEntityTransactionRecord(@Nonnull UUID worldUUID, @Nonnull UUID entityUUID)` | Creates a new SpawnEntityTransactionRecord instance. |
| `SpawnEntityTransactionRecord()` | Creates a new SpawnEntityTransactionRecord instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `revert()` | `void` | public method. |
| `complete()` | `void` | public method. |
| `unload()` | `void` | public method. |
| `shouldBeSerialized()` | `boolean` | public method. |
| `removeEntity()` | `void` | private method. |
| `toString()` | `String` | public method. |
