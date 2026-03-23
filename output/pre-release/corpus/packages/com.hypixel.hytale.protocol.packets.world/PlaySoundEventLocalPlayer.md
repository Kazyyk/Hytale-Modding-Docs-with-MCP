# PlaySoundEventLocalPlayer

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class PlaySoundEventLocalPlayer implements Packet, ToClientPacket

Server-to-client packet that instructs the client to play a sound event locally for the player. References sound events by both a local and world index, with configurable volume and pitch modifiers.

## Protocol Constants

- PACKET_ID | 362
- IS_COMPRESSED | false
- MAX_SIZE | 17

## Fields

- localSoundEventIndex | int | Index into the local sound event registry
- worldSoundEventIndex | int | Index into the world sound event registry
- category | SoundCategory | Sound category (default `Music`)
- volumeModifier | float | Volume multiplier
- pitchModifier | float | Pitch multiplier

## Methods


@Override
public int getId()

Returns the packet ID (`362`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static PlaySoundEventLocalPlayer deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PlaySoundEventLocalPlayer` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `SoundCategory` -- categorization for sound mixing

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused (and 15 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static PlaySoundEventLocalPlayer deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PlaySoundEventLocalPlayer clone()
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
public int localSoundEventIndex
public int worldSoundEventIndex
public SoundCategory category
public float volumeModifier
public float pitchModifier
