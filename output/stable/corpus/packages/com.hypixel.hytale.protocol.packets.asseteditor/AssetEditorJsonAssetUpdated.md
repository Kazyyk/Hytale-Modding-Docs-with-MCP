# AssetEditorJsonAssetUpdated

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorJsonAssetUpdated implements Packet, ToClientPacket

Server-to-client packet (ID 325). Notifies the client that a JSON asset has been updated.

## Fields

- AssetPath path
- JsonUpdateCommand[] commands

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorJsonAssetUpdated deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorJsonAssetUpdated` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorJsonAssetUpdated` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorJsonAssetUpdated` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
- JsonUpdateCommand

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorJsonAssetUpdated deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorJsonAssetUpdated clone()
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
public AssetPath path
public JsonUpdateCommand[] commands
