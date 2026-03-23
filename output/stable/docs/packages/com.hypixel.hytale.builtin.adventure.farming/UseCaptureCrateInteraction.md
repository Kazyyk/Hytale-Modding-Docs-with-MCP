---
title: "UseCaptureCrateInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.UseCaptureCrateInteraction"
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
public class UseCaptureCrateInteraction extends SimpleBlockInteraction
```

Dual-purpose interaction for capture crates. When used on an NPC entity (tick0), captures the NPC into the held item's metadata as `CapturedNPCMetadata`. When used on a block (interactWithBlock), either places the captured NPC into a [CoopBlock](CoopBlock.md) or releases it into the world. Validates NPC groups against `acceptedNpcGroupIds`.
