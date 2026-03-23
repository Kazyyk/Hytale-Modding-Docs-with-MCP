---
title: "Normalizer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.math.Normalizer"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.math`

```java
public class Normalizer
```

Utility class for range normalization. Provides `normalizeNoise` as a convenience for mapping noise values from [-1, 1] to [0, 1], and a general-purpose `normalize` method for arbitrary range remapping.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `double` | `normalizeNoise(double input)` |
| `public static` | `double` | `normalize(double fromMin, double fromMax, double toMin, double toMax, double input)` |
