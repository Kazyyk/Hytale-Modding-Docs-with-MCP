---
title: "DamageCalculator.Type"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageCalculator.Type"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "combat"
  - "damage"
  - "enum"
  - "api"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public static enum DamageCalculator.Type
```

Determines how base damage values are scaled in [DamageCalculator](DamageCalculator.md).

## Enum Constants

| Constant | Description |
|---|---|
| `DPS` | Damage per second -- base damage is multiplied by the interaction duration in seconds. |
| `ABSOLUTE` | Absolute damage -- base damage is used as-is regardless of duration. |

## Fields

| Type | Name | Description |
|---|---|---|
| `EnumCodec<DamageCalculator.Type>` | `CODEC` | Codec for serialization. |

## See Also

- [DamageCalculator](DamageCalculator.md)
