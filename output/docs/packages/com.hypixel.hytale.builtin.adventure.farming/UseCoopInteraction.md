---
title: "UseCoopInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.UseCoopInteraction"
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
public class UseCoopInteraction extends SimpleBlockInteraction
```

Collects produce from a [CoopBlock](CoopBlock.md). Transfers all items from the coop's internal storage to the player's inventory and updates the block's interaction state between `Produce_Ready` and `default`.
