# MapMarker

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap

public class MapMarker

Serializable data structure for a world map marker. Contains an ID, optional formatted name, custom name, marker image path, transform, context menu items array, and polymorphic component array.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static MapMarker deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MapMarker clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public FormattedMessage name
public String markerImage
public Transform transform
public ContextMenuItem[] contextMenuItems
public MapMarkerComponent[] components
