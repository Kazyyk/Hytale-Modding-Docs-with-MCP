# CameraNode

Type: enum | Package: com.hypixel.hytale.protocol

public enum CameraNode

Protocol enum type in the Hytale client-server protocol.

## Constants

- None | 0
- Head | 1
- LShoulder | 2
- RShoulder | 3
- Belly | 4

## Methods


public int getValue()

Returns the integer wire value for this `CameraNode` constant.


public static CameraNode fromValue(int value)

Returns the `CameraNode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
