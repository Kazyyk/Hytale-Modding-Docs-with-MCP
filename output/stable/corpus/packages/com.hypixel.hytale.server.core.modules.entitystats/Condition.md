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

Known subclasses: AliveCondition, AlwaysTrueCondition, ChargingCondition, CurveCondition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, OutOfCombatCondition, PlayerCondition, RandomiserCondition, RegenHealthCondition, ScaledCurveCondition, SimpleCondition, SprintingCondition, SuffocatingCondition, WieldingCondition

Known implementors: AlwaysTrueCondition, AndCondition, EqualsCondition, GreaterThanCondition, NotCondition, OrCondition, SmallerThanCondition

Also in this package: AliveCondition, ChargingCondition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public abstract boolean eval0(ComponentAccessor<EntityStore> var1, Ref<EntityStore> var2, Instant var3)
  public static boolean allConditionsMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime, EntityStatType.Regenerating regenerating)
  public static boolean allConditionsMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)
  public String toString()

Fields:
public static final CodecMapCodec<Condition> CODEC
protected static final BuilderCodec<Condition> BASE_CODEC
protected boolean inverse
