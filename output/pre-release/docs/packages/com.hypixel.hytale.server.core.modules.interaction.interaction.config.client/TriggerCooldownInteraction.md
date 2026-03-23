---
title: "TriggerCooldownInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.TriggerCooldownInteraction"
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
public class TriggerCooldownInteraction extends SimpleInstantInteraction
```

Triggers a cooldown as if it was triggered normally (deducts a charge). If no explicit `Cooldown` is provided, defaults to the root interaction's cooldown. Unlike `ResetCooldownInteraction`, this calls `deductCharge()` instead of `resetCharges()`.

## Codec

`TriggerCooldownInteraction.CODEC` -- `BuilderCodec<TriggerCooldownInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
