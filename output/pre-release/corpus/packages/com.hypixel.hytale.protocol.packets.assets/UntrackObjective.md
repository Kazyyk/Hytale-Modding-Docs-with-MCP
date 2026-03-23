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

Also in this package: TrackOrUpdateObjective, UpdateAmbienceFX, UpdateAudioCategories, UpdateBlockBreakingDecals, UpdateBlockGroups, UpdateBlockHitboxes, UpdateBlockParticleSets, UpdateBlockSets, UpdateBlockSoundSets, UpdateBlockTypes, UpdateCameraShake, UpdateEmotes, UpdateEntityEffects, UpdateEntityStatTypes, UpdateEntityUIComponents, UpdateEnvironments, UpdateEqualizerEffects, UpdateFieldcraftCategories, UpdateFluidFX, UpdateFluids (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UntrackObjective deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UntrackObjective clone()
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
public UUID objectiveUuid
