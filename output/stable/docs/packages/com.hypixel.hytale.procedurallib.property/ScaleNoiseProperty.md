---
title: "ScaleNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.ScaleNoiseProperty"
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
public class ScaleNoiseProperty implements NoiseProperty
```

Noise property that scales the sampling coordinates before querying a child noise source.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `NoiseProperty` | `getNoiseProperty()` |
| `public` | `double` | `getScaleX()` |
| `public` | `double` | `getScaleY()` |
| `public` | `double` | `getScaleZ()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
