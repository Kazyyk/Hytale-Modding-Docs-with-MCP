# Condition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition

public abstract class Condition

## Fields

- protected boolean inverse

## Methods

- protected Condition()
- public Condition(boolean inverse)
- public boolean eval(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public abstract boolean eval0(@Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3)
- public static boolean allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatType.Regenerating regenerating )
- public static boolean allConditionsMet( @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public String toString()

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
