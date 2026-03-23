# PacketEncoder

Type: class | Package: com.hypixel.hytale.protocol.io.netty | Extends: MessageToByteEncoder<Packet>

public class PacketEncoder extends MessageToByteEncoder<Packet>

Concrete implementation extending `MessageToByteEncoder<Packet>`.

## Methods

- encode(@Nonnull ChannelHandlerContext ctx, @Nonnull Packet packet, @Nonnull ByteBuf out) | void | protected method.

Also in this package: PacketDecoder, ProtocolUtil

Complete API:
  protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out)
