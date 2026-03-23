# UpdateWorldMap

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Implements: com.hypixel.hytale.protocol.Packet, com.hypixel.hytale.protocol.ToClientPacket

public class UpdateWorldMap

Compressed client-bound packet (ID 241) for incremental world map updates. Contains arrays of added/updated map chunks, added markers, and removed marker IDs. Sent on the `WorldMap` network channel.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateWorldMap deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateWorldMap clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public MapChunk[] chunks
public MapMarker[] addedMarkers
public String[] removedMarkers
