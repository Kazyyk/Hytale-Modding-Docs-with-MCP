# UntrackObjective

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UntrackObjective implements Packet, ToClientPacket

Server-to-client packet (ID 70). Transmits Objective asset data to the client on the `Default` channel.

## Fields

- UUID objectiveUuid

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 16
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 16
- MAX_SIZE | 16

Binary layout: 16 bytes of fixed fields. No nullable fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UntrackObjective deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UntrackObjective` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UntrackObjective` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UntrackObjective` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UntrackObjective` at the given offset without deserializing.
