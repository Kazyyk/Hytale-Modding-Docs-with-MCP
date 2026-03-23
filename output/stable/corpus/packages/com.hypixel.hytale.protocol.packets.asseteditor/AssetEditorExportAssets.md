# AssetEditorExportAssets

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorExportAssets implements Packet, ToServerPacket

Client-to-server packet (ID 342). Requests the server to export one or more assets.

## Fields

- AssetPath[] paths

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorExportAssets deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorExportAssets` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorExportAssets` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorExportAssets` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorExportAssets deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorExportAssets clone()
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
public AssetPath[] paths
