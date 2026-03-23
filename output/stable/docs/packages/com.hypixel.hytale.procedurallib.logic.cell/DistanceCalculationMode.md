---
title: "DistanceCalculationMode"
kind: "enum"
package: "com.hypixel.hytale.procedurallib.logic.cell"
fqcn: "com.hypixel.hytale.procedurallib.logic.cell.DistanceCalculationMode"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "procedural"
  - "cell"
---
**Package:** `com.hypixel.hytale.procedurallib.logic.cell`

```java
public enum DistanceCalculationMode
```

## Enum Constants

| Constant |
|---|
| `EUCLIDEAN` |
| `double` |

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `protected static final` | `DistanceCalculationMode[]` | `VALUES` | `values()` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PointDistanceFunction` | `function` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `distance2D(double deltaX, double deltaY)` |
| `public` | `double` | `distance3D(double deltaX, double deltaY, double deltaZ)` |
| `public` | `String` | `toString()` |
| `public` | `double` | `distance2D(double deltaX, double deltaY)` |
| `public` | `double` | `distance3D(double deltaX, double deltaY, double deltaZ)` |
| `public` | `String` | `toString()` |
| `public` | `double` | `distance2D(double deltaX, double deltaY)` |
| `public` | `double` | `distance3D(double deltaX, double deltaY, double deltaZ)` |
| `public` | `String` | `toString()` |
| `public` | `double` | `distance2D(double deltaX, double deltaY)` |
| `public` | `double` | `distance3D(double deltaX, double deltaY, double deltaZ)` |
| `public` | `String` | `toString()` |
| `private` | `` | `DistanceCalculationMode(PointDistanceFunction function)` |
| `public` | `PointDistanceFunction` | `getFunction()` |
| `public static` | `DistanceCalculationMode` | `from(PointDistanceFunction function)` |
