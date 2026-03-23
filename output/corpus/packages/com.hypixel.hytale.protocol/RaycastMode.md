# RaycastMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum RaycastMode

Enum with 2 constants used in the protocol serialization layer.

## Constants

- FollowMotion | 0 | Raycast follows the entity's motion direction.
- FollowLook | 1 | Raycast follows the entity's look direction.

## Methods


public int getValue()

Returns the integer wire value for this `RaycastMode` constant.


public static RaycastMode fromValue(int value)

Returns the `RaycastMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.
