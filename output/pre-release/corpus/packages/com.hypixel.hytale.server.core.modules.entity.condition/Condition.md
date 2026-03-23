# Condition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition

public abstract class Condition

Abstract base class for data-driven entity conditions used in stat regeneration, effects, and gameplay logic. Each condition evaluates against an entity's ECS state at a given instant. Supports an `inverse` flag that negates the result. Conditions are codec-deserialized via `CodecMapCodec<Condition>`.

## Static Fields

- public static final CodecMapCodec<Condition> CODEC
- protected static final BuilderCodec<Condition> BASE_CODEC

## Fields

- protected boolean inverse

## Methods

- public boolean eval(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
- public abstract boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
- public static boolean allConditionsMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)

## Known Subclasses

- AliveCondition | Entity does not have DeathComponent
- ChargingCondition | Entity is in a charging interaction or recently charged
- CheckPlayerGameModeCondition | Player is in a specific game mode
- EntityStatBoundCondition | Abstract base for stat-based conditions
- EnvironmentCondition | Entity is in a specific environment
- GlidingCondition | Entity is gliding
- HasEffectCondition | Entity has a specific active effect
- InFluidCondition | Entity's bounding box intersects a fluid
- IsPlayerCondition | Entity has a Player component
- LogicCondition | Combines conditions with AND/OR
- NoDamageTakenCondition | No damage taken within a delay
- OutOfCombatCondition | Out of combat for a duration
- RegenHealthCondition | Always true (placeholder)
- SprintingCondition | Entity is sprinting
- StatCondition | Stat value meets comparison threshold
- SuffocatingCondition | Entity head position is in non-breathable material
- WieldingCondition | Entity is wielding something

Known subclasses: AliveCondition, AlwaysTrueCondition, ChargingCondition, CheckPlayerGameModeCondition, CurveCondition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, OutOfCombatCondition, RandomiserCondition, RegenHealthCondition, ScaledCurveCondition, SimpleCondition, SprintingCondition, SuffocatingCondition, WieldingCondition

Known implementors: AlwaysTrueCondition, AndCondition, EqualsCondition, GreaterThanCondition, NotCondition, OrCondition, SmallerThanCondition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

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
