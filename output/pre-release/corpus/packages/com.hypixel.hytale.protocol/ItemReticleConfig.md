# ItemReticleConfig

Type: class | Package: com.hypixel.hytale.protocol

public class ItemReticleConfig

Maps a reticle ID to its base component parts.

## Fields

- String id
- String``[] base
- Map<``Integer``, `ItemReticle`> serverEvents
- Map<`ItemReticleClientEvent`, `ItemReticle`> clientEvents

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemReticleConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemReticleConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemReticleConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemReticleConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemReticle
- ItemReticleClientEvent
