---
title: "CurveNoisePropertyJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CurveNoisePropertyJsonLoader"
api_surface: false
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public class CurveNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, CurveNoiseProperty>
```

Loads curve noise property configurations. Applies a `PowerCurve(A, B)` transform to a noise source. Default curve parameters: A=2.0, B=-2.0.

## Key Methods

- `load()`
- `loadNoise()`
- `loadDCurve()`

## Related Types

- CurveNoisePropertyJsonLoader.Constants -- DEFAULT_A = 2.0, DEFAULT_B = -2.0

