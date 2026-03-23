# LatencySimulationHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelDuplexHandler

public class LatencySimulationHandler extends ChannelDuplexHandler

Netty handler that artificially delays inbound and outbound packets to simulate network latency. Used for development and testing. Configurable delay is applied by scheduling messages on the event loop.

Also in this package: AuxiliaryStreamExceptionHandler, DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  public void read(ChannelHandlerContext ctx)
  public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise)
  public void flush(ChannelHandlerContext ctx)
  public void handlerRemoved(ChannelHandlerContext ctx)
  public void close(ChannelHandlerContext ctx, ChannelPromise promise)
  public static void setLatency(Channel channel, long delay, TimeUnit unit)

Fields:
public static final String PIPELINE_KEY
private static final AtomicInteger counter
private final DelayQueue<LatencySimulationHandler.DelayedHandler> delayedQueue
private final Thread taskThread
private final long delayNanos
