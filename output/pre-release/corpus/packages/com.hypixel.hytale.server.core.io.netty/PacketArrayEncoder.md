# PacketArrayEncoder

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: MessageToByteEncoder<Packet[]>

public class PacketArrayEncoder extends MessageToByteEncoder<Packet[]>

Netty encoder that serializes an array of `Packet` objects into a single `ByteBuf`. Writes each packet sequentially with its ID prefix, enabling batched packet transmission.

Also in this package: AuxiliaryStreamExceptionHandler, DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, LatencySimulationHandler, NettyUtil, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  protected void encode(ChannelHandlerContext ctx, Packet[] packets, List<Object> out)
