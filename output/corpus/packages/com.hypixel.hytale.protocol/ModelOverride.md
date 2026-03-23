# ModelOverride

Type: class | Package: com.hypixel.hytale.protocol

public class ModelOverride

Protocol data structure in the Model/Rendering group.

## Fields

- String model
- String texture
- Map<``String``, `AnimationSet`> animationSets

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelOverride deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelOverride` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelOverride` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelOverride` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AnimationSet
