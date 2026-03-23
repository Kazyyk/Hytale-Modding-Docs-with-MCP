# EnvironmentCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public class EnvironmentCondition extends Condition

## Fields

- protected String[] unknownEnvironments
- protected int[] environments

## Methods

- protected EnvironmentCondition()
- public int[] getEnvironments()
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public String toString()

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public int[] getEnvironments()
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<EnvironmentCondition> CODEC
protected String[] unknownEnvironments
protected int[] environments
