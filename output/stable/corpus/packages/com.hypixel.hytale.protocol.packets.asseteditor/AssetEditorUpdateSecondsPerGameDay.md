# AssetEditorUpdateSecondsPerGameDay

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorUpdateSecondsPerGameDay implements Packet, ToClientPacket

Server-to-client packet (ID 353). Sent by the client to update the seconds-per-game-day preview setting.

## Fields

- int nighttimeDurationSeconds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUpdateSecondsPerGameDay deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUpdateSecondsPerGameDay` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUpdateSecondsPerGameDay` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUpdateSecondsPerGameDay` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorUpdateSecondsPerGameDay deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorUpdateSecondsPerGameDay clone()
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
public int daytimeDurationSeconds
public int nighttimeDurationSeconds
