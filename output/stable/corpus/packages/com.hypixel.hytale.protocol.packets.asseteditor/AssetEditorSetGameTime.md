# AssetEditorSetGameTime

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorSetGameTime implements Packet, ToServerPacket

Client-to-server packet (ID 352). Sent by the client to set the in-game time for preview purposes.

## Fields

- InstantData gameTime
- boolean paused

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 14
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 14
- MAX_SIZE | 14

Binary layout: 1 null-bit byte + 14 bytes of fixed fields + 0 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorSetGameTime deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorSetGameTime` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorSetGameTime` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorSetGameTime` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static AssetEditorSetGameTime deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorSetGameTime clone()
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
public InstantData gameTime
public boolean paused
