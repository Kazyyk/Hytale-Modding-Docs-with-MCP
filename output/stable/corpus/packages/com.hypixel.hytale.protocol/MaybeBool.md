# MaybeBool

Type: enum | Package: com.hypixel.hytale.protocol

public enum MaybeBool

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Null | 0 | No value set (tri-state null).
- False | 1 | Boolean false.
- True | 2 | Boolean true.

## Methods


public int getValue()

Returns the integer wire value for this `MaybeBool` constant.


public static MaybeBool fromValue(int value)

Returns the `MaybeBool` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
