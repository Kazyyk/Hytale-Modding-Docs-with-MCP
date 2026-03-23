# ChangeStatBehaviour

Type: enum | Package: com.hypixel.hytale.protocol

public enum ChangeStatBehaviour

Determines whether a stat change adds to or sets the current value.

## Constants

- Add | 0
- Set | 1

## Methods


public int getValue()

Returns the integer wire value for this `ChangeStatBehaviour` constant.


public static ChangeStatBehaviour fromValue(int value)

Returns the `ChangeStatBehaviour` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ChangeStatInteraction
