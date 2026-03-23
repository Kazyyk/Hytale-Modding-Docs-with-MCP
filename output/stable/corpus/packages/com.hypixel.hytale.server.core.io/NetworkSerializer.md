# NetworkSerializer

Type: interface | Package: com.hypixel.hytale.server.core.io

@FunctionalInterface
public interface NetworkSerializer<Type, Packet>

Functional interface that converts a domain object into a network packet. Unlike NetworkSerializable, this is an external converter rather than a self-serializing pattern.

## Type Parameters

- `Type` -- the source domain object type.
- `Packet` -- the target packet type.

## Methods


Packet toPacket(Type var1)

Converts the given domain object into its packet representation.

Known implementors: ObjectiveTask

Also in this package: DisconnectReason, NetworkSerializable, NetworkSerializers, PacketHandler, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Complete API:
  Packet toPacket(Type var1)
