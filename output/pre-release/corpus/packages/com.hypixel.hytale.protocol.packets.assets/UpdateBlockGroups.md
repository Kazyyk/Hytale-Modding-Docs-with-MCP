# UpdateBlockGroups

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateBlockGroups implements Packet, ToClientPacket

Server-to-client packet (ID 78, compressed). Transmits BlockGroups asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- Map<String, BlockGroup> groups

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 2 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateBlockGroups deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateBlockGroups` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateBlockGroups` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateBlockGroups` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateBlockGroups` at the given offset without deserializing.

Also in this package: TrackOrUpdateObjective, UntrackObjective, UpdateAmbienceFX, UpdateAudioCategories, UpdateBlockBreakingDecals, UpdateBlockHitboxes, UpdateBlockParticleSets, UpdateBlockSets, UpdateBlockSoundSets, UpdateBlockTypes, UpdateCameraShake, UpdateEmotes, UpdateEntityEffects, UpdateEntityStatTypes, UpdateEntityUIComponents, UpdateEnvironments, UpdateEqualizerEffects, UpdateFieldcraftCategories, UpdateFluidFX, UpdateFluids (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateBlockGroups deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateBlockGroups clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public UpdateType type
public Map<String,BlockGroup> groups
