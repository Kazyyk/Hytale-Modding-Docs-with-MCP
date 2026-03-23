# SleepClock

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SleepClock

Sub-structure representing sleep clock state, including start/target game times, progress, and duration.

## Fields

- @Nullable public InstantData startGametime
- @Nullable public InstantData targetGametime
- public float progress
- public float durationSeconds

## Methods

- @Nonnull public static SleepClock deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, PlaySoundEventLocalPlayer, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids (and 15 more)

Complete API:
  public static SleepClock deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SleepClock clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public InstantData startGametime
public InstantData targetGametime
public float progress
public float durationSeconds
