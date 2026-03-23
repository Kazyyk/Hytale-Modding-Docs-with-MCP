---
title: "RangeSizeFlockAsset"
kind: "class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.RangeSizeFlockAsset"
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
public class RangeSizeFlockAsset extends FlockAsset
```

Default flock asset type (codec ID `"Default"`). The initial flock size is picked uniformly from a `[min, max]` range.

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `Size` | `int[2]` | `[1, 1]` | Random range for initial flock size (min, max inclusive). |

## Methods

```java
public int[] getSize()
```

```java
@Override
public int getMinFlockSize()
```

Returns `size[0]`.

```java
@Override
public int pickFlockSize()
```

Returns a random value in `[max(1, size[0]), size[1]]`.

```java
@Nonnull
public static RangeSizeFlockAsset getUnknownFor(String id)
```

Creates a fallback instance for unknown asset IDs. Used as the replace-on-remove handler.

## Related Types

- [FlockAsset](FlockAsset.md) -- abstract base class
- [WeightedSizeFlockAsset](WeightedSizeFlockAsset.md) -- alternative implementation
