---
title: "CurveReturnType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes.CurveReturnType"
api_surface: false
extends: "ReturnType"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "density"
  - "nodes"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes`

```java
public class CurveReturnType extends ReturnType
```

Extends `ReturnType` to provide CurveReturnType functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Double2DoubleFunction` | `curve` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CurveReturnType(@Nonnull Double2DoubleFunction curve)` |
| `@Override public` | `double` | `get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePosition,
        @Nullable Vector3d closestPoint0,
        Vector3d closestPoint1,
        @Nullable Density.Context context)` |
