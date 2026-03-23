---
title: "WieldingInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.WieldingInteraction"
api_surface: false
extends: "ChargingInteraction"
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
public class WieldingInteraction extends ChargingInteraction
```

A charging interaction variant used for wielded combat items. Adds stat modifier application (damage modifiers, damage cause effects), entity effect processing, and damage data tracking during the charge phase. Configurable via codec fields for stat modifiers, damage cause, damage effects, and entity effects.

## Codec

`WieldingInteraction.CODEC` -- `BuilderCodec<WieldingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
