---
title: "CycleBlockGroupInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.CycleBlockGroupInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public class CycleBlockGroupInteraction extends SimpleBlockInteraction
```

Cycles the target block through its block group (set of related block types). Looks up the block's `BlockGroup`, finds the current index, and replaces the block with the next entry in the group (wrapping around). Decreases the held item's durability if applicable. Plays the block's hit sound event on successful cycle.

## Codec

`CycleBlockGroupInteraction.CODEC` -- `BuilderCodec<CycleBlockGroupInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
