# AssetEditorCreateAsset

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorCreateAsset implements Packet, ToServerPacket

Client-to-server packet (ID 327). Sent by the client to create a new asset at the specified path with given data.

## Fields

- AssetPath path
- byte`[] data
- AssetEditorRebuildCaches rebuildCaches
- String buttonId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 10
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 22
- MAX_SIZE | 53,248,051

Binary layout: 1 null-bit byte + 10 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorCreateAsset deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorCreateAsset` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorCreateAsset` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorCreateAsset` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorRebuildCaches
- AssetPath

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart, AssetEditorExportAssets (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorCreateAsset deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorCreateAsset clone()
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
public int token
public AssetPath path
public byte[] data
public AssetEditorRebuildCaches rebuildCaches
public String buttonId
