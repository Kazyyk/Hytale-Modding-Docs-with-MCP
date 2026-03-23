# PlaySoundEventEntity

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class PlaySoundEventEntity implements Packet, ToClientPacket

Packet that triggers a sound event attached to a specific entity, tracking its position.

## Protocol Constants

- PACKET_ID | 156
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public int soundEventIndex
- public int networkId
- public float volumeModifier
- public float pitchModifier

## Methods

- @Nonnull public static PlaySoundEventEntity deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused, SleepClock (and 14 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static PlaySoundEventEntity deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PlaySoundEventEntity clone()
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
public int soundEventIndex
public int networkId
public float volumeModifier
public float pitchModifier
