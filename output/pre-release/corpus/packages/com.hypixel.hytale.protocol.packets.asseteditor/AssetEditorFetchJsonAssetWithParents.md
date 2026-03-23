# AssetEditorFetchJsonAssetWithParents

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorFetchJsonAssetWithParents implements Packet, ToServerPacket

Client-to-server packet (ID 311). Requests a JSON asset along with its parent assets in the inheritance chain.

## Fields

- AssetPath path
- boolean isFromOpenedTab

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 32,768,025

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorFetchJsonAssetWithParents deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorFetchJsonAssetWithParents` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorFetchJsonAssetWithParents` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorFetchJsonAssetWithParents` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorFetchJsonAssetWithParents deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorFetchJsonAssetWithParents clone()
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
public boolean isFromOpenedTab
