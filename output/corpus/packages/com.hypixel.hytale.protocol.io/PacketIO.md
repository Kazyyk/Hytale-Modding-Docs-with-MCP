# PacketIO

Type: class | Package: com.hypixel.hytale.protocol.io

public final class PacketIO

Utility class for low-level packet serialization and deserialization. Provides methods for reading/writing primitives, strings, UUIDs, and half-precision floats to Netty `ByteBuf` buffers. Handles Zstd compression/decompression of packet payloads.

## Fields

- public static final | int | FRAME_HEADER_SIZE | Frame header size in bytes (4)
- public static final | Charset | UTF8 | UTF-8 charset
- public static final | Charset | ASCII | US-ASCII charset

## Methods

- public static float readHalfLE(ByteBuf buf, int index)
- public static void writeHalfLE(ByteBuf buf, float value)
- public static byte[] readBytes(ByteBuf buf, int offset, int length)
- public static byte[] readByteArray(ByteBuf buf, int offset, int length)
- public static short[] readShortArrayLE(ByteBuf buf, int offset, int length)
- public static float[] readFloatArrayLE(ByteBuf buf, int offset, int length)
- public static String readFixedAsciiString(ByteBuf buf, int offset, int length)
- public static String readFixedString(ByteBuf buf, int offset, int length)
- public static String readVarString(ByteBuf buf, int offset)
- public static String readVarAsciiString(ByteBuf buf, int offset)
- public static String readVarString(ByteBuf buf, int offset, Charset charset)
- public static int utf8ByteLength(String s)
- public static int stringSize(String s)
- public static void writeFixedBytes(ByteBuf buf, byte[] data, int length)
- public static void writeFixedAsciiString(ByteBuf buf, String value, int length)
- public static void writeFixedString(ByteBuf buf, String value, int length)
- public static void writeVarString(ByteBuf buf, String value, int maxLength)
- public static void writeVarAsciiString(ByteBuf buf, String value, int maxLength)
- public static UUID readUUID(ByteBuf buf, int offset)
- public static void writeUUID(ByteBuf buf, UUID value)
- public static void writeFramedPacket(Packet packet, Class<? extends Packet> packetClass, ByteBuf out, PacketStatsRecorder statsRecorder)
- public static Packet readFramedPacket(ByteBuf in, int payloadLength, PacketStatsRecorder statsRecorder)
