---
title: "BlockStateFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.BlockStateFarmingStageData"
api_surface: false
extends: "FarmingStageData"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "stage"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages`

```java
public class BlockStateFarmingStageData extends FarmingStageData
```

Farming stage that transitions a block to a named block state variant of the same block type. Resolves the target via `BlockType.getBlockForState(state)`.
