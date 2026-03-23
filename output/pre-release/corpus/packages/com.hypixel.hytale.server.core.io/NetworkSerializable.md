# NetworkSerializable

Type: interface | Package: com.hypixel.hytale.server.core.io

public interface NetworkSerializable<Packet>

Generic interface for objects that can convert themselves into a network packet representation.

## Type Parameters

- `Packet` -- the packet type this object serializes to.

## Methods


Packet toPacket()

Converts this object into its packet representation for network transmission.
