# ClearEditorTimeOverride

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ClearEditorTimeOverride implements Packet, ToClientPacket

Packet sent to clients to clear the editor time override, restoring normal day/night cycle.

## Protocol Constants

- PACKET_ID | 148
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static ClearEditorTimeOverride deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, PlaySoundEventLocalPlayer, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunk, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused (and 15 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ClearEditorTimeOverride deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ClearEditorTimeOverride clone()
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
