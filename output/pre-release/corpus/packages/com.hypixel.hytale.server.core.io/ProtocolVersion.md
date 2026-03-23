# ProtocolVersion

Type: class | Package: com.hypixel.hytale.server.core.io

public class ProtocolVersion

Immutable value object representing a protocol version identified by a CRC checksum. Two `ProtocolVersion` instances are equal if and only if their CRC values match.

## Constructors


public ProtocolVersion(int crc)

## Instance Methods


public int getCrc()

Returns the CRC checksum identifying this protocol version.


public boolean equals(@Nullable Object o)


public int hashCode()


public String toString()
