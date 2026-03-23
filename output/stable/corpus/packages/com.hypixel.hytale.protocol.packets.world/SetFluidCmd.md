# SetFluidCmd

Type: class | Package: com.hypixel.hytale.protocol.packets.world

public class SetFluidCmd

Sub-structure used inside `ServerSetFluids` packets. Represents a single fluid set command at a chunk-relative index.

## Fields

- public short index
- public int fluidId
- public byte fluidLevel

## Methods

- @Nonnull public static SetFluidCmd deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
