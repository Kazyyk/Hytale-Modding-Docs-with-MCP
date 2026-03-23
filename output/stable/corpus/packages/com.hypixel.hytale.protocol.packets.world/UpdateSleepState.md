# UpdateSleepState

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UpdateSleepState implements Packet, ToClientPacket

Packet updating the sleep state including clock and multiplayer info.

## Protocol Constants

- PACKET_ID | 161
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static UpdateSleepState deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused (and 14 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateSleepState deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateSleepState clone()
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
public boolean grayFade
public boolean sleepUi
public SleepClock clock
public SleepMultiplayer multiplayer
