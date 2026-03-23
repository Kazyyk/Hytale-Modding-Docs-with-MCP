# ShadingMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum ShadingMode

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Standard | 0 | Standard lighting and shading.
- Flat | 1 | Flat shading with no lighting gradients.
- Fullbright | 2 | Fully lit, ignores lighting.
- Reflective | 3 | Reflective surface shading.

## Methods


public int getValue()

Returns the integer wire value for this `ShadingMode` constant.


public static ShadingMode fromValue(int value)

Returns the `ShadingMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
