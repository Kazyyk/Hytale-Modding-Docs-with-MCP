# UpdateBlockSoundSets

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateBlockSoundSets implements Packet, ToClientPacket

Server-to-client packet (ID 42, compressed). Transmits BlockSoundSets asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- int maxId
- Map<Integer, BlockSoundSet> blockSoundSets

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 6 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateBlockSoundSets deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateBlockSoundSets` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateBlockSoundSets` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateBlockSoundSets` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateBlockSoundSets` at the given offset without deserializing.
