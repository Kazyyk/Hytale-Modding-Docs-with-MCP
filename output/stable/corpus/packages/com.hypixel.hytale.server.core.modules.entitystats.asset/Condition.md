# Condition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition

public abstract class Condition

Abstract base class for conditions used in entity stat regeneration rules. Conditions are evaluated against an entity's component store and the current game time. Supports an `inverse` flag to negate the evaluation result.

Subclass implementations (registered via `CodecMapCodec`) include: `AliveCondition`, `ChargingCondition`, `EntityStatBoundCondition`, `EnvironmentCondition`, `GlidingCondition`, `LogicCondition`, `NoDamageTakenCondition`, `OutOfCombatCondition`, `PlayerCondition`, `RegenHealthCondition`, `SprintingCondition`, `StatCondition`, `SuffocatingCondition`, `WieldingCondition`.

## Fields

- @Nonnull public static final CodecMapCodec<Condition> CODEC
- protected boolean inverse

## Methods

- public boolean eval(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public abstract boolean eval0(@Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3)
- public static boolean allConditionsMet(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatType.Regenerating regenerating)
- public static boolean allConditionsMet(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions)

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
