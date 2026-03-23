# AssetEditorAssetType

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetEditorAssetType

Defines an asset type with its identifier, icon, file path pattern, extension, and editor type.

## Fields

- String id
- String icon
- boolean isColoredIcon
- String path
- String fileExtension
- AssetEditorEditorType editorType

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 3
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 19
- MAX_SIZE | 65,536,039

Binary layout: 1 null-bit byte + 3 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorAssetType deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorAssetType` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorAssetType` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorAssetType` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorAsset
- AssetEditorEditorType

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart, AssetEditorExportAssets (and 51 more)

Complete API:
  public static AssetEditorAssetType deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorAssetType clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public String icon
public boolean isColoredIcon
public String path
public String fileExtension
public AssetEditorEditorType editorType
