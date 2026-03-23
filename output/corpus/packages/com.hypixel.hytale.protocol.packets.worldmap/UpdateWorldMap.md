# UpdateWorldMap

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Implements: com.hypixel.hytale.protocol.Packet, com.hypixel.hytale.protocol.ToClientPacket

public class UpdateWorldMap

Compressed client-bound packet (ID 241) for incremental world map updates. Contains arrays of added/updated map chunks, added markers, and removed marker IDs. Sent on the `WorldMap` network channel.
