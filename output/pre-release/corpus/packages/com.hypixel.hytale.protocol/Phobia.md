# Phobia

Type: enum | Package: com.hypixel.hytale.protocol

public enum Phobia

Enum with 3 constants used in the protocol serialization layer.

## Constants

- None | 0 | No phobia filter applied.
- Arachnophobia | 1 | Arachnophobia mode (replaces spider-like entities).
- Ophidiophobia | 2 | Ophidiophobia mode (replaces snake-like entities).

## Methods


public int getValue()

Returns the integer wire value for this `Phobia` constant.


public static Phobia fromValue(int value)

Returns the `Phobia` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
