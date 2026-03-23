# AssetEditorFetchAssetReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorFetchAssetReply implements Packet, ToClientPacket

Server-to-client packet (ID 312). Server reply containing the requested asset data.

## Fields

- byte`[] contents

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 4,096,010

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorFetchAssetReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorFetchAssetReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorFetchAssetReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorFetchAssetReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorFetchAsset

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorFetchAssetReply deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorFetchAssetReply clone()
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
public byte[] contents
