---
title: "PlaceFluidInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.PlaceFluidInteraction"
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
public class PlaceFluidInteraction extends SimpleBlockInteraction
```

Places a specified fluid at the target position. Configured via the `FluidToPlace` codec field. Validates the fluid type and placement position, checks world config permissions, and triggers fluid ticking after placement.

## Codec

`PlaceFluidInteraction.CODEC` -- `BuilderCodec<PlaceFluidInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
