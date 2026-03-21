---
title: "CraftingManager.BenchUpgradingJob"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.component"
fqcn: "com.hypixel.hytale.builtin.crafting.component.CraftingManager.BenchUpgradingJob"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "crafting"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

```java
private static class BenchUpgradingJob
```

Inner class of [CraftingManager](CraftingManager.md) that tracks a bench tier upgrade operation.

## Fields

| Field | Type | Description |
|---|---|---|
| `window` | `BenchWindow` | The bench window UI. |
| `timeSeconds` | `float` | Total upgrade duration. |
| `timeSecondsCompleted` | `float` | Elapsed time. |
| `lastSentPercent` | `float` | Last progress percentage sent to client. |

## Methods

```java
public float computeLoadingPercent()
```

Returns the upgrade progress as a float between 0.0 and 1.0.
