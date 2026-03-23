# HalfFloatPosition

Type: class | Package: com.hypixel.hytale.protocol

public class HalfFloatPosition

Compact 3D position using 16-bit half-float precision for bandwidth-efficient transmission.

## Fields

- short x
- short y
- short z

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 6

Binary layout: 6 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HalfFloatPosition deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HalfFloatPosition` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HalfFloatPosition` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HalfFloatPosition` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
