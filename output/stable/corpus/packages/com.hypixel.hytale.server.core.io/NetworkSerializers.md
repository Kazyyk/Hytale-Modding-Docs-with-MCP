# NetworkSerializers

Type: interface | Package: com.hypixel.hytale.server.core.io

public interface NetworkSerializers

Container for shared NetworkSerializer instances used across the networking layer.

## Constants


NetworkSerializer<Box, Hitbox> BOX

Serializer that converts a `Box` math shape into a `Hitbox` protocol packet by extracting the min/max XYZ float coordinates.

Also in this package: DisconnectReason, NetworkSerializable, NetworkSerializer, PacketHandler, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Fields:
NetworkSerializer<Box,Hitbox> BOX
