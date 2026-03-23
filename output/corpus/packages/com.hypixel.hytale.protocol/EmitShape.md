# EmitShape

Type: enum | Package: com.hypixel.hytale.protocol

public enum EmitShape

Defines the emission volume shape for particle systems.

## Constants

- Sphere | 0
- Cube | 1

## Methods


public int getValue()

Returns the integer wire value for this `EmitShape` constant.


public static EmitShape fromValue(int value)

Returns the `EmitShape` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
