---
title: "Normalizer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.Normalizer"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "framework"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.math`

```java
public class Normalizer
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `double` | `normalizeNoise(double input)` |
| `` | `return` | `normalize(-1.0, 1.0, 0.0, 1.0, input)` |
| `` | `public static double` | `normalize(double fromMin, double fromMax, double toMin, double toMax, double input)` |
| `` | `throw new` | `IllegalArgumentException("min larger than max")` |
