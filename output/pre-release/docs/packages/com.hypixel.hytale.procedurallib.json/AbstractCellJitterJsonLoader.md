---
title: "AbstractCellJitterJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.AbstractCellJitterJsonLoader"
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
public abstract class AbstractCellJitterJsonLoader<K extends SeedResource> extends JsonLoader<K, T>
```

Abstract base for loaders that need cell jitter configuration. Provides methods to load default, per-axis, and combined jitter values from JSON.

## Key Methods

- `loadJitter()`
- `loadDefaultJitter()`
- `loadJitterX/Y/Z(double)`

