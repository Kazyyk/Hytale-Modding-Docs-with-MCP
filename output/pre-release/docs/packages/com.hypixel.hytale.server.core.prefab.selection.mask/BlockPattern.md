---
title: "BlockPattern"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockPattern"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "pattern"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.mask`

```java
public class BlockPattern
```

Weighted random block pattern for builder tools and prefab operations. Parses pattern strings with optional percentage weights (e.g., `50%Stone,50%Dirt`). Resolves block names to IDs lazily and supports `BlockTypeListAsset` expansion.