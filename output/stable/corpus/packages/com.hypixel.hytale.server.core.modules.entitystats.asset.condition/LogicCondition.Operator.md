# LogicCondition.Operator

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition

public static enum Operator

## Methods

- public boolean eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public boolean eval( @Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull Condition[] conditions )
- public abstract boolean eval( @Nonnull ComponentAccessor<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Instant var3, @Nonnull Condition[] var4 )

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public abstract boolean eval(ComponentAccessor<EntityStore> var1, Ref<EntityStore> var2, Instant var3, Condition[] var4)
