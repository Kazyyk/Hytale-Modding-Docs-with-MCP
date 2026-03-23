---
title: "ExplodeInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ExplodeInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
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
public class ExplodeInteraction extends SimpleInstantInteraction
```

Performs an explosion using a provided `ExplosionConfig`. Determines the explosion center from either a hit location, a collision block position, or the entity's transform position. Automatically detects whether the source entity is a projectile and constructs the appropriate `Damage.Source` (projectile or environment). Delegates to `ExplosionUtils.performExplosion()`.

## Codec

`ExplodeInteraction.CODEC` -- `BuilderCodec<ExplodeInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
