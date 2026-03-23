# UpdateUnarmedInteractions

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateUnarmedInteractions implements Packet, ToClientPacket

Server-to-client packet (ID 68, compressed). Transmits UnarmedInteractions asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- Map<InteractionType, Integer> interactions

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 20,480,007

Binary layout: 1 null-bit byte(s) + 2 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateUnarmedInteractions deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateUnarmedInteractions` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateUnarmedInteractions` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateUnarmedInteractions` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateUnarmedInteractions` at the given offset without deserializing.

Also in this package: TrackOrUpdateObjective, UntrackObjective, UpdateAmbienceFX, UpdateAudioCategories, UpdateBlockBreakingDecals, UpdateBlockGroups, UpdateBlockHitboxes, UpdateBlockParticleSets, UpdateBlockSets, UpdateBlockSoundSets, UpdateBlockTypes, UpdateCameraShake, UpdateEmotes, UpdateEntityEffects, UpdateEntityStatTypes, UpdateEntityUIComponents, UpdateEnvironments, UpdateEqualizerEffects, UpdateFieldcraftCategories, UpdateFluidFX (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateUnarmedInteractions deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateUnarmedInteractions clone()
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
public Map<InteractionType,Integer> interactions
