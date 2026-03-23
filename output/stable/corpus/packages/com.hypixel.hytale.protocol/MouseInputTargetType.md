# MouseInputTargetType

Type: enum | Package: com.hypixel.hytale.protocol

public enum MouseInputTargetType

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Any | 0 | Accept input targeting any object.
- Block | 1 | Accept input targeting blocks only.
- Entity | 2 | Accept input targeting entities only.
- None | 3 | No input target required.

## Methods


public int getValue()

Returns the integer wire value for this `MouseInputTargetType` constant.


public static MouseInputTargetType fromValue(int value)

Returns the `MouseInputTargetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
