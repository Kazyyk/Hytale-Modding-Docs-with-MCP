# IPacketReceiver

Type: interface | Package: com.hypixel.hytale.server.core.receiver

public interface IPacketReceiver

Utility type in the `receiver` subsystem.

## Abstract Methods

- write | void | ToClientPacket var1
- writeNoCache | void | ToClientPacket var1

Known implementors: PacketHandler

Also in this package: IEventTitleReceiver, IMessageReceiver

Complete API:
  void write(ToClientPacket var1)
  void writeNoCache(ToClientPacket var1)
