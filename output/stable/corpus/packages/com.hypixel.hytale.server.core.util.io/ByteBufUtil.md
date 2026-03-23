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

Also in this package: BlockingDiskFile, FileUtil

Complete API:
  public static void writeUTF(ByteBuf buf, String string)
  public static String readUTF(ByteBuf buf)
  public static void writeByteArray(ByteBuf buf, byte[] arr)
  public static void writeByteArray(ByteBuf buf, byte[] arr, int src, int length)
  public static byte[] readByteArray(ByteBuf buf)
  public static byte[] getBytesRelease(ByteBuf buf)
  public static void writeNumber(ByteBuf buf, int bytes, int value)
  public static int readNumber(ByteBuf buf, int bytes)
  public static void writeBitSet(ByteBuf buf, BitSet bitset)
  public static void readBitSet(ByteBuf buf, BitSet bitset)

Fields:
private static int MAX_UNSIGNED_SHORT_VALUE
