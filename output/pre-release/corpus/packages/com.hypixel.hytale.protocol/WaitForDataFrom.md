# WaitForDataFrom

Type: enum | Package: com.hypixel.hytale.protocol

public enum WaitForDataFrom

Enum with 3 constants used in the protocol serialization layer.

## Constants

- Client | 0 | Wait for data from the client.
- Server | 1 | Wait for data from the server.
- None | 2 | Do not wait for data.

## Methods


public int getValue()

Returns the integer wire value for this `WaitForDataFrom` constant.


public static WaitForDataFrom fromValue(int value)

Returns the `WaitForDataFrom` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
