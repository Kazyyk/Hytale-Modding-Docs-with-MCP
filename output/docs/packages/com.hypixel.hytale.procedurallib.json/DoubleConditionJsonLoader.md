---
title: "DoubleConditionJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.DoubleConditionJsonLoader"
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
public class DoubleConditionJsonLoader<K extends SeedResource> extends JsonLoader<K, IDoubleCondition>
```

Loads double condition configurations. Produces `DefaultDoubleCondition`, `SingleDoubleCondition`, or `DoubleThresholdCondition` depending on JSON structure (null/primitive/array).

## Key Methods

- `load()`

## Related Types

- DoubleConditionJsonLoader.Constants -- error messages

