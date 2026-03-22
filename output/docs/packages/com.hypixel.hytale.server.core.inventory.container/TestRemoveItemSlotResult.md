---
title: "TestRemoveItemSlotResult"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.TestRemoveItemSlotResult"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "transaction"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class TestRemoveItemSlotResult
```

Accumulates the result of a dry-run item removal test. Records which slots were "picked" and how much quantity remains to be fulfilled.

Used internally by `InternalContainerUtilItemStack`, `InternalContainerUtilMaterial`, `InternalContainerUtilResource`, and `InternalContainerUtilTag` to verify that a removal can succeed before committing changes.

## Fields

| Type | Name | Description |
|---|---|---|
| `Map<Short, Integer>` | `picked` | Map of slot index to quantity picked from that slot. |
| `int` | `quantityRemaining` | Quantity still needed after the test pass. |

## Constructors

```java
public TestRemoveItemSlotResult(int testQuantityRemaining)
```

Creates a result with the given initial remaining quantity.

## Methods

```java
public boolean hasResult()
```

Returns `true` if at least one slot was picked.

```java
public Set<Short> getPickedSlots()
```

Returns the set of slot indices that contributed to the removal.
