# StaticModifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Extends: Modifier

public class StaticModifier extends Modifier

A concrete `Modifier` that applies a fixed additive or multiplicative adjustment to a stat bound. This is the only modifier type supported on the client for network replication.

## Fields

- calculationType | CalculationType | CalculationType | How the amount is applied.
- amount | float | Amount | The modifier value.

## Constructors


public StaticModifier(Modifier.ModifierTarget target, StaticModifier.CalculationType calculationType, float amount)

## Methods

- getCalculationType() | CalculationType | Returns the calculation type.
- getAmount() | float | Returns the modifier amount.
- apply(float statValue) | float | Applies `calculationType.compute(statValue, amount)`.
- toPacket() | Modifier` (protocol) | Converts to protocol format with `CalculationType` and `amount`.

## Inner Types

- StaticModifier.CalculationType
