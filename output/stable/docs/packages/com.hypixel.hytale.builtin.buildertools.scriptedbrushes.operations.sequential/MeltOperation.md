---
title: "MeltOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.MeltOperation"
api_surface: false
extends: "SequenceBrushOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "buildertools"
  - "brush"
  - "operation"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential`

```java
public class MeltOperation extends SequenceBrushOperation
```

Applies a melting pass to the brush area. Fills air blocks that have enough solid neighbors, simulating material flow into gaps. The inverse of erosion. Supports configurable iteration count and neighbor threshold.
