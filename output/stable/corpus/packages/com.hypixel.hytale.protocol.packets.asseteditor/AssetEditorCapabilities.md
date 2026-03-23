# AssetEditorCapabilities

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorCapabilities implements Packet, ToClientPacket

Server-to-client packet (ID 304). Sends the set of asset editor capabilities (permissions) to the client.

## Fields

- boolean canEditAssets
- boolean canCreateAssetPacks
- boolean canEditAssetPacks
- boolean canDeleteAssetPacks

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 5

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorCapabilities deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorCapabilities` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorCapabilities` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorCapabilities` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorCapabilities deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorCapabilities clone()
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
public boolean canDiscardAssets
public boolean canEditAssets
public boolean canCreateAssetPacks
public boolean canEditAssetPacks
public boolean canDeleteAssetPacks
