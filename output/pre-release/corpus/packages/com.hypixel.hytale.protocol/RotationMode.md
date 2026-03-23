# RotationMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum RotationMode

Enum with 4 constants used in the protocol serialization layer.

## Constants

- None | 0 | No rotation mode.
- Velocity | 1 | Rotation follows velocity direction.
- VelocityDamped | 2 | Rotation follows velocity with damping.
- VelocityRoll | 3 | Rotation follows velocity with roll.

## Methods


public int getValue()

Returns the integer wire value for this `RotationMode` constant.


public static RotationMode fromValue(int value)

Returns the `RotationMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
