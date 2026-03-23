---
title: "HeightThresholdInterpreterJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.HeightThresholdInterpreterJsonLoader"
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
public class HeightThresholdInterpreterJsonLoader<K extends SeedResource> extends JsonLoader<K, IHeightThresholdInterpreter>
```

Loads height threshold interpreter configurations. Dispatches to either `NoiseHeightThresholdInterpreterJsonLoader` (when "Thresholds" key is present) or `BasicHeightThresholdInterpreterJsonLoader`.

## Key Methods

- `load()`

