---
title: "DamageClass"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.DamageClass"
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
public enum DamageClass
```

Classifies damage types for the combat system. Used by armor to apply class-specific damage modifiers and enhancements.

## Enum Constants

| Constant | Description |
|---|---|
| `UNKNOWN` | Unclassified damage. |
| `LIGHT` | Light attack damage. |
| `CHARGED` | Charged attack damage. |
| `SIGNATURE` | Signature attack damage. |

## Fields

| Type | Name | Description |
|---|---|---|
| `EnumCodec<DamageClass>` | `CODEC` | Codec for serialization. |

## See Also

- [DamageCalculator](DamageCalculator.md) -- uses `DamageClass` for armor modifier resolution
- [DamageEntityInteraction](DamageEntityInteraction.md) -- applies damage class during armor calculations
