# UpdateItems

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateItems implements Packet, ToClientPacket

Server-to-client packet (ID 54, compressed). Transmits Items asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- Map<String, ItemBase> items
- String[] removedItems
- boolean updateModels
- boolean updateIcons

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 4 bytes of fixed fields + 2 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateItems deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateItems` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateItems` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateItems` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateItems` at the given offset without deserializing.
