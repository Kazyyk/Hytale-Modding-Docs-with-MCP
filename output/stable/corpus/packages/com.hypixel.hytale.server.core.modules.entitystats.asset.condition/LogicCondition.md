# LogicCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public class LogicCondition extends Condition

## Fields

- protected LogicCondition.Operator operator
- protected Condition[] conditions

## Methods

- protected LogicCondition()
- public LogicCondition(boolean inverse, @Nonnull LogicCondition.Operator operator, @Nonnull Condition[] conditions)
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public String toString()
- public boolean eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public boolean eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public abstract boolean eval( @Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3, @Nonnull Condition[] var4 )

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<LogicCondition> CODEC
protected LogicCondition.Operator operator
protected Condition[] conditions
