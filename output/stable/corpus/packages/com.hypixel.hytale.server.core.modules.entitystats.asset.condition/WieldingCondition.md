# WieldingCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: Condition

public class WieldingCondition extends Condition

## Methods

- protected WieldingCondition()
- public WieldingCondition(boolean inverse)
- public boolean eval0(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime)
- public String toString()

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<WieldingCondition> CODEC
