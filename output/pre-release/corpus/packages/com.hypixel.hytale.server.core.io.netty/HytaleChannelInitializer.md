# HytaleChannelInitializer

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInitializer<Channel>

public class HytaleChannelInitializer extends ChannelInitializer<Channel>

Netty channel initializer for the Hytale server. Sets up the packet encode/decode pipeline, rate limiting, logging, and initial packet handler for new connections. For QUIC streams, handles ALPN rejection, client certificate propagation, and auxiliary stream initialization. Stores the game packet handler on the QUIC parent channel for auxiliary stream association.

## Static Fields

- public static final AttributeKey<PacketHandler> GAME_PACKET_HANDLER_ATTR

## Inner Classes

- HytaleChannelInitializer.ExceptionHandler | Handles pipeline exceptions with graceful disconnect
- HytaleChannelInitializer.AuxiliaryStreamExceptionHandler | Handles exceptions on auxiliary QUIC streams

## Relationships

- Extends `ChannelInitializer<Channel>`
- Creates `InitialPacketHandler` and `PlayerChannelHandler`
- Delegates auxiliary streams to `PendingStreamHandler`

Also in this package: AuxiliaryStreamExceptionHandler, DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, LatencySimulationHandler, NettyUtil, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  protected void initChannel(Channel channel)
  private void initAuxiliaryStream(Channel channel, PacketHandler packetHandler)
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
  public void channelInactive(ChannelHandlerContext ctx)

Fields:
public static final AttributeKey<PacketHandler> GAME_PACKET_HANDLER_ATTR
