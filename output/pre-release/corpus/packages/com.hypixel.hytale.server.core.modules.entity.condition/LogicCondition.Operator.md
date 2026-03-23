# LogicCondition.Operator

Type: enum | Package: com.hypixel.hytale.server.core.modules.entity.condition

public static enum LogicCondition.Operator

Logical operators for combining conditions within a `LogicCondition`.

## Enum Constants

- AND | All conditions must evaluate to true
- OR | At least one condition must evaluate to true

## Methods

- public abstract boolean eval(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime, Condition[] conditions)

## Relationships

- Inner enum of LogicCondition
