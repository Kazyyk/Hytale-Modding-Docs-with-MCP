---
title: "BlockModule.BlockEntityPreprocessor"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block"
fqcn: "com.hypixel.hytale.server.core.modules.block.BlockModule.BlockEntityPreprocessor"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "module"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block`

```java
public static final class BlockModule.BlockEntityPreprocessor
```

Thread-local utility for batch processing block types during chunk generation. Collects block type IDs that have block entities, then finds matching blocks in sections and clones their entity holders into the chunk component map.

## Relationships

- Inner class of [BlockModule](BlockModule.md)
