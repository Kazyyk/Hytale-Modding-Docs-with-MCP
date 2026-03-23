# MapImage

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap

public class MapImage

Serializable data structure for a world map image tile with width, height, and nullable pixel data array.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static MapImage deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MapImage clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int width
public int height
public int[] data
