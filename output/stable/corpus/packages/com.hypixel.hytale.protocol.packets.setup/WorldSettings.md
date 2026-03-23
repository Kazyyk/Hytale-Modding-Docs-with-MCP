# WorldSettings

Type: class | Package: com.hypixel.hytale.protocol.packets.setup | Implements: Packet, ToClientPacket

public class WorldSettings implements Packet, ToClientPacket

Server-to-client packet (ID 20) carrying world configuration including game mode, world time, daylight hours, and moon phase.

Also in this package: AssetFinalize, AssetInitialize, AssetPart, ClientFeature, PlayerOptions, RemoveAssets, RequestAssets, RequestCommonAssetsRebuild, ServerTags, SetTimeDilation, SetUpdateRate, UpdateFeatures, ViewRadius, WorldLoadFinished, WorldLoadProgress

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static WorldSettings deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public WorldSettings clone()
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
public int worldHeight
public Asset[] requiredAssets
