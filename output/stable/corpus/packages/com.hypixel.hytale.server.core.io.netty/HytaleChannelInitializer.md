# HytaleChannelInitializer

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInitializer<Channel>

public class HytaleChannelInitializer extends ChannelInitializer<Channel>

Netty channel initializer that configures the pipeline for incoming client connections. Handles both QUIC stream channels and standard channels. Installs packet encoder/decoder, rate limiting, timeout handling, latency simulation (if configured), and the initial packet handler. Also extracts client certificates for QUIC connections.

Also in this package: DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  protected void initChannel(Channel channel)
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
  public void channelInactive(ChannelHandlerContext ctx)
