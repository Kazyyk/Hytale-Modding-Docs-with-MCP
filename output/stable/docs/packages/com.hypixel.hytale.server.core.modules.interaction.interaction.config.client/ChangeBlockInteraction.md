---
title: "ChangeBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ChangeBlockInteraction"
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
public class ChangeBlockInteraction extends SimpleBlockInteraction
```

Changes the target block to another block based on a `Changes` map (from block type key to block type key). Optionally plays a world sound event at the block location. Supports a `RequireNotBroken` flag that fails the interaction if the held item has zero durability. Lazily resolves block type IDs from keys on first use.

## Codec

`ChangeBlockInteraction.CODEC` -- `BuilderCodec<ChangeBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
