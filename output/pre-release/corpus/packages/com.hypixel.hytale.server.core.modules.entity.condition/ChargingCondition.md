# ChargingCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class ChargingCondition extends Condition

Returns true when the entity is currently in a `ChargingInteraction` or has charged within a configurable delay duration. Checks both the interaction manager's active interactions and the `DamageDataComponent.getLastChargeTime()`.

## Static Fields

- public static final BuilderCodec<ChargingCondition> CODEC

## Relationships

- Extends Condition
