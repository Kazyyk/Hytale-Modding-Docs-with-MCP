# EffectDirection

Type: enum | Package: com.hypixel.hytale.protocol

public enum EffectDirection

Specifies the directional flow of a visual effect.

## Constants

- None | 0
- BottomUp | 1
- TopDown | 2
- ToCenter | 3
- FromCenter | 4

## Methods


public int getValue()

Returns the integer wire value for this `EffectDirection` constant.


public static EffectDirection fromValue(int value)

Returns the `EffectDirection` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
