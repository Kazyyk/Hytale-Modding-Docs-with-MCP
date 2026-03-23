# UpdateTranslations

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateTranslations implements Packet, ToClientPacket

Server-to-client packet (ID 64, compressed). Transmits Translations asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- Map<String, String> translations

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 2 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateTranslations deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateTranslations` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateTranslations` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateTranslations` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateTranslations` at the given offset without deserializing.
