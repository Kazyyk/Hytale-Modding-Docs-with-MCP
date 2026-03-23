# UpdateFluidFX

Type: class | Package: com.hypixel.hytale.protocol.packets.assets | Implements: Packet, ToClientPacket

public class UpdateFluidFX implements Packet, ToClientPacket

Server-to-client packet (ID 63, compressed). Transmits FluidFX asset data to the client on the `Default` channel.

## Fields

- UpdateType type
- int maxId
- Map<Integer, FluidFX> fluidFX

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte(s) + 6 bytes of fixed fields + 1 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UpdateFluidFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateFluidFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UpdateFluidFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `UpdateFluidFX` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates the binary structure of a `UpdateFluidFX` at the given offset without deserializing.

Also in this package: TrackOrUpdateObjective, UntrackObjective, UpdateAmbienceFX, UpdateAudioCategories, UpdateBlockBreakingDecals, UpdateBlockGroups, UpdateBlockHitboxes, UpdateBlockParticleSets, UpdateBlockSets, UpdateBlockSoundSets, UpdateBlockTypes, UpdateCameraShake, UpdateEmotes, UpdateEntityEffects, UpdateEntityStatTypes, UpdateEntityUIComponents, UpdateEnvironments, UpdateEqualizerEffects, UpdateFieldcraftCategories, UpdateFluids (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateFluidFX deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateFluidFX clone()
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
public Map<Integer,FluidFX> fluidFX
