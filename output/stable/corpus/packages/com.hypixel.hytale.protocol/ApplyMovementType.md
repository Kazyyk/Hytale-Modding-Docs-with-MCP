# ApplyMovementType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ApplyMovementType

Determines how movement is applied to an entity: through the character controller physics or direct position assignment.

## Constants

- CharacterController | 0
- Position | 1

## Methods


public int getValue()

Returns the integer wire value for this `ApplyMovementType` constant.


public static ApplyMovementType fromValue(int value)

Returns the `ApplyMovementType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
