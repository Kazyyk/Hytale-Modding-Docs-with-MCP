---
title: "ChangeFarmingStageInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.ChangeFarmingStageInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "farming"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.interactions`

```java
public class ChangeFarmingStageInteraction extends SimpleBlockInteraction
```

Block interaction that advances a farming block to its next growth stage. Validates the target block has farming data and a valid next stage, then applies the stage transition via `FarmingStageData.apply()`.
