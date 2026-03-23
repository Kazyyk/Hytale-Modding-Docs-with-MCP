---
title: "NoiseFunctionJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.NoiseFunctionJsonLoader"
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
public class NoiseFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Dispatches noise function loading based on the `"NoiseType"` JSON key. Reads the noise type string, resolves it via `NoiseTypeJson`, and delegates to the appropriate type-specific loader.

## Key Methods

- `load()` -- reads NoiseType, dispatches to type-specific loader
- `newLoader(@Nonnull NoiseTypeJson noiseTypeJson)`

## Related Types

- NoiseTypeJson -- enum mapping noise types to loader classes

