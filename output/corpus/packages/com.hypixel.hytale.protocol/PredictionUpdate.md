# PredictionUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class PredictionUpdate extends ComponentUpdate

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 20).

## Fields

- UUID predictionId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 16
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 16
- MAX_SIZE | 16

Binary layout: 16 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static PredictionUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PredictionUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `PredictionUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `PredictionUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
