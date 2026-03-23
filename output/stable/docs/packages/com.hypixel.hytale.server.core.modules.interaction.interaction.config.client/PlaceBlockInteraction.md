---
title: "PlaceBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.PlaceBlockInteraction"
api_surface: false
extends: "SimpleInteraction"
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
public class PlaceBlockInteraction extends SimpleInteraction
```

Places the current or a specified block at the target position. Handles block rotation, filler blocks, sound events, and item durability. Validates placement against world config and block placement rules via `BlockPlaceUtils`. Requires client-side synchronization.

## Codec

`PlaceBlockInteraction.CODEC` -- `BuilderCodec<PlaceBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
