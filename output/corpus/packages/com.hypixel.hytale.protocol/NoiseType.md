# NoiseType

Type: enum | Package: com.hypixel.hytale.protocol

public enum NoiseType

Enum with 6 constants used in the protocol serialization layer.

## Constants

- Sin | 0 | Sine wave noise.
- Cos | 1 | Cosine wave noise.
- Perlin_Linear | 2 | Perlin noise with linear interpolation.
- Perlin_Hermite | 3 | Perlin noise with Hermite interpolation.
- Perlin_Quintic | 4 | Perlin noise with quintic interpolation.
- Random | 5 | Random noise with no coherence.

## Methods


public int getValue()

Returns the integer wire value for this `NoiseType` constant.


public static NoiseType fromValue(int value)

Returns the `NoiseType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`5`). The static `VALUES` array is used for O(1) lookup by ordinal.
