---
title: "DirectionalGrowthBehaviour.BlockTypeWeight"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.DirectionalGrowthBehaviour.BlockTypeWeight"
api_surface: false
extends: null
implements:
  - "IWeightedElement"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "spread"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
public static class DirectionalGrowthBehaviour.BlockTypeWeight implements IWeightedElement
```

A weighted entry defining a block type and its probability for directional spread in [DirectionalGrowthBehaviour](DirectionalGrowthBehaviour.md).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `weight` |
| `protected` | `String` | `blockTypeKey` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getWeight()` |
| `public` | `String` | `getBlockTypeKey()` |
