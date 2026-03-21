---
title: "SimplexNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.SimplexNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "simplex"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class SimplexNoise implements NoiseFunction
```

Simplex gradient noise implementation (2D and 3D). Uses `GeneralNoise` hash and gradient functions. The singleton `INSTANCE` field provides the shared instance. Output is scaled by 50.0 (2D) or 32.0 (3D).

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `SimplexNoise` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
