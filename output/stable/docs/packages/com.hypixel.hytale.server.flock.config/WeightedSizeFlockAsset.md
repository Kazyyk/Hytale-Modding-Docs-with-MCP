---
title: "WeightedSizeFlockAsset"
kind: "class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.WeightedSizeFlockAsset"
api_surface: false
extends: "FlockAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "flock"
---

**Package:** `com.hypixel.hytale.server.flock.config`

```java
public class WeightedSizeFlockAsset extends FlockAsset
```

Concrete implementation extending `FlockAsset`.

## Fields

| Field | Type | Description |
|---|---|---|
| `minSize` | `int` | int field. |
| `sizeWeights` | `double[]` | double[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `WeightedSizeFlockAsset()` | Creates a new WeightedSizeFlockAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getMinSize()` | `int` | public method. |
| `getSizeWeights()` | `double[]` | public method. |
| `getMinFlockSize()` | `int` | public method. |
| `pickFlockSize()` | `int` | public method. |
| `toString()` | `String` | public method. |
