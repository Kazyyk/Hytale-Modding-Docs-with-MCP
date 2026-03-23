---
title: "BreakBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.BreakBlockInteraction"
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
public class BreakBlockInteraction extends SimpleBlockInteraction
```

Attempts to break the target block. Supports a `Harvest` mode for gather-style pickup versus standard break. Can specify a `Tool` ID and `MatchTool` flag to require a specific tool. Behavior varies by game mode: Creative mode performs an instant block break, while other modes apply block damage. The `interactWithBlock` method body could not be fully decompiled due to a Vineflower limitation with switch expressions over `GameMode`.

## Codec

`BreakBlockInteraction.CODEC` -- `BuilderCodec<BreakBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
