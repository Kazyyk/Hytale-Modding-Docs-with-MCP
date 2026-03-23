---
title: "DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "armor"
  - "resistance"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.ArmorDamageReduction.ArmorResistanceModifiers
```

Accumulates flat and multiplicative damage resistance modifiers from armor pieces and entity effects. Used as the value type in the resistance modifier map computed by [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md).

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `flatModifier` | `int` | `public` | Accumulated flat damage reduction. |
| `multiplierModifier` | `float` | `public` | Accumulated multiplicative damage reduction (0.0 = no reduction, 1.0 = full reduction). |
| `inheritedParentId` | `DamageCause` | `public` | Parent damage cause for inheritance chain traversal, or `null`. |

## Related Types

- [DamageSystems.ArmorDamageReduction](DamageSystems.ArmorDamageReduction.md) -- parent class that creates and populates these modifiers
- [DamageCause](DamageCause.md) -- used for inheritance chain traversal
