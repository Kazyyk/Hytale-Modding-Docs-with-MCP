---
title: "Buffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.Buffer"
api_surface: false
extends: null
implements: ["MemInstrument"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers`

```java
public abstract class Buffer implements MemInstrument
```

Abstract base class for all buffer types in the world generation buffer bundle system. Extends `MemInstrument` to provide memory usage reporting. Concrete subclasses include `VoxelBuffer`, `PixelBuffer`, and `EntityBuffer`.
