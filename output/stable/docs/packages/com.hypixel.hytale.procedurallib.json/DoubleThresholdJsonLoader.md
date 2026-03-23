---
title: "DoubleThresholdJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.DoubleThresholdJsonLoader"
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
public class DoubleThresholdJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleThreshold>
```

Loads double threshold configurations. Produces `DefaultDoubleThresholdCondition` (null input), `DoubleThreshold.Single` (primitive or [low, high]), or `DoubleThreshold.Multiple` (array of [low, high] pairs).

## Key Methods

- `load()`

## Related Types

- DoubleThresholdJsonLoader.Constants -- error messages

