---
title: "Viewport"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.Viewport"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class Viewport
```

Represents a region of chunks that can be refreshed during world generation. Computes the set of affected chunk indices from voxel-grid bounds and provides an async `refresh()` method that requests chunk references with priority 9.
