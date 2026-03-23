# SetChunk

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SetChunk implements Packet, ToClientPacket

Packet delivering a full chunk section to the client, including block data and light maps. Compressed on the wire.

## Protocol Constants

- PACKET_ID | 131
- IS_COMPRESSED | true
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- @Nullable public byte[] localLight
- @Nullable public byte[] globalLight
- @Nullable public byte[] data

## Methods

- @Nonnull public static SetChunk deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Also in this package: ClearEditorTimeOverride, PaletteType, PlaySoundEvent2D, PlaySoundEvent3D, PlaySoundEventEntity, PlaySoundEventLocalPlayer, RotationAxis, RotationDirection, ServerSetBlock, ServerSetBlocks, ServerSetFluid, ServerSetFluids, ServerSetPaused, SetBlockCmd, SetChunkEnvironments, SetChunkHeightmap, SetChunkTintmap, SetFluidCmd, SetFluids, SetPaused (and 15 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static SetChunk deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SetChunk clone()
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
public int x
public int y
public int z
public byte[] localLight
public byte[] globalLight
public byte[] data
