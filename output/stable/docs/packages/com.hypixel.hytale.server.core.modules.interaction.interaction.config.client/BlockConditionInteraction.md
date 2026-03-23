---
title: "BlockConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.BlockConditionInteraction"
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
public class BlockConditionInteraction extends SimpleBlockInteraction
```

Tests the target block against an array of `BlockMatcher` conditions. Succeeds (runs `Next`) if any matcher passes; fails otherwise. Each matcher can test against block ID, block state, block tag, and/or block face (with optional rotation-aware face matching via the `StaticFace` flag).

## Codec

`BlockConditionInteraction.CODEC` -- `BuilderCodec<BlockConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
