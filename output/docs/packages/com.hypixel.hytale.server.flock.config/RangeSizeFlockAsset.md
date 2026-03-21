---
title: "RangeSizeFlockAsset"
kind: "class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.RangeSizeFlockAsset"
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
public class RangeSizeFlockAsset extends FlockAsset
```

Concrete implementation extending `FlockAsset`.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_SIZE` | `int[]` | Static final int[] field. |
| `size` | `int[]` | int[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `RangeSizeFlockAsset(String id)` | Creates a new RangeSizeFlockAsset instance. |
| `RangeSizeFlockAsset()` | Creates a new RangeSizeFlockAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getSize()` | `int[]` | public method. |
| `getMinFlockSize()` | `int` | public method. |
| `pickFlockSize()` | `int` | public method. |
| `getUnknownFor(String id)` | `RangeSizeFlockAsset` | static public method. |
| `toString()` | `String` | public method. |
