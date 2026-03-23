# MouseButtonType

Type: enum | Package: com.hypixel.hytale.protocol

public enum MouseButtonType

Enum with 5 constants used in the protocol serialization layer.

## Constants

- Left | 0 | Left mouse button.
- Middle | 1 | Middle mouse button (scroll wheel click).
- Right | 2 | Right mouse button.
- X1 | 3 | Extra mouse button 1 (back/side).
- X2 | 4 | Extra mouse button 2 (forward/side).

## Methods


public int getValue()

Returns the integer wire value for this `MouseButtonType` constant.


public static MouseButtonType fromValue(int value)

Returns the `MouseButtonType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
