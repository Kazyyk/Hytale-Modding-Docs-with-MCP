# MapMarkerComponent

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap

public abstract class MapMarkerComponent

Abstract base class for polymorphic map marker components. Subtypes are identified by integer type IDs: `PlayerMarkerComponent` (0), `PlacedByMarkerComponent` (1), `HeightDeltaIconComponent` (2), `TintComponent` (3).

Known subclasses: HeightDeltaIconComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TintComponent

Also in this package: BiomeData, ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static MapMarkerComponent deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int getTypeId()
  public abstract int serialize(ByteBuf var1)
  public abstract int computeSize()
  public int serializeWithTypeId(ByteBuf buf)
  public int computeSizeWithTypeId()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)

Fields:
public static final int MAX_SIZE
