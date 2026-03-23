# IsPlayerCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class IsPlayerCondition extends Condition

Returns true when the entity has a `Player` component.

## Static Fields

- public static final BuilderCodec<IsPlayerCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<IsPlayerCondition> CODEC
