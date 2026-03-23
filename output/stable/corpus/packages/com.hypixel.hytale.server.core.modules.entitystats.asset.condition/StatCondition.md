# StatCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition | Extends: EntityStatBoundCondition

public class StatCondition extends EntityStatBoundCondition

## Fields

- protected StatCondition.StatComparisonType comparison
- protected float amount
- private final String prefix
- private final BiFloatPredicate satisfies

## Methods

- protected StatCondition()
- public StatCondition(boolean inverse, int stat, float amount)
- public boolean eval0(@Nonnull Ref<EntityStore> ref, @Nonnull Instant currentTime, @Nonnull EntityStatValue statValue)
- public String toString()
- public String getPrefix()
- public boolean satisfies(float compareTo, float f)

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(Ref<EntityStore> ref, Instant currentTime, EntityStatValue statValue)
  public String toString()

Fields:
public static final BuilderCodec<StatCondition> CODEC
protected StatCondition.StatComparisonType comparison
protected float amount
