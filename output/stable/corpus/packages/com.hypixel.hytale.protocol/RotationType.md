# RotationType

Type: enum | Package: com.hypixel.hytale.protocol

public enum RotationType

Enum with 2 constants used in the protocol serialization layer.

## Constants

- AttachedToPlusOffset | 0 | Rotation attached to an entity/node with an offset.
- Custom | 1 | Custom rotation defined by other fields.

## Methods


public int getValue()

Returns the integer wire value for this `RotationType` constant.


public static RotationType fromValue(int value)

Returns the `RotationType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
