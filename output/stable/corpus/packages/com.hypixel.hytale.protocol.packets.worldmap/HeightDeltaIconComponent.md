# HeightDeltaIconComponent

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap | Extends: MapMarkerComponent

public class HeightDeltaIconComponent extends MapMarkerComponent

Map marker component (type ID 2) that changes the marker icon based on vertical distance between the marker and viewer. Configurable up/down delta thresholds and corresponding image assets.

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static HeightDeltaIconComponent deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public HeightDeltaIconComponent clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int upDelta
public String upImage
public int downDelta
public String downImage
