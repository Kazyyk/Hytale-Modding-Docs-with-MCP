---
title: "WorldEmptyCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.removal"
fqcn: "com.hypixel.hytale.builtin.instances.removal.WorldEmptyCondition"
api_surface: false
extends: ~
implements: 
  - "RemovalCondition"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "instances"
---

**Package:** `com.hypixel.hytale.builtin.instances.removal`

```java
public class WorldEmptyCondition implements RemovalCondition
```

Implementation of `RemovalCondition`.

## Fields

| Field | Type | Description |
|---|---|---|
| `REMOVE_WHEN_EMPTY` | `RemovalCondition[]` | Static final RemovalCondition[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `WorldEmptyCondition()` | Creates a new WorldEmptyCondition instance. |
| `WorldEmptyCondition(double timeoutSeconds)` | Creates a new WorldEmptyCondition instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `shouldRemoveWorld(@Nonnull Store<ChunkStore> store)` | `boolean` | public method. |
