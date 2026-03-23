# EntityPart

Type: enum | Package: com.hypixel.hytale.protocol

public enum EntityPart

Identifies a component part of an entity for targeting purposes.

## Constants

- Self | 0
- Entity | 1
- PrimaryItem | 2
- SecondaryItem | 3

## Methods


public int getValue()

Returns the integer wire value for this `EntityPart` constant.


public static EntityPart fromValue(int value)

Returns the `EntityPart` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
