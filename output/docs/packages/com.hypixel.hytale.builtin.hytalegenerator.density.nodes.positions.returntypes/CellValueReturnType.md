---
title: "CellValueReturnType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes.CellValueReturnType"
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
public class CellValueReturnType extends ReturnType
```

Extends `ReturnType` to provide CellValueReturnType functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `sampleField` |
| `private final` | `double` | `defaultValue` |
| `@Nonnull private final` | `Density.Context` | `rChildContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CellValueReturnType(@Nonnull Density sampleField, double defaultValue)` |
| `@Override public` | `double` | `get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePosition,
        @Nullable Vector3d closestPoint0,
        Vector3d closestPoint1,
        @Nonnull Density.Context context)` |
