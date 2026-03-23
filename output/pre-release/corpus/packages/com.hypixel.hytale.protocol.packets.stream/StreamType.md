# StreamType

Type: enum | Package: com.hypixel.hytale.protocol.packets.stream | Extends: java.lang.Enum

public enum StreamType

Enumerates the types of network streams that can be opened between client and server.

## Enum Constants

- Game | 0
- Voice | 1

## Methods


public int getValue()

Returns the integer wire value of this stream type.


public static StreamType fromValue(int value)

Returns the `StreamType` for the given wire value. Throws `ProtocolException` if the value is out of range.

## Related Types

- StreamOpen -- packet that uses this enum
- StreamOpenResponse -- response packet that uses this enum
