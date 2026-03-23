# PlayerChannelHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

public class PlayerChannelHandler extends ChannelInboundHandlerAdapter

Per-player Netty channel handler that dispatches decoded packets to the player's packet handler. Manages the player's connection lifecycle, handles disconnection cleanup, and tracks the player's network channel state.

Also in this package: DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  public PacketHandler getHandler()
  public void channelInactive(ChannelHandlerContext ctx)
  public void channelRead(ChannelHandlerContext ctx, Object msg)

Fields:
private final PacketHandler handler
