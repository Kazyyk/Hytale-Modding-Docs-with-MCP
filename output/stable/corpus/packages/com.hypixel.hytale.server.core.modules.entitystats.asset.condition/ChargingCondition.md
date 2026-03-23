# ChargingCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public class ChargingCondition extends Condition

## Fields

- protected Duration delay

## Methods

- protected ChargingCondition()
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public String toString()

Also in this package: AliveCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<ChargingCondition> CODEC
protected Duration delay
