# EntityStatBoundCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public abstract class EntityStatBoundCondition extends Condition

## Fields

- protected String unknownStat
- protected int stat

## Methods

- protected EntityStatBoundCondition()
- public EntityStatBoundCondition(boolean inverse, int stat)
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public abstract boolean eval0(@Nonnull Ref<EntityStore> var1, @Nonnull Instant var2, @Nonnull EntityStatValue var3)
- public String toString()

Known subclasses: StatCondition

Also in this package: AliveCondition, ChargingCondition, Condition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public abstract boolean eval0(Ref<EntityStore> var1, Instant var2, EntityStatValue var3)
  public String toString()

Fields:
public static final BuilderCodec<EntityStatBoundCondition> CODEC
protected String unknownStat
protected int stat
