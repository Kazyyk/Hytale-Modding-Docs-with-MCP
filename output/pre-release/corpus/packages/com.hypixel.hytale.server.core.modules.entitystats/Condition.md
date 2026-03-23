# Condition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public abstract class Condition

Abstract base class for all entity stat regeneration conditions. Conditions are evaluated against an entity's components to determine whether a regeneration tick should apply. Supports inversion via the `Inverse` field.

## Static Fields

- CODEC | CodecMapCodec<Condition> | Polymorphic codec for condition deserialization.

## Fields

- inverse | boolean | Inverse | If true, the condition result is negated.

## Methods

- eval(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant) | boolean | Evaluates the condition, applying inversion.
- eval0(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant) | boolean | Abstract. Subclass-specific evaluation logic.
- allConditionsMet(ComponentAccessor, Ref, Instant, Regenerating) | boolean | Static. Checks whether all conditions on a Regenerating entry are met.
- allConditionsMet(ComponentAccessor, Ref, Instant, Condition[]) | boolean | Static. Checks whether all conditions in an array are met (short-circuits on first failure).

## Known Subclasses

`AliveCondition`, `ChargingCondition`, `EnvironmentCondition`, `GlidingCondition`, `LogicCondition`, `NoDamageTakenCondition`, `OutOfCombatCondition`, `PlayerCondition`, `RegenHealthCondition`, `SprintingCondition`, `StatCondition`, `SuffocatingCondition`, `WieldingCondition`, `EntityStatBoundCondition`