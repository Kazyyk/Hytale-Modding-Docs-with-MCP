# HytaleChannelInitializer.AuxiliaryStreamExceptionHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

private static class HytaleChannelInitializer.AuxiliaryStreamExceptionHandler extends ChannelInboundHandlerAdapter

Handles exceptions on auxiliary QUIC streams. Logs warnings and closes the stream. Ignores `ClosedChannelException`.

## Relationships

- Inner class of HytaleChannelInitializer

Also in this package: DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)

Fields:
private static final HytaleLogger LOGGER
private final String identifier
