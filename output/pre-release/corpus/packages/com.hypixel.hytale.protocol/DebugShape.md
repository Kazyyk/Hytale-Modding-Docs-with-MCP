# DebugShape

Type: enum | Package: com.hypixel.hytale.protocol

public enum DebugShape

Identifies geometric shapes used for debug visualization.

## Constants

- Sphere | 0
- Cylinder | 1
- Cone | 2
- Cube | 3
- Frustum | 4
- Sector | 5
- Disc | 6

## Methods


public int getValue()

Returns the integer wire value for this `DebugShape` constant.


public static DebugShape fromValue(int value)

Returns the `DebugShape` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.
