# PlacedByMarkerComponent

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Extends: MapMarkerComponent

public class PlacedByMarkerComponent extends MapMarkerComponent

Map marker component (type ID 1) identifying which player placed a marker. Contains a formatted name and the player's UUID.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static PlacedByMarkerComponent deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PlacedByMarkerComponent clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public FormattedMessage name
public UUID playerId
