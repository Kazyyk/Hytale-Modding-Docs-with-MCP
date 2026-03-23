---
title: "RelativeVector3d"
kind: "class"
package: "com.hypixel.hytale.math.vector.relative"
fqcn: "com.hypixel.hytale.math.vector.relative.RelativeVector3d"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "math"
---

**Package:** `com.hypixel.hytale.math.vector.relative`

```java
public class RelativeVector3d
```

Class in the relative subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `vector` | `Vector3d` | Vector3d field. |
| `relative` | `boolean` | boolean field. |

## Constructors

| Constructor | Description |
|---|---|
| `RelativeVector3d(@Nonnull Vector3d vector, boolean relative)` | Creates a new RelativeVector3d instance. |
| `RelativeVector3d()` | Creates a new RelativeVector3d instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getVector()` | `Vector3d` | public method. |
| `isRelative()` | `boolean` | public method. |
| `resolve(@Nonnull Vector3d vector)` | `Vector3d` | public method. |
| `equals(@Nullable Object o)` | `boolean` | public method. |
| `hashCode()` | `int` | public method. |
| `toString()` | `String` | public method. |
