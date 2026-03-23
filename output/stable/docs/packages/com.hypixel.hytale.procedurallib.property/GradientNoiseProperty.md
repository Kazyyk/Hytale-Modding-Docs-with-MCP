---
title: "GradientNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.GradientNoiseProperty"
api_surface: false
extends: ~
implements: ["NoiseProperty"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedurallib"
  - "property"
---

**Package:** `com.hypixel.hytale.procedurallib.property`

```java
public class GradientNoiseProperty implements NoiseProperty
```

Noise property that generates a linear gradient along a specified axis.

## Enum Constants

- `MAGNITUDE`
- `ANGLE`
- `ANGLE_ABS`

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `protected static` | `double` | `getAngle(double dx, double dy)` |
| `protected static` | `double` | `getAbsAngle(double dx, double dy)` |
| `protected static` | `double` | `getMagnitude(double dx, double dy, double invNormalize)` |
| `protected static` | `float` | `convertRange(float angle)` |
