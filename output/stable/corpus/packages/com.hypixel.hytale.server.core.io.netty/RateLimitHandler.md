# RateLimitHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

public class RateLimitHandler extends ChannelInboundHandlerAdapter

Netty handler that enforces per-connection packet rate limits. Tracks incoming packet counts within a sliding time window and disconnects clients that exceed the configured threshold. Uses `RateLimitConfig` for limit parameters.

Also in this package: DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  private void refillTokens()
  public void channelRead(ChannelHandlerContext ctx, Object msg)

Fields:
private static final HytaleLogger LOGGER
private final int maxTokens
private final int refillRate
private int tokens
private long lastRefillTime
