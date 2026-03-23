# SoundCategory

Type: enum | Package: com.hypixel.hytale.protocol

public enum SoundCategory

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Music | 0 | Background music category.
- Ambient | 1 | Ambient/environmental sound category.
- SFX | 2 | Sound effects category.
- UI | 3 | User interface sound category.

## Methods


public int getValue()

Returns the integer wire value for this `SoundCategory` constant.


public static SoundCategory fromValue(int value)

Returns the `SoundCategory` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
