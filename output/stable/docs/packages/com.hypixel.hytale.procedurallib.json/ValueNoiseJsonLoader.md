---
title: "ValueNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.ValueNoiseJsonLoader"
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
public class ValueNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, ValueNoise>
```

Loads value noise configurations. Creates `ValueNoise` with a configurable interpolation mode (default `QUINTIC`).

## Key Methods

- `load()`
- `loadInterpolationFunction()`

## Related Types

- ValueNoiseJsonLoader.Constants -- DEFAULT_INTERPOLATION_MODE = QUINTIC

