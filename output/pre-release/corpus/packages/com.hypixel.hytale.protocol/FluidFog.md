# FluidFog

Type: enum | Package: com.hypixel.hytale.protocol

public enum FluidFog

Identifies the fog color source when submerged in a fluid.

## Constants

- Color | 0
- ColorLight | 1
- EnvironmentTint | 2

## Methods


public int getValue()

Returns the integer wire value for this `FluidFog` constant.


public static FluidFog fromValue(int value)

Returns the `FluidFog` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- FluidFX
- Color
