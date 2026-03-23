# CreateUserMarker

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Implements: com.hypixel.hytale.protocol.Packet, com.hypixel.hytale.protocol.ToServerPacket

public class CreateUserMarker

Server-bound packet (ID 246) sent when a player creates a marker on the world map. Contains position, optional name, marker image, tint color, and shared flag.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static CreateUserMarker deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CreateUserMarker clone()
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
public float x
public float z
public String name
public String markerImage
public Color tintColor
public boolean shared
