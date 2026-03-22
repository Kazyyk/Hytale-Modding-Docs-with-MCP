---
title: "CooldownConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.CooldownConditionInteraction"
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
public class CooldownConditionInteraction extends SimpleInstantInteraction
```

Checks whether a specified cooldown (by `Id`) is currently active. If the cooldown has time remaining, the interaction succeeds (state = Finished); if the cooldown is complete or absent, it fails. For non-player entities, defers to client state.

## Codec

`CooldownConditionInteraction.CODEC` -- `BuilderCodec<CooldownConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
