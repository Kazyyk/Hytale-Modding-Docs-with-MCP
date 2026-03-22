---
title: "DirectionalGrowthBehaviour.VerticalDirection"
kind: "enum"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.DirectionalGrowthBehaviour.VerticalDirection"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "spread"
  - "enum"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
private static enum DirectionalGrowthBehaviour.VerticalDirection
```

Defines the vertical direction constraint for [DirectionalGrowthBehaviour](DirectionalGrowthBehaviour.md) spread.

## Enum Constants

| Constant | Value | Description |
|---|---|---|
| `DOWNWARDS` | `-1` | Spread only below the source position. |
| `BOTH` | `0` | Spread randomly above or below. |
| `UPWARDS` | `1` | Spread only above the source position. |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getValue()` |
