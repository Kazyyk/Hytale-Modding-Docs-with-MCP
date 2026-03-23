# AliveCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public class AliveCondition extends Condition

## Methods

- protected AliveCondition()
- public AliveCondition(boolean inverse)
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public String toString()

Also in this package: ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<AliveCondition> CODEC
