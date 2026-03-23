# EnvironmentCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class EnvironmentCondition extends Condition

Returns true when the entity's position is in one of the specified environments. Resolves environment names to indices lazily and uses binary search for matching.

## Static Fields

- public static final BuilderCodec<EnvironmentCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public int[] getEnvironments()
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<EnvironmentCondition> CODEC
protected String[] unknownEnvironments
protected int[] environments
