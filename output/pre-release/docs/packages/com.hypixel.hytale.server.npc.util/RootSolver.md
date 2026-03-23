---
title: "RootSolver"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.RootSolver"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class RootSolver
```

Static utility class implementing polynomial root-finding algorithms. Provides solvers for quadratic, cubic, and quartic equations, used by ballistic aiming calculations.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `solveQuadric(double c2, double c1, double c0, double[] results, int resultIndex)` |
| `public static` | `int` | `solveCubic(double c3, double c2, double c1, double c0, double[] results)` |
| `public static` | `int` | `solveQuartic(double c4, double c3, double c2, double c1, double c0, double[] results)` |
