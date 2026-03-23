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
