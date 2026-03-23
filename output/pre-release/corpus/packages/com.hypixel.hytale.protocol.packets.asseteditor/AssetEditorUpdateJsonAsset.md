# AssetEditorUpdateJsonAsset

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorUpdateJsonAsset implements Packet, ToServerPacket

Client-to-server packet (ID 323). Uses Zstd compression. Sent by the client to update a JSON asset.

## Fields

- String assetType
- AssetPath path
- int assetIndex
- JsonUpdateCommand[] commands

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUpdateJsonAsset deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUpdateJsonAsset` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUpdateJsonAsset` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUpdateJsonAsset` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
- JsonUpdateCommand

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorUpdateJsonAsset deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorUpdateJsonAsset clone()
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
public String assetType
public AssetPath path
public int assetIndex
public JsonUpdateCommand[] commands
