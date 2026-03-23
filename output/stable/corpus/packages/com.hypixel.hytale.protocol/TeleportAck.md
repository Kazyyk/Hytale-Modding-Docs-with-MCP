# TeleportAck

Type: class | Package: com.hypixel.hytale.protocol

public class TeleportAck

Protocol data structure in the Input Events group.

## Fields

- byte teleportId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 1

Binary layout: 1 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static TeleportAck deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `TeleportAck` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `TeleportAck` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `TeleportAck` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
