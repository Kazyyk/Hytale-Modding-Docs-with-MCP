# RootInteractionSettings

Type: class | Package: com.hypixel.hytale.protocol

public class RootInteractionSettings

Protocol data structure in the Interaction System (extends Interaction/SimpleInteraction) group.

## Fields

- boolean allowSkipChainOnClick
- InteractionCooldown cooldown

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 32,768,028

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RootInteractionSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RootInteractionSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RootInteractionSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RootInteractionSettings` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionCooldown
