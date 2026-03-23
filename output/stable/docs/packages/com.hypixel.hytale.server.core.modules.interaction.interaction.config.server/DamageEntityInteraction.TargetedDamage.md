---
title: "DamageEntityInteraction.TargetedDamage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DamageEntityInteraction.TargetedDamage"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "combat"
  - "damage"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public static class DamageEntityInteraction.TargetedDamage
```

Represents a named damage override within a [DamageEntityInteraction](DamageEntityInteraction.md). When a hit detail matches the map key, this entry's damage calculator and effects replace the interaction's defaults.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `DamageCalculator` | [DamageCalculator](DamageCalculator.md) | No (inherited) | -- | Override damage calculator for this target entry. |
| `TargetEntityEffects` | `Map<String, TargetEntityEffect>` | No (inherited) | -- | Entity effects to apply to the target on hit. |
| `DamageEffects` | [DamageEffects](DamageEffects.md) | No (inherited) | -- | Override visual/audio effects for this target entry. |
| `Next` | `String` (interaction ref) | No (inherited) | `null` | Follow-up interaction to run on success for this target. |

## Fields

| Type | Name | Description |
|---|---|---|
| `int` | `index` | Sorted index within the parent's targeted damage map. Set during `afterDecode`. |
| [DamageCalculator](DamageCalculator.md) | `damageCalculator` | Override damage calculator. |
| `Map<String, TargetEntityEffect>` | `targetEntityEffects` | Entity effects keyed by effect ID. |
| [DamageEffects](DamageEffects.md) | `damageEffects` | Override damage effects. |
| `String` | `next` | Follow-up interaction asset ID. |

## Methods

```java
@Nonnull
public com.hypixel.hytale.protocol.TargetedDamage toTargetedDamagePacket()
```

Converts to protocol packet form with index, damage effects, and next interaction reference.

```java
@Nonnull
@Override
public String toString()
```

## Subclasses

- [DamageEntityInteraction.AngledDamage](DamageEntityInteraction.AngledDamage.md) -- adds angle-based matching

## See Also

- [DamageEntityInteraction](DamageEntityInteraction.md) -- parent interaction
- [TargetEntityEffect](TargetEntityEffect.md) -- effect applied to target on hit
