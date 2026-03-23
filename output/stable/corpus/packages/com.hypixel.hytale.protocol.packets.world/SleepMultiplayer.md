# SleepMultiplayer

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SleepMultiplayer

Sub-structure representing multiplayer sleep state, tracking how many players are sleeping vs awake and a sample of awake player UUIDs.

## Fields

- public int sleepersCount
- public int awakeCount
- @Nullable public UUID[] awakeSample

## Methods

- @Nonnull public static SleepMultiplayer deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused (and 14 more)

Complete API:
  public static SleepMultiplayer deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SleepMultiplayer clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int sleepersCount
public int awakeCount
public UUID[] awakeSample
