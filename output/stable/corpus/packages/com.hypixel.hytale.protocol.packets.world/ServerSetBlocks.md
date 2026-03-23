# ServerSetBlocks

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ServerSetBlocks implements Packet, ToClientPacket

Packet that sets multiple blocks relative to an origin position. Each entry is a `SetBlockCmd` with index, block ID, filler, and rotation.

## Protocol Constants

- PACKET_ID | 141
- IS_COMPRESSED | false
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- @Nonnull public SetBlockCmd[] cmds

## Methods

- @Nonnull public static ServerSetBlocks deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
