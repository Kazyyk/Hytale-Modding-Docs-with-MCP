# PositionDistanceOffsetType

Type: enum | Package: com.hypixel.hytale.protocol

public enum PositionDistanceOffsetType

Enum with 3 constants used in the protocol serialization layer.

## Constants

- DistanceOffset | 0 | Offset by a fixed distance.
- DistanceOffsetRaycast | 1 | Offset by distance with raycast adjustment.
- None | 2 | No distance offset.

## Methods


public int getValue()

Returns the integer wire value for this `PositionDistanceOffsetType` constant.


public static PositionDistanceOffsetType fromValue(int value)

Returns the `PositionDistanceOffsetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
