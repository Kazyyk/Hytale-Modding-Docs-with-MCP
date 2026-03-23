---
title: "ConstantNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.ConstantNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class ConstantNoise implements NoiseFunction
```

A noise function that always returns a fixed value regardless of input coordinates or seed. Used as a placeholder or base value in noise composition chains.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `double` | `value` |

## Constructor

```java
public ConstantNoise(double value)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getValue()` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
