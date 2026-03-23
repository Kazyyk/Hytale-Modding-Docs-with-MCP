---
title: "NoiseMaskConditionJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.NoiseMaskConditionJsonLoader"
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
public class NoiseMaskConditionJsonLoader<K extends SeedResource> extends JsonLoader<K, ICoordinateCondition>
```

Loads noise mask condition configurations. Creates a `NoiseMaskCondition` that evaluates a noise property against a double threshold. Returns default true/false condition when JSON is null.

## Key Methods

- `load()`

## Related Types

- NoiseMaskConditionJsonLoader.Constants -- KEY_THRESHOLD

