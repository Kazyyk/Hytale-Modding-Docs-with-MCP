# BlockSupportsRequiredForType

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockSupportsRequiredForType

Determines whether a block requires support from any or all specified neighbors.

## Constants

- Any | 0
- All | 1

## Methods


public int getValue()

Returns the integer wire value for this `BlockSupportsRequiredForType` constant.


public static BlockSupportsRequiredForType fromValue(int value)

Returns the `BlockSupportsRequiredForType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockType
