---
title: "RandomCoordinateDoubleSupplier"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.function"
fqcn: "com.hypixel.hytale.server.worldgen.util.function.RandomCoordinateDoubleSupplier"
api_surface: false
extends: ~
implements: ['ICoordinateDoubleSupplier']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "util"
  - "function"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.function`

```java
public class RandomCoordinateDoubleSupplier implements ICoordinateDoubleSupplier
```

Utility for supplying values with caching or special behavior.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getRange()` | `IDoubleRange` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `apply(int seed, int x, int y)` | `double` | Instance method. |
| `apply(int seed, int x, int y, int z)` | `double` | Instance method. |
