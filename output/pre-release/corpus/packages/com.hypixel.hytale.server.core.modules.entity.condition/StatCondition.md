# StatCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: EntityStatBoundCondition

public class StatCondition extends EntityStatBoundCondition

Evaluates whether an entity stat value satisfies a comparison (GTE, GT, LTE, LT, EQUAL) against a configured amount. Extends `EntityStatBoundCondition`.

## Static Fields

- public static final BuilderCodec<StatCondition> CODEC

## Relationships

- Extends EntityStatBoundCondition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(Ref<EntityStore> ref, Instant currentTime, EntityStatValue statValue)
  public String toString()

Fields:
public static final BuilderCodec<StatCondition> CODEC
protected StatCondition.StatComparisonType comparison
protected float amount
