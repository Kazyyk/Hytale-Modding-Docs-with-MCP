# PacketHandler.DisconnectReason

Type: class | Package: com.hypixel.hytale.server.core.io

public static class PacketHandler.DisconnectReason

Tracks the reason a connection was terminated, either from a server-initiated disconnect (with a `FormattedMessage`) or a client-initiated disconnect (with a `DisconnectType`). Setting one clears the other.

## Methods

- public String getServerDisconnectReason()
- public FormattedMessage getServerDisconnectReasonFormatted()
- public void setServerDisconnectReason(FormattedMessage serverDisconnectReason)
- public DisconnectType getClientDisconnectType()
- public void setClientDisconnectType(DisconnectType clientDisconnectType)
- public String toString()

## Relationships

- Inner class of PacketHandler

Also in this package: NetworkSerializable, NetworkSerializer, NetworkSerializers, PacketHandler, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Complete API:
  public String getServerDisconnectReason()
  public FormattedMessage getServerDisconnectReasonFormatted()
  public void setServerDisconnectReason(FormattedMessage serverDisconnectReason)
  public void setServerDisconnectReason(String serverDisconnectReason)
  public DisconnectType getClientDisconnectType()
  public void setClientDisconnectType(DisconnectType clientDisconnectType)
  public String toString()

Fields:
private FormattedMessage serverDisconnectReason
private DisconnectType clientDisconnectType
