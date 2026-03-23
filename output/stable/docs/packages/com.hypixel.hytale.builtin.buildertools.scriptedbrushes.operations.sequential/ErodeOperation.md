---
title: "ErodeOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.ErodeOperation"
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
public class ErodeOperation extends SequenceBrushOperation
```

Applies an erosion pass to the brush area. Removes blocks that have fewer solid neighbors than the configured threshold, simulating natural weathering. Supports configurable iteration count and neighbor threshold.
