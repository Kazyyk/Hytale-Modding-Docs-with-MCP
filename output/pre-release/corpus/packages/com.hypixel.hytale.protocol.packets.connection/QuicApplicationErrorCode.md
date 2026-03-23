# QuicApplicationErrorCode

Type: enum | Package: com.hypixel.hytale.protocol.packets.connection

public enum QuicApplicationErrorCode

Enum of QUIC application-level error codes.

## Enum Constants

- `NoError`
- `RateLimited`
- `AuthFailed`
- `InvalidVersion`
- `Timeout`
- `ClientOutdated`
- `ServerOutdated`

Also in this package: ClientDisconnect, ClientDisconnectReason, ClientType, Connect, DisconnectType, Ping, Pong, PongType, ServerDisconnect

Complete API:
  public int getValue()
  public static QuicApplicationErrorCode fromValue(int value)

Fields:
public static final QuicApplicationErrorCode[] VALUES
private final int value
