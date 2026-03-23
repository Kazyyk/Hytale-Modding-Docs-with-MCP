---
title: "WeightedSizeFlockAsset"
kind: "class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.WeightedSizeFlockAsset"
api_surface: false
extends: "FlockAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.flock.config`

```java
public class WeightedSizeFlockAsset extends FlockAsset
```

Flock asset type where the initial size is picked from a weighted distribution (codec ID `"Weighted"`). Each index in the `SizeWeights` array corresponds to `MinSize + index`, and the weight determines relative probability.

## Fields

| Field | Type | Description |
|---|---|---|
| `MinSize` | `int` | Absolute minimum flock size. |
| `SizeWeights` | `double[]` | Weight array -- index 0 = MinSize weight, index 1 = MinSize+1 weight, etc. |

## Methods

```java
public int getMinSize()
```

```java
public double[] getSizeWeights()
```

```java
@Override
public int getMinFlockSize()
```

Returns `minSize`.

```java
@Override
public int pickFlockSize()
```

Picks a weighted random index from `sizeWeights` and returns `max(minSize, 1) + index`.

## Related Types

- [FlockAsset](FlockAsset.md) -- abstract base class
- [RangeSizeFlockAsset](RangeSizeFlockAsset.md) -- alternative implementation
