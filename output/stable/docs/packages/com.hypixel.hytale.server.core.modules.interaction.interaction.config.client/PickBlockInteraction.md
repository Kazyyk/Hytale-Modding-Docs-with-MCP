---
title: "PickBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.PickBlockInteraction"
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
public class PickBlockInteraction extends SimpleBlockInteraction
```

Performs a block pick operation, moving the targeted block type to the player's hand if they have it in their inventory or are in creative mode. The server-side implementation is a no-op; the actual pick logic runs on the client. Requires client-side synchronization.

## Codec

`PickBlockInteraction.CODEC` -- `BuilderCodec<PickBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
