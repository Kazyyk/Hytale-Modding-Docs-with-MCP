---
title: "NoiseHeightThresholdInterpreterJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.NoiseHeightThresholdInterpreterJsonLoader"
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
public class NoiseHeightThresholdInterpreterJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseHeightThresholdInterpreter>
```

Loads noise-driven height threshold interpreter configurations. Combines a noise property with an array of sub-interpreters selected by float key values.

## Key Methods

- `load()`
- `loadNoise()`
- `loadInterpreters()`
- `loadKeys()`
- `shouldHandle(@Nonnull JsonObject)` -- static check for "Thresholds" key

## Related Types

- NoiseHeightThresholdInterpreterJsonLoader.Constants -- KEY_NOISE, KEY_THRESHOLDS, KEY_KEYS

