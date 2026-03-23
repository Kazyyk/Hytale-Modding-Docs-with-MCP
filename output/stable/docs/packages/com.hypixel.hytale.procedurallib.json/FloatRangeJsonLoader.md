---
title: "FloatRangeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.FloatRangeJsonLoader"
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
public class FloatRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IFloatRange>
```

Loads float range configurations. Mirrors `DoubleRangeJsonLoader` but uses `float` precision. Supports constant, normal (min/max), and array range types with an optional transform function.

## Key Methods

- `load()`

## Related Types

- FloatRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX
- FloatRangeJsonLoader.FloatToFloatFunction -- functional interface for value transformation

