# MovementDirection

Type: enum | Package: com.hypixel.hytale.protocol

public enum MovementDirection

Enum with 9 constants used in the protocol serialization layer.

## Constants

- None | 0 | No movement direction.
- Forward | 1 | Forward movement.
- Back | 2 | Backward movement.
- Left | 3 | Left strafe.
- Right | 4 | Right strafe.
- ForwardLeft | 5 | Diagonal forward-left.
- ForwardRight | 6 | Diagonal forward-right.
- BackLeft | 7 | Diagonal backward-left.
- BackRight | 8 | Diagonal backward-right.

## Methods


public int getValue()

Returns the integer wire value for this `MovementDirection` constant.


public static MovementDirection fromValue(int value)

Returns the `MovementDirection` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`8`). The static `VALUES` array is used for O(1) lookup by ordinal.
