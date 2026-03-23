---
title: "MovementConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.MovementConditionInteraction"
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
public class MovementConditionInteraction extends SimpleInteraction
```

Branches to different interactions based on the player's current movement direction. Supports all eight directions (Forward, Back, Left, Right, ForwardLeft, ForwardRight, BackLeft, BackRight) plus a None/failed branch. Each direction maps to a separately configured interaction. Requires client-side synchronization.

## Codec

`MovementConditionInteraction.CODEC` -- `BuilderCodec<MovementConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
