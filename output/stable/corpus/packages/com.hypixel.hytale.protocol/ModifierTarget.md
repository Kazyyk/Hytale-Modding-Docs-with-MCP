# ModifierTarget

Type: enum | Package: com.hypixel.hytale.protocol

public enum ModifierTarget

Enum with 2 constants used in the protocol serialization layer.

## Constants

- Min | 0 | Apply modifier to the minimum value.
- Max | 1 | Apply modifier to the maximum value.

## Methods


public int getValue()

Returns the integer wire value for this `ModifierTarget` constant.


public static ModifierTarget fromValue(int value)

Returns the `ModifierTarget` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
