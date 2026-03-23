# NewSpawnUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class NewSpawnUpdate extends ComponentUpdate

Empty marker component — zero-size (type ID 23).

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static NewSpawnUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `NewSpawnUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `NewSpawnUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `NewSpawnUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
