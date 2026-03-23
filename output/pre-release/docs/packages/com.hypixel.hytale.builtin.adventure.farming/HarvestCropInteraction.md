---
title: "HarvestCropInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.HarvestCropInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.interactions`

```java
public class HarvestCropInteraction extends SimpleBlockInteraction
```

Harvests resources from a farmable block by delegating to [FarmingUtil.harvest](FarmingUtil.md). Optionally requires the held item to not be broken (`RequireNotBroken`). Resolves the block type and rotation from the world chunk, then calls the utility harvest method.
