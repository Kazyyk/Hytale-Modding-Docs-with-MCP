# ParticleUVOption

Type: enum | Package: com.hypixel.hytale.protocol

public enum ParticleUVOption

Enum with 7 constants used in the protocol serialization layer.

## Constants

- None | 0 | No UV modification.
- RandomFlipU | 1 | Randomly flip texture U coordinate.
- RandomFlipV | 2 | Randomly flip texture V coordinate.
- RandomFlipUV | 3 | Randomly flip both U and V coordinates.
- FlipU | 4 | Always flip texture U coordinate.
- FlipV | 5 | Always flip texture V coordinate.
- FlipUV | 6 | Always flip both U and V coordinates.

## Methods


public int getValue()

Returns the integer wire value for this `ParticleUVOption` constant.


public static ParticleUVOption fromValue(int value)

Returns the `ParticleUVOption` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.
