# Match

Type: enum | Package: com.hypixel.hytale.protocol

public enum Match

Enum with 2 constants used in the protocol serialization layer.

## Constants

- All | 0 | All conditions must match.
- None | 1 | No conditions must match (inverse match).

## Methods


public int getValue()

Returns the integer wire value for this `Match` constant.


public static Match fromValue(int value)

Returns the `Match` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
