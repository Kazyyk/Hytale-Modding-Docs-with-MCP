# HytaleChannelInitializer.ExceptionHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

private static class HytaleChannelInitializer.ExceptionHandler extends ChannelInboundHandlerAdapter

Handles Netty pipeline exceptions for game streams. Distinguishes read/write/connection timeouts from general errors. Sends a graceful disconnect message before closing. Uses atomic flag to prevent handling the same exception twice.

## Relationships

- Inner class of HytaleChannelInitializer

Also in this package: AuxiliaryStreamExceptionHandler, DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, HytaleChannelInitializer, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
  private void handleTimeout(ChannelHandlerContext ctx, Throwable cause, String identifier)
  private void gracefulDisconnect(ChannelHandlerContext ctx, String identifier, FormattedMessage reason)

Fields:
private static final HytaleLogger LOGGER
private static final Message MESSAGE_DISCONNECT_TIMEOUT_READ
private static final Message MESSAGE_DISCONNECT_TIMEOUT_WRITE
private static final Message MESSAGE_DISCONNECT_TIMEOUT_CONNECTION
private final AtomicBoolean handled
