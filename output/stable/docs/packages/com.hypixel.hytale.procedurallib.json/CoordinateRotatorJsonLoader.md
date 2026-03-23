---
title: "CoordinateRotatorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CoordinateRotatorJsonLoader"
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
public class CoordinateRotatorJsonLoader<K extends SeedResource> extends JsonLoader<K, CoordinateRotator>
```

Loads coordinate rotator configurations. Creates `CoordinateRotator` (or `CoordinateOriginRotator` if origin is non-zero) from pitch/yaw angles in degrees (converted to radians). Returns `CoordinateRotator.NONE` when both angles are zero.

## Key Methods

- `load()`

## Related Types

- CoordinateRotatorJsonLoader.Constants -- KEY_PITCH, KEY_YAW, KEY_ORIGIN_X/Y/Z

