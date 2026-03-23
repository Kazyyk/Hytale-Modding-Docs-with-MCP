---
title: "OldSimplexNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.OldSimplexNoise"
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
public class OldSimplexNoise implements NoiseFunction
```

OpenSimplex-style noise implementation supporting 2D and 3D evaluation. Uses custom gradient tables (8 gradients for 2D, 24 for 3D) and stretch/squish constants. The singleton `INSTANCE` field provides the shared instance. Output is normalized by dividing by 47.0 (2D) or 103.0 (3D).

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `OldSimplexNoise` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
