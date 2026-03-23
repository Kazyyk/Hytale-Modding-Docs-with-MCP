---
title: "BlockMask"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockMask"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "mask"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.mask`

```java
public class BlockMask
```

Composite mask of multiple `BlockFilter` instances combined with AND logic. Supports parsing from comma-separated filter strings, inversion, combination of multiple masks, and automatic grouping of filters by type.