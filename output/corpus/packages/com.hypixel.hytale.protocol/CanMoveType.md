# CanMoveType

Type: enum | Package: com.hypixel.hytale.protocol

public enum CanMoveType

Determines when a visual effect or element is allowed to move.

## Constants

- AttachedToLocalPlayer | 0
- Always | 1

## Methods


public int getValue()

Returns the integer wire value for this `CanMoveType` constant.


public static CanMoveType fromValue(int value)

Returns the `CanMoveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
