---
title: "TargetEntityEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat.TargetEntityEffect"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "combat"
  - "entity-effect"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat`

```java
public class TargetEntityEffect
```

Configures an entity effect to be applied to a damage target. Includes duration, application chance, per-entity-type duration modifiers, and overlap behavior.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Duration` | `double` (stored as `float`) | No | `0.0` | Duration of the applied effect in seconds. |
| `Chance` | `double` | No | `1.0` | Probability of the effect being applied (0.0 to 1.0). |
| `EntityTypeDurationModifiers` | `Object2DoubleMap<String>` | No | -- | Duration multipliers keyed by entity type ID. |
| `OverlapBehavior` | `OverlapBehavior` | No | `IGNORE` | How to handle overlapping applications of the same effect. |

## Constructor

```java
public TargetEntityEffect(float duration, double chance, Object2DoubleMap<String> entityTypeDurationModifiers, OverlapBehavior overlapBehavior)
```

## Methods

```java
public float getDuration()
```

```java
public double getChance()
```

```java
public Object2DoubleMap<String> getEntityTypeDurationModifiers()
```

```java
public OverlapBehavior getOverlapBehavior()
```

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [DamageEntityInteraction.TargetedDamage](DamageEntityInteraction.TargetedDamage.md) -- uses `TargetEntityEffect` in its configuration
- `OverlapBehavior` -- defines how duplicate effects are handled
