# CheckPlayerGameModeCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class CheckPlayerGameModeCondition extends Condition

Returns true when the entity is a player in a specific `GameMode`. Returns false for non-player entities.

## Static Fields

- public static final BuilderCodec<CheckPlayerGameModeCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<CheckPlayerGameModeCondition> CODEC
private GameMode gameModeToCheck
