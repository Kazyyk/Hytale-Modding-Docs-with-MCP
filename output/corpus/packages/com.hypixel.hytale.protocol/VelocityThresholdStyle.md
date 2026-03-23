# VelocityThresholdStyle

Type: enum | Package: com.hypixel.hytale.protocol

public enum VelocityThresholdStyle

Enum with 2 constants used in the protocol serialization layer.

## Constants

- Linear | 0 | Linear velocity threshold falloff.
- Exp | 1 | Exponential velocity threshold falloff.

## Methods


public int getValue()

Returns the integer wire value for this `VelocityThresholdStyle` constant.


public static VelocityThresholdStyle fromValue(int value)

Returns the `VelocityThresholdStyle` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
