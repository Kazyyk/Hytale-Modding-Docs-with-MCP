# FXRenderMode

Type: enum | Package: com.hypixel.hytale.protocol

public enum FXRenderMode

Identifies the rendering blend mode for visual effects.

## Constants

- BlendLinear | 0
- BlendAdd | 1
- Erosion | 2
- Distortion | 3

## Methods


public int getValue()

Returns the integer wire value for this `FXRenderMode` constant.


public static FXRenderMode fromValue(int value)

Returns the `FXRenderMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
