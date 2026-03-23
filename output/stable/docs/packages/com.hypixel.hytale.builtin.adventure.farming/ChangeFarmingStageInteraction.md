---
title: "ChangeFarmingStageInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.ChangeFarmingStageInteraction"
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
public class ChangeFarmingStageInteraction extends SimpleBlockInteraction
```

Changes the farming stage of a target block. Supports absolute stage index (`Stage`), relative increase (`Increase`), and relative decrease (`Decrease`) modes. Can optionally switch to a different stage set (`StageSet`). Creates a new `FarmingBlock` component if one does not exist on the target block entity.
