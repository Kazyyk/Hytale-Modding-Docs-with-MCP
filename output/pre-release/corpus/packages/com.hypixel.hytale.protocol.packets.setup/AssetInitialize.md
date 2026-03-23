# AssetInitialize

Type: class | Package: com.hypixel.hytale.protocol.packets.setup | Implements: Packet, ToClientPacket

public class AssetInitialize implements Packet, ToClientPacket

Server-to-client packet (ID 24) initiating transfer of a single asset. Contains the `Asset` descriptor and its total size in bytes.

Also in this package: AssetFinalize, AssetPart, ClientFeature, PlayerOptions, RemoveAssets, RequestAssets, RequestCommonAssetsRebuild, ServerTags, SetTimeDilation, SetUpdateRate, UpdateFeatures, ViewRadius, WorldLoadFinished, WorldLoadProgress, WorldSettings

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetInitialize deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetInitialize clone()
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
public Asset asset
public int size
