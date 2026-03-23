---
title: "Condition"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.condition.Condition"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "conditions"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset.condition`

```java
public abstract class Condition
```

Abstract base class for all entity stat regeneration conditions. Conditions are evaluated against an entity's components to determine whether a regeneration tick should apply. Supports inversion via the `Inverse` field.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `CodecMapCodec<Condition>` | Polymorphic codec for condition deserialization. |

## Fields

| Field | Type | JSON Key | Description |
|---|---|---|---|
| `inverse` | `boolean` | `Inverse` | If true, the condition result is negated. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `eval(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant)` | `boolean` | Evaluates the condition, applying inversion. |
| `eval0(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant)` | `boolean` | Abstract. Subclass-specific evaluation logic. |
| `allConditionsMet(ComponentAccessor, Ref, Instant, Regenerating)` | `boolean` | Static. Checks whether all conditions on a Regenerating entry are met. |
| `allConditionsMet(ComponentAccessor, Ref, Instant, Condition[])` | `boolean` | Static. Checks whether all conditions in an array are met (short-circuits on first failure). |

## Known Subclasses

`AliveCondition`, `ChargingCondition`, `EnvironmentCondition`, `GlidingCondition`, `LogicCondition`, `NoDamageTakenCondition`, `OutOfCombatCondition`, `PlayerCondition`, `RegenHealthCondition`, `SprintingCondition`, `StatCondition`, `SuffocatingCondition`, `WieldingCondition`, `EntityStatBoundCondition`
