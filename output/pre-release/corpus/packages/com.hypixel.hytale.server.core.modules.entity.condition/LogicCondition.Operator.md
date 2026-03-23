# LogicCondition.Operator

Type: enum | Package: com.hypixel.hytale.server.core.modules.entity.condition

public static enum LogicCondition.Operator

Logical operators for combining conditions within a `LogicCondition`.

## Enum Constants

- AND | All conditions must evaluate to true
- OR | At least one condition must evaluate to true

## Methods

- public abstract boolean eval(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)

## Relationships

- Inner enum of LogicCondition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public abstract boolean eval(ComponentAccessor<EntityStore> var1, Ref<EntityStore> var2, Instant var3, Condition[] var4)
