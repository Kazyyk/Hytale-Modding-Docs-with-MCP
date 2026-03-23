# ChargingCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class ChargingCondition extends Condition

Returns true when the entity is currently in a `ChargingInteraction` or has charged within a configurable delay duration. Checks both the interaction manager's active interactions and the `DamageDataComponent.getLastChargeTime()`.

## Static Fields

- public static final BuilderCodec<ChargingCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<ChargingCondition> CODEC
protected Duration delay
