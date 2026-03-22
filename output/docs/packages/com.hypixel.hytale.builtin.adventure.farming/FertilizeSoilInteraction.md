---
title: "FertilizeSoilInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.FertilizeSoilInteraction"
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
public class FertilizeSoilInteraction extends SimpleBlockInteraction
```

Sets the fertilized flag on a [TilledSoilBlock](TilledSoilBlock.md) component. If the target block is a crop (has [FarmingBlock](FarmingBlock.md)), looks one block below for the soil instead. Enables ticking on both the soil and crop positions after fertilizing.
