---
title: "DistortedNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.DistortedNoiseProperty"
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
public class DistortedNoiseProperty implements NoiseProperty
```

Noise property that distorts the input coordinates of a child noise source.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `NoiseProperty` | `getNoiseProperty()` |
| `public` | `ICoordinateRandomizer` | `getRandomizer()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
