---
title: "GridNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.GridNoiseJsonLoader"
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
public class GridNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Loads grid noise configurations. Creates `GridNoise` with per-axis thickness values. ThicknessZ defaults to `0.0` if no shared default is given.

## Key Methods

- `load()`
- `loadDefaultThickness()`
- `loadThicknessX/Y/Z(double)`

## Related Types

- GridNoiseJsonLoader.Constants -- axis thickness keys and defaults

