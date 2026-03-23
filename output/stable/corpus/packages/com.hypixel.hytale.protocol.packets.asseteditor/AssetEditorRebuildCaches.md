# AssetEditorRebuildCaches

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetEditorRebuildCaches

Configuration flags specifying which caches should be rebuilt after an asset operation.

## Fields

- boolean models
- boolean modelTextures
- boolean mapGeometry
- boolean itemIcons

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 5

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorRebuildCaches deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorRebuildCaches` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorRebuildCaches` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorRebuildCaches` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorEnableAssetPack, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize (and 51 more)

Complete API:
  public static AssetEditorRebuildCaches deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetEditorRebuildCaches clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean blockTextures
public boolean models
public boolean modelTextures
public boolean mapGeometry
public boolean itemIcons
