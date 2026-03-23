# AudioUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class AudioUpdate extends ComponentUpdate

A component update (type ID 21) that triggers sound events on an entity. Carries an array of sound event indices to play.

## Fields

- int``[] soundEventIds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 16,384,005

Binary layout: 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AudioUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AudioUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AudioUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `AudioUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- ComponentUpdateType
- EntityUpdate
