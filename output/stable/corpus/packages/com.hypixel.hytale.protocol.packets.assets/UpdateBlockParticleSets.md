# UpdateBlockParticleSets

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateBlockParticleSets implements Packet, ToClientPacket

Server-to-client packet (ID 44, compressed). Transmits BlockParticleSets asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- Map<String, BlockParticleSet> blockParticleSets

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 2 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateBlockParticleSets deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateBlockParticleSets` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateBlockParticleSets` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateBlockParticleSets` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateBlockParticleSets` at the given offset without deserializing.
