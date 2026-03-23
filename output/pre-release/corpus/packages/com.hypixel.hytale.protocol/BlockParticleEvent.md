# BlockParticleEvent

Type: enum | Package: com.hypixel.hytale.protocol

public enum BlockParticleEvent

Identifies the type of interaction that triggers block particles.

## Constants

- Walk | 0
- Run | 1
- Sprint | 2
- SoftLand | 3
- HardLand | 4
- MoveOut | 5
- Hit | 6
- Break | 7
- Build | 8
- Physics | 9

## Methods


public int getValue()

Returns the integer wire value for this `BlockParticleEvent` constant.


public static BlockParticleEvent fromValue(int value)

Returns the `BlockParticleEvent` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`9`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- BlockParticleSet
