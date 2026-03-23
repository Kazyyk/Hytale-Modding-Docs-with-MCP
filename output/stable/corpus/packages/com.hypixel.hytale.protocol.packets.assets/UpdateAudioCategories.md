# UpdateAudioCategories

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateAudioCategories implements Packet, ToClientPacket

Server-to-client packet (ID 80, compressed). Transmits AudioCategories asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- int maxId
- Map<Integer, AudioCategory> categories

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 6 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateAudioCategories deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateAudioCategories` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateAudioCategories` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateAudioCategories` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateAudioCategories` at the given offset without deserializing.

Also in this package: TrackOrUpdateObjective, UntrackObjective, UpdateAmbienceFX, UpdateBlockBreakingDecals, UpdateBlockGroups, UpdateBlockHitboxes, UpdateBlockParticleSets, UpdateBlockSets, UpdateBlockSoundSets, UpdateBlockTypes, UpdateCameraShake, UpdateEntityEffects, UpdateEntityStatTypes, UpdateEntityUIComponents, UpdateEnvironments, UpdateEqualizerEffects, UpdateFieldcraftCategories, UpdateFluidFX, UpdateFluids, UpdateHitboxCollisionConfig (and 25 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateAudioCategories deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateAudioCategories clone()
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
public int maxId
public Map<Integer,AudioCategory> categories
