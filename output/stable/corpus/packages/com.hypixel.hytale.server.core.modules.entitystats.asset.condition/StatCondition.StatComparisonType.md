# StatCondition.StatComparisonType

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset.condition

public static enum StatComparisonType

## Fields

- private final String prefix
- private final BiFloatPredicate satisfies

## Methods

- private StatComparisonType(String prefix, BiFloatPredicate satisfies)
- public String getPrefix()
- public boolean satisfies(float compareTo, float f)

Also in this package: AliveCondition, ChargingCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, PlayerCondition, RegenHealthCondition, SprintingCondition, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public String getPrefix()
  public boolean satisfies(float compareTo, float f)

Fields:
private final String prefix
private final BiFloatPredicate satisfies
