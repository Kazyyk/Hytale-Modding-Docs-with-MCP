# ChangeVelocityType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ChangeVelocityType

Determines whether velocity modification adds to or replaces current velocity.

## Constants

- Add | 0
- Set | 1

## Methods


public int getValue()

Returns the integer wire value for this `ChangeVelocityType` constant.


public static ChangeVelocityType fromValue(int value)

Returns the `ChangeVelocityType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
