---
title: "CellNoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise.CellNoiseField"
api_surface: false
extends: "NoiseField"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "fields"
  - "noise"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.noise`

```java
public class CellNoiseField extends NoiseField
```

Extends `NoiseField`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `FastNoiseLite` | `cellNoise` |
| `private` | `int` | `seed` |
| `private` | `boolean` | `doDomainWarp` |
| `private` | `double` | `scaleX` |
| `private` | `double` | `scaleY` |
| `private` | `double` | `scaleZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `throw new` | `IllegalArgumentException()` |
| `@Override public` | `double` | `valueAt(double x, double y, double z, double w)` |
| `@Override public` | `double` | `valueAt(double x, double y, double z)` |
| `@Override public` | `double` | `valueAt(double x, double z)` |
| `@Override public` | `double` | `valueAt(double x)` |
