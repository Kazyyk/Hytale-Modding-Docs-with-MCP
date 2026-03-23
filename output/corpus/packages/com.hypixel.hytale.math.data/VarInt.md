# VarInt

Type: class | Package: com.hypixel.hytale.math.data

public final class VarInt

## Methods

- public static void writeSignedVarLong(long value, DataOutput out) throws IOException
- public static void writeUnsignedVarLong(long value, DataOutput out) throws IOException
- public static void writeSignedVarInt(int value, DataOutput out) throws IOException
- public static void writeUnsignedVarInt(int value, DataOutput out) throws IOException
- public static byte[] writeSignedVarInt(int value)
- public static byte[] writeUnsignedVarInt(int value)
- public static long readSignedVarLong(DataInput in) throws IOException
- public static long readUnsignedVarLong(DataInput in) throws IOException
- public static int readSignedVarInt(DataInput in) throws IOException
- public static int readUnsignedVarInt(DataInput in) throws IOException
- public static int readSignedVarInt(byte[] bytes)
- public static int readUnsignedVarInt(byte[] bytes)
