---
title: "UseBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.UseBlockInteraction"
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
public class UseBlockInteraction extends SimpleBlockInteraction
```

Attempts to use the target block, executing any interactions configured on it. Fires `UseBlockEvent` and `LivingEntityUseBlockEvent` on the block's chunk. Delegates block interaction lookup and execution to the block type's interaction configuration.

## Codec

`UseBlockInteraction.CODEC` -- `BuilderCodec<UseBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
