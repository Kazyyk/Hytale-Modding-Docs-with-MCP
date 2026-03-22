---
title: "PointNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.PointNoiseJsonLoader"
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
public class PointNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, PointNoise>
```

Loads point noise configurations. Creates `PointNoise` with X/Y/Z coordinates and inner/outer radius values (all default to `0.0`).

## Key Methods

- `load()`

## Related Types

- PointNoiseJsonLoader.Constants -- KEY_X/Y/Z, KEY_INNER_RADIUS, KEY_OUTER_RADIUS

