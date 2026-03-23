# StatCondition.StatComparisonType

Type: enum | Package: com.hypixel.hytale.server.core.modules.entity.condition

public static enum StatCondition.StatComparisonType

Comparison operators for stat conditions.

## Enum Constants

- GTE | >= | Greater than or equal
- GT | > | Greater than
- LTE | <= | Less than or equal
- LT | < | Less than
- EQUAL | = | Equal

## Methods

- public String getPrefix()
- public boolean satisfies(float compareTo, float f)

## Relationships

- Inner enum of StatCondition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public String getPrefix()
  public boolean satisfies(float compareTo, float f)

Fields:
private final String prefix
private final BiFloatPredicate satisfies
