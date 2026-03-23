# BlockFace

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockFace

Identifies a face of a block in 3D space.

## Constants

- None | 0 | No face specified.
- Up | 1 | Top face (+Y).
- Down | 2 | Bottom face (-Y).
- North | 3 | North face (-Z).
- South | 4 | South face (+Z).
- East | 5 | East face (+X).
- West | 6 | West face (-X).

## Methods


public int getValue()

Returns the integer wire value for this `BlockFace` constant.


public static BlockFace fromValue(int value)

Returns the `BlockFace` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockPosition
- InteractionSyncData
