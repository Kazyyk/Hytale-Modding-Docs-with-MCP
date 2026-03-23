---
title: "SumNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.SumNoiseProperty"
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
public class SumNoiseProperty implements NoiseProperty
```

Noise property that sums the outputs of two child noise sources.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `SumNoiseProperty.Entry[]` | `getEntries()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
| `public` | `NoiseProperty` | `getNoiseProperty()` |
| `public` | `void` | `setNoiseProperty(NoiseProperty noiseProperty)` |
| `public` | `double` | `getFactor()` |
| `public` | `void` | `setFactor(double factor)` |
