---
title: "SingleNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.SingleNoiseProperty"
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
public class SingleNoiseProperty implements NoiseProperty
```

Noise property wrapping a single noise generator instance.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getSeedOffset()` |
| `public` | `NoiseFunction` | `getFunction()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
