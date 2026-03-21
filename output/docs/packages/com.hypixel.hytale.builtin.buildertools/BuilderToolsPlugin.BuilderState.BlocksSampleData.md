---
title: "BuilderToolsPlugin.BuilderState.BlocksSampleData"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.BuilderState.BlocksSampleData"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "editing"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class BlocksSampleData
```

Inner class of [BuilderState](BuilderToolsPlugin.BuilderState.md) that accumulates block sampling data during editing operations. Used to determine the majority block type in a region (including and excluding air).

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `mainBlock` | `int` | `0` | Block ID of the most common block (including air). |
| `mainBlockCount` | `int` | `0` | Count of the most common block (including air). |
| `mainBlockNotAir` | `int` | `0` | Block ID of the most common non-air block. |
| `mainBlockNotAirCount` | `int` | `0` | Count of the most common non-air block. |

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- enclosing class
- [BuilderToolsPlugin.BuilderState.SmoothSampleData](BuilderToolsPlugin.BuilderState.SmoothSampleData.md) -- companion class for smooth sampling
