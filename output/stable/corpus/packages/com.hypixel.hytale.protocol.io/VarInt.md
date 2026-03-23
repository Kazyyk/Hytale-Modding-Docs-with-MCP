# VarInt

Type: class | Package: com.hypixel.hytale.protocol.io

public final class VarInt

Utility class for reading and writing variable-length integers (VarInt encoding) to Netty `ByteBuf` buffers. Supports values up to 5 bytes.

## Methods

- public static void write(ByteBuf buf, int value)
- public static int read(ByteBuf buf)
- public static int peek(ByteBuf buf, int index)
- public static int length(ByteBuf buf, int index)
- public static int size(int value)
