---
title: "Condition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.condition"
fqcn: "com.hypixel.hytale.server.core.modules.entity.condition.Condition"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:03Z"
tags:
  - "condition"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.condition`

```java
public abstract class Condition
```

Abstract base class for data-driven entity conditions used in stat regeneration, effects, and gameplay logic. Each condition evaluates against an entity's ECS state at a given instant. Supports an `inverse` flag that negates the result. Conditions are codec-deserialized via `CodecMapCodec<Condition>`.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<Condition>` | `CODEC` |
| `protected static final` | `BuilderCodec<Condition>` | `BASE_CODEC` |

## Fields

| Modifier | Type | Name | Description |
|---|---|---|---|
| `protected` | `boolean` | `inverse` | When true, negates the condition result |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `eval(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)` |
| `public abstract` | `boolean` | `eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)` |
| `public static` | `boolean` | `allConditionsMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)` |

## Known Subclasses

| Class | Evaluates |
|---|---|
| [AliveCondition](AliveCondition.md) | Entity does not have DeathComponent |
| [ChargingCondition](ChargingCondition.md) | Entity is in a charging interaction or recently charged |
| [CheckPlayerGameModeCondition](CheckPlayerGameModeCondition.md) | Player is in a specific game mode |
| [EntityStatBoundCondition](EntityStatBoundCondition.md) | Abstract base for stat-based conditions |
| [EnvironmentCondition](EnvironmentCondition.md) | Entity is in a specific environment |
| [GlidingCondition](GlidingCondition.md) | Entity is gliding |
| [HasEffectCondition](HasEffectCondition.md) | Entity has a specific active effect |
| [InFluidCondition](InFluidCondition.md) | Entity's bounding box intersects a fluid |
| [IsPlayerCondition](IsPlayerCondition.md) | Entity has a Player component |
| [LogicCondition](LogicCondition.md) | Combines conditions with AND/OR |
| [NoDamageTakenCondition](NoDamageTakenCondition.md) | No damage taken within a delay |
| [OutOfCombatCondition](OutOfCombatCondition.md) | Out of combat for a duration |
| [RegenHealthCondition](RegenHealthCondition.md) | Always true (placeholder) |
| [SprintingCondition](SprintingCondition.md) | Entity is sprinting |
| [StatCondition](StatCondition.md) | Stat value meets comparison threshold |
| [SuffocatingCondition](SuffocatingCondition.md) | Entity head position is in non-breathable material |
| [WieldingCondition](WieldingCondition.md) | Entity is wielding something |
