# InFluidCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class InFluidCondition extends Condition

Returns true when at least one block within the entity's bounding box contains a matching fluid. Supports both explicit fluid IDs and fluid tags.

## Static Fields

- public static final BuilderCodec<InFluidCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  private boolean isMatchingFluid(int fluidId)
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<InFluidCondition> CODEC
protected String[] fluidIds
protected String[] tags
private transient int[] fluidIndexes
private transient int[] tagIndexes
