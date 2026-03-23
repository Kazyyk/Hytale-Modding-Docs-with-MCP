# SetBlockCmd

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SetBlockCmd

Sub-structure used inside `ServerSetBlocks` packets. Represents a single block set command at a chunk-relative index.

## Fields

- public short index
- public int blockId
- public short filler
- public byte rotation

## Methods

- @Nonnull public static SetBlockCmd deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
