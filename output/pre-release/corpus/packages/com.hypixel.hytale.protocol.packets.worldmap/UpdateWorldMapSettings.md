# UpdateWorldMapSettings

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Implements: com.hypixel.hytale.protocol.Packet, com.hypixel.hytale.protocol.ToClientPacket

public class UpdateWorldMapSettings

Client-bound packet (ID 240) configuring world map settings: enabled state, biome data map, teleport permissions, marker creation/removal permissions, and zoom scale bounds (default/min/max).

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapVisible

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateWorldMapSettings deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateWorldMapSettings clone()
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
public boolean enabled
public Map<Short,BiomeData> biomeDataMap
public boolean allowTeleportToCoordinates
public boolean allowTeleportToMarkers
public boolean allowShowOnMapToggle
public boolean allowCompassTrackingToggle
public boolean allowCreatingMapMarkers
public boolean allowRemovingOtherPlayersMarkers
public float defaultScale
public float minScale
public float maxScale
