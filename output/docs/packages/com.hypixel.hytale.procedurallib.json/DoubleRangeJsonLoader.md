---
title: "DoubleRangeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.DoubleRangeJsonLoader"
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
public class DoubleRangeJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleRange>
```

Loads double range configurations. Supports constant (single value), normal (min/max), array (1 or 2 elements), and threshold-based (Thresholds/Values arrays) range types. Applies an optional transform function.

## Key Methods

- `load()`
- `loadThreshold()`

## Related Types

- DoubleRangeJsonLoader.Constants -- KEY_MIN, KEY_MAX, KEY_THRESHOLDS, KEY_VALUES
- DoubleRangeJsonLoader.DoubleToDoubleFunction -- functional interface for value transformation

