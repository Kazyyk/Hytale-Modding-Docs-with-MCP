# ClientDisconnectReason

Type: enum | Package: com.hypixel.hytale.protocol.packets.connection

public enum ClientDisconnectReason

Enum of reasons a client may disconnect.

## Enum Constants

- `PlayerLeave`
- `PlayerAbort`
- `UserLeave`
- `Crash`

Also in this package: ClientDisconnect, ClientType, Connect, DisconnectType, Ping, Pong, PongType, QuicApplicationErrorCode, ServerDisconnect

Complete API:
  public int getValue()
  public static ClientDisconnectReason fromValue(int value)

Fields:
public static final ClientDisconnectReason[] VALUES
private final int value
