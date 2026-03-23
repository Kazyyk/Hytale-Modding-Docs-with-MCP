# BiomeData

Type: class | Package: com.hypixel.hytale.protocol.packets.worldmap

public class BiomeData

Serializable data structure carrying biome zone ID, zone name, biome name, and biome color for world map rendering.

Also in this package: ClearWorldMap, ContextMenuItem, CreateUserMarker, HeightDeltaIconComponent, MapChunk, MapImage, MapMarker, MapMarkerComponent, PlacedByMarkerComponent, PlayerMarkerComponent, TeleportToWorldMapMarker, TeleportToWorldMapPosition, TintComponent, UpdateWorldMap, UpdateWorldMapSettings, UpdateWorldMapVisible

Complete API:
  public static BiomeData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BiomeData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int zoneId
public String zoneName
public String biomeName
public int biomeColor
