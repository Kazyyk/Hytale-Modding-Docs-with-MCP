# AliveCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class AliveCondition extends Condition

Returns true when the entity does not have a `DeathComponent` (i.e., is alive).

## Static Fields

- public static final BuilderCodec<AliveCondition> CODEC

## Relationships

- Extends Condition

Also in this package: ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<AliveCondition> CODEC
