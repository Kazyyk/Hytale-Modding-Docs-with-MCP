# NettyUtil

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: java.lang.Object

public final class NettyUtil

Utility class providing static helper methods for Netty channel operations including channel closing with disconnect packets, buffer size computation, and byte array reading.

Also in this package: AuxiliaryStreamExceptionHandler, DelayedFlush, DelayedHandler, DelayedRead, DelayedWrite, ExceptionHandler, HytaleChannelInitializer, LatencySimulationHandler, PacketArrayEncoder, PlayerChannelHandler, RateLimitHandler, ReflectiveChannelFactory, TimeoutContext

Complete API:
  public static void init()
  private static void injectLogger(Channel channel)
  private static void uninjectLogger(Channel channel)
  public static void setChannelHandler(Channel channel, PacketHandler packetHandler)
  public static CompletableFuture<Void> createStream(QuicChannel conn, QuicStreamType streamType, NetworkChannel networkChannel, QuicStreamPriority priority, PacketHandler packetHandler)
  public static EventLoopGroup getEventLoopGroup(String name)
  public static EventLoopGroup getEventLoopGroup(int nThreads, String name)
  public static Class<? extends ServerChannel> getServerChannel()
  public static NettyUtil.ReflectiveChannelFactory<? extends DatagramChannel> getDatagramChannelFactory(SocketProtocolFamily family)
  public static String formatRemoteAddress(Channel channel)
  public static String formatLocalAddress(Channel channel)
  public static SocketAddress getRemoteSocketAddress(Channel channel)
  public static boolean isFromSameOrigin(Channel channel1, Channel channel2)

Fields:
public static final HytaleLogger CONNECTION_EXCEPTION_LOGGER
public static final HytaleLogger PACKET_LOGGER
public static final String PACKET_DECODER
public static final String PACKET_ARRAY_ENCODER
public static final PacketArrayEncoder PACKET_ARRAY_ENCODER_INSTANCE
public static final String PACKET_ENCODER
public static final String LOGGER_KEY
public static final LoggingHandler LOGGER
public static final String HANDLER
public static final String RATE_LIMIT
