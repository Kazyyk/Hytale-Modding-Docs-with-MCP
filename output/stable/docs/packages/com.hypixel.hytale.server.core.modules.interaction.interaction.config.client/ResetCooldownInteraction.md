---
title: "ResetCooldownInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ResetCooldownInteraction"
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
public class ResetCooldownInteraction extends SimpleInstantInteraction
```

Resets a cooldown to its maximum values. If no explicit `Cooldown` is provided, defaults to the root interaction's cooldown configuration. Resets both the cooldown timer and all charges.

## Codec

`ResetCooldownInteraction.CODEC` -- `BuilderCodec<ResetCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
