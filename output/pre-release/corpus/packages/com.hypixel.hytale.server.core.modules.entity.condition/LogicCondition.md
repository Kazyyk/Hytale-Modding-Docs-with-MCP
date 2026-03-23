# LogicCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class LogicCondition extends Condition

Combines an array of child conditions using either AND or OR logic. Both the operator and the conditions array are codec-deserialized.

## Static Fields

- public static final BuilderCodec<LogicCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<LogicCondition> CODEC
protected LogicCondition.Operator operator
protected Condition[] conditions
