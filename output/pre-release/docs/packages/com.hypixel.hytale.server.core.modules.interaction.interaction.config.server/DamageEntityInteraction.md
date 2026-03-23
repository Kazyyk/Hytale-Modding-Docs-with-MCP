---
title: "DamageEntityInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DamageEntityInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction"
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
public class DamageEntityInteraction extends Interaction
```

Damages the target entity. This is the primary combat interaction that calculates damage from configured base values, applies angled and targeted damage overrides, processes armor resistance and knockback modifiers, and queues damage events. Supports branching to different follow-up interactions based on success, failure, block, angle, or hit detail.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `DamageCalculator` | [DamageCalculator](DamageCalculator.md) | No (inherited) | -- | Configuration for how damage values are calculated. |
| `DamageEffects` | [DamageEffects](DamageEffects.md) | No (inherited) | `null` | Visual and audio effects to apply on damage (particles, sounds, knockback, camera effects). |
| `AngledDamage` | `AngledDamage[]` | No (inherited) | -- | Array of angle-based damage overrides. Each entry can override the damage calculator and effects based on the hit angle relative to the target's facing direction. |
| `TargetedDamage` | `Map<String, TargetedDamage>` | Yes (inherited) | empty map | Map of named targeted damage entries keyed by hit detail string. |
| `EntityStatsOnHit` | `EntityStatOnHit[]` | No (inherited) | -- | EntityStats to apply based on the number of hits resulting from this interaction. |
| `Next` | `String` (interaction ref) | No (inherited) | `null` | The interaction to run when this interaction succeeds. |
| `Failed` | `String` (interaction ref) | No (inherited) | `null` | The interaction to run when this interaction fails. |
| `Blocked` | `String` (interaction ref) | No (inherited) | `null` | The interaction to run when this interaction is blocked. |

## Constants

| Name | Type | Value | Description |
|---|---|---|---|
| `ARMOR_RESISTANCE_FLAT_MODIFIER` | `int` | `0` | Index for flat armor resistance modifier. |
| `ARMOR_RESISTANCE_MULTIPLIER_MODIFIER` | `int` | `1` | Index for multiplier armor resistance modifier. |

## Methods

```java
@Override
protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Main tick logic. Validates the target entity, processes queued damage results, or initiates new damage calculation. If the target is invalid, jumps to the failed label.

```java
@Override
protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Delegates to `tick0` for simulation.

```java
@Override
public void compile(@Nonnull OperationsBuilder builder)
```

Compiles the interaction into operation labels for failed, success, blocked, angled, and targeted damage branches.

```java
@Override
public boolean walk(@Nonnull Collector collector, @Nonnull InteractionContext context)
```

Returns `false`.

```java
@Nonnull
@Override
protected com.hypixel.hytale.protocol.Interaction generatePacket()
```

Returns a new `com.hypixel.hytale.protocol.DamageEntityInteraction` packet.

```java
@Override
protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
```

Populates the protocol packet with damage effects, next/failed/blocked references, angled damage, entity stats on hit, and targeted damage.

```java
@Override
public boolean needsRemoteSync()
```

Returns `true`.

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.None`.

## Inner Classes

- [AngledDamage](DamageEntityInteraction.AngledDamage.md) -- angle-based damage override with configurable angle and distance thresholds
- [EntityStatOnHit](DamageEntityInteraction.EntityStatOnHit.md) -- entity stat adjustment scaled by hit count
- [TargetedDamage](DamageEntityInteraction.TargetedDamage.md) -- named damage override with optional damage calculator, effects, and follow-up interaction

## See Also

- [DamageCalculator](DamageCalculator.md) -- computes base damage values
- [DamageEffects](DamageEffects.md) -- visual/audio/knockback effects
- [Knockback](Knockback.md) -- knockback force calculation
