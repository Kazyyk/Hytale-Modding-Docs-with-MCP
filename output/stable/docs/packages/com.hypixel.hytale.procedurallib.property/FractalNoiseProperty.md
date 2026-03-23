---
title: "FractalNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.FractalNoiseProperty"
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
public class FractalNoiseProperty implements NoiseProperty
```

Noise property that layers multiple octaves of a child noise source for fractal detail.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getSeedOffset()` |
| `public` | `NoiseFunction` | `getFunction()` |
| `public` | `FractalNoiseProperty.FractalFunction` | `getFractalFunction()` |
| `public` | `int` | `getOctaves()` |
| `public` | `double` | `getLacunarity()` |
| `public` | `double` | `getPersistence()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, int octaves, double lacunarity, double persistence, @Nonnull NoiseFunction2d noise)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z, int octaves, double lacunarity, double persistence, @Nonnull NoiseFunction3d noise)` |
