# FailOnType

Type: enum | Package: com.hypixel.hytale.protocol

public enum FailOnType

Determines what target type causes an interaction to fail.

## Constants

- Neither | 0
- Entity | 1
- Block | 2
- Either | 3

## Methods


public int getValue()

Returns the integer wire value for this `FailOnType` constant.


public static FailOnType fromValue(int value)

Returns the `FailOnType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
