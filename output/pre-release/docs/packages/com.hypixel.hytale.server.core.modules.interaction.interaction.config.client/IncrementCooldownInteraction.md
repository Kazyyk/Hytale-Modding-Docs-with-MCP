---
title: "IncrementCooldownInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.IncrementCooldownInteraction"
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
public class IncrementCooldownInteraction extends SimpleInstantInteraction
```

Increases a cooldown's time, charge time, or charge count by specified amounts. The `Id` field identifies the cooldown; if empty, defaults to the root interaction's cooldown. Supports `InterruptRecharge` to stop ongoing recharge. The `ChargeTime` value is negated during decoding (additive becomes subtractive internally).

## Codec

`IncrementCooldownInteraction.CODEC` -- `BuilderCodec<IncrementCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
