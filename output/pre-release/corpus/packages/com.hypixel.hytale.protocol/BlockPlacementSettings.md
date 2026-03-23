# BlockPlacementSettings

Type: class | Package: com.hypixel.hytale.protocol

public class BlockPlacementSettings

Comprehensive configuration for block placement behavior including preview visibility, rotation mode, placement constraints, and override rules.

## Fields

- boolean allowRotationKey
- boolean placeInEmptyBlocks
- BlockPreviewVisibility previewVisibility
- BlockPlacementRotationMode rotationMode
- int wallPlacementOverrideBlockId
- int floorPlacementOverrideBlockId
- int ceilingPlacementOverrideBlockId
- boolean allowBreakReplace

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 17

Binary layout: 17 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockPlacementSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockPlacementSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockPlacementSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockPlacementSettings` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockPlacementRotationMode
- BlockPreviewVisibility
- BlockType
