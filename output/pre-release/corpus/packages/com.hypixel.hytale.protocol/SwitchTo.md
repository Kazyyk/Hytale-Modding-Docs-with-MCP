# SwitchTo

Type: enum | Package: com.hypixel.hytale.protocol

public enum SwitchTo

Enum with 4 constants used in the protocol serialization layer.

## Constants

- Disappear | 0 | Entity disappears on switch.
- PostColor | 1 | Apply post-processing color effect.
- Distortion | 2 | Apply distortion effect.
- Transparency | 3 | Apply transparency effect.

## Methods


public int getValue()

Returns the integer wire value for this `SwitchTo` constant.


public static SwitchTo fromValue(int value)

Returns the `SwitchTo` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
