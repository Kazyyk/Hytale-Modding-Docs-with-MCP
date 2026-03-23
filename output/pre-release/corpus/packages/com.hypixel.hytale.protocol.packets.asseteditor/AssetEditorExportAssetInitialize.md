# AssetEditorExportAssetInitialize

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorExportAssetInitialize implements Packet, ToClientPacket

Server-to-client packet (ID 343). Initializes an asset export, specifying the asset to export and its total size.

## Fields

- AssetEditorAsset asset
- AssetPath oldPath
- int size
- boolean failed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 14
- MAX_SIZE | 81,920,066

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorExportAssetInitialize deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorExportAssetInitialize` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorExportAssetInitialize` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorExportAssetInitialize` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorAsset
- AssetPath

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetPart, AssetEditorExportAssets (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorExportAssetInitialize deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorExportAssetInitialize clone()
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
public AssetEditorAsset asset
public AssetPath oldPath
public int size
public boolean failed
