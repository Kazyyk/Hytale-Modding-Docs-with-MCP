# MountController

Type: enum | Package: com.hypixel.hytale.protocol

public enum MountController

Enum with 2 constants used in the protocol serialization layer.

## Constants

- Minecart | 0 | Rail-based minecart controller.
- BlockMount | 1 | Static block-based mount controller.

## Methods


public int getValue()

Returns the integer wire value for this `MountController` constant.


public static MountController fromValue(int value)

Returns the `MountController` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
