# ByteBufUtil

Type: class | Package: com.hypixel.hytale.server.core.util.io

public class ByteBufUtil

Class in the io subsystem.

## Fields

- MAX_UNSIGNED_SHORT_VALUE | int | Static int field.

## Methods

- writeUTF(@Nonnull ByteBuf buf, @Nonnull String string) | void | static public method.
- readUTF(@Nonnull ByteBuf buf) | String | static public method.
- writeByteArray(@Nonnull ByteBuf buf, @Nonnull byte[] arr) | void | static public method.
- writeByteArray(@Nonnull ByteBuf buf, byte[] arr, int src, int length) | void | static public method.
- readByteArray(@Nonnull ByteBuf buf) | byte[] | static public method.
- getBytesRelease(@Nonnull ByteBuf buf) | byte[] | static public method.
- writeNumber(@Nonnull ByteBuf buf, int bytes, int value) | void | static public method.
- readNumber(@Nonnull ByteBuf buf, int bytes) | int | static public method.
- writeBitSet(@Nonnull ByteBuf buf, @Nonnull BitSet bitset) | void | static public method.
- readBitSet(@Nonnull ByteBuf buf, @Nonnull BitSet bitset) | void | static public method.
