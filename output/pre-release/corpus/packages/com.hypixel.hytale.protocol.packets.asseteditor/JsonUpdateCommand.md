# JsonUpdateCommand

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class JsonUpdateCommand

Describes a single JSON update operation (add, replace, remove, etc.) at a specific JSON path.

## Fields

- JsonUpdateType type
- String`[] path
- String value
- String previousValue
- String`[] firstCreatedProperty
- AssetEditorRebuildCaches rebuildCaches

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 7
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 23
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 7 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static JsonUpdateCommand deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `JsonUpdateCommand` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `JsonUpdateCommand` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `JsonUpdateCommand` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorRebuildCaches
- JsonUpdateType

Also in this package: AssetEditorActivateButton, AssetEditorAsset, AssetEditorAssetListSetup, AssetEditorAssetListUpdate, AssetEditorAssetPackSetup, AssetEditorAssetType, AssetEditorAssetUpdated, AssetEditorAuthorization, AssetEditorCapabilities, AssetEditorCreateAsset, AssetEditorCreateAssetPack, AssetEditorCreateDirectory, AssetEditorDeleteAsset, AssetEditorDeleteAssetPack, AssetEditorDeleteDirectory, AssetEditorDiscardChanges, AssetEditorEditorType, AssetEditorExportAssetFinalize, AssetEditorExportAssetInitialize, AssetEditorExportAssetPart (and 51 more)

Complete API:
  public static JsonUpdateCommand deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public JsonUpdateCommand clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public JsonUpdateType type
public String[] path
public String value
public String previousValue
public String[] firstCreatedProperty
public AssetEditorRebuildCaches rebuildCaches
