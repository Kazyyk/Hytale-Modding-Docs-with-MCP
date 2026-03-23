---
title: "ConstantNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.ConstantNoiseJsonLoader"
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
public class ConstantNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Loads constant noise configurations. Produces a `ConstantNoise` with a configurable value (default `0.5`).

## Key Methods

- `load()`
- `loadValue()`

## Related Types

- ConstantNoiseJsonLoader.Constants -- KEY_VALUE, DEFAULT_VALUE = 0.5

