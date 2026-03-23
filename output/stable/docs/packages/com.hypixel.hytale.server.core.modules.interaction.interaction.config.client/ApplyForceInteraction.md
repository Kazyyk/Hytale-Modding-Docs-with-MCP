---
title: "ApplyForceInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ApplyForceInteraction"
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
public class ApplyForceInteraction extends SimpleInteraction
```

Applies one or more forces to the interacting entity with configurable direction, magnitude, and velocity change type (Set or Add). Supports waiting for ground contact, entity collision, or a timer before branching to different follow-up interactions (`GroundNext`, `CollisionNext`, or the default `Next`). Forces can be adjusted by the player's vertical look angle with optional clamping. Includes configurable raycast distance and mode for collision detection, ground/collision check delays, and velocity configuration. Requires client-side synchronization.

## Codec

`ApplyForceInteraction.CODEC` -- `BuilderCodec<ApplyForceInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
