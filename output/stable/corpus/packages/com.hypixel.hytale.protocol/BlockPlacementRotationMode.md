# BlockPlacementRotationMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockPlacementRotationMode

Determines how a block is oriented when placed.

## Constants

- FacingPlayer | 0
- StairFacingPlayer | 1
- BlockNormal | 2
- Default | 3

## Methods


public int getValue()

Returns the integer wire value for this `BlockPlacementRotationMode` constant.


public static BlockPlacementRotationMode fromValue(int value)

Returns the `BlockPlacementRotationMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockPlacementSettings
