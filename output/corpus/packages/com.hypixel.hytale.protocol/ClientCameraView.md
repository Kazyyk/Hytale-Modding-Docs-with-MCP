# ClientCameraView

Type: enum | Package: com.hypixel.hytale.protocol

public enum ClientCameraView

Identifies the client's current camera view mode.

## Constants

- FirstPerson | 0
- ThirdPerson | 1
- Custom | 2

## Methods


public int getValue()

Returns the integer wire value for this `ClientCameraView` constant.


public static ClientCameraView fromValue(int value)

Returns the `ClientCameraView` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
