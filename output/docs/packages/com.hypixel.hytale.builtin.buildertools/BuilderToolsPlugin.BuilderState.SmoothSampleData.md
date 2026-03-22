---
title: "BuilderToolsPlugin.BuilderState.SmoothSampleData"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.BuilderState.SmoothSampleData"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "editing"
  - "smooth"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class SmoothSampleData
```

Inner class of [BuilderState](BuilderToolsPlugin.BuilderState.md) that accumulates weighted sampling data for the smooth operation. Used with the 3x3x3 smoothing kernel to determine whether a position should become solid or air, and which block type to use.

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `solidStrength` | `float` | `0.0F` | Weighted sum of solid block contributions from the smoothing kernel. |
| `solidBlock` | `int` | `0` | Block ID of the most common solid block in the kernel neighborhood. |
| `solidBlockCount` | `int` | `0` | Count of the most common solid block. |
| `fillerBlock` | `int` | `0` | Block ID of the most common filler block in the kernel neighborhood. |
| `fillerBlockCount` | `int` | `0` | Count of the most common filler block. |

## Usage

During a smooth operation, the kernel iterates over a 3x3x3 neighborhood around each position, accumulating weights from `SMOOTHING_KERNEL` (total weight: 27). If `solidStrength` exceeds half the total weight, the position is set to the majority solid block; otherwise it is cleared.

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- enclosing class
- [BuilderToolsPlugin.BuilderState.BlocksSampleData](BuilderToolsPlugin.BuilderState.BlocksSampleData.md) -- companion class for general block sampling
