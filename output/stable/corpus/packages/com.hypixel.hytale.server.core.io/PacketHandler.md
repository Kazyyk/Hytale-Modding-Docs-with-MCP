# PacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io | Implements: IPacketReceiver

public abstract class PacketHandler implements IPacketReceiver

Abstract base class for server-side network connection handlers. Manages the Netty channel lifecycle, packet write/flush queuing, ping/pong measurement, connection timeouts, login stage progression, and disconnect logic. Each connected client has a `PacketHandler` instance that tracks its authentication state, protocol version, and multiple network channels (default, chunks, world map).

## Constants


public static final int MAX_PACKET_ID = 512


public static final Map<NetworkChannel, QuicStreamPriority> DEFAULT_STREAM_PRIORITIES

Default QUIC stream priorities for the three network channels.

## Constructors


public PacketHandler(@Nonnull Channel channel, @Nonnull ProtocolVersion protocolVersion)

## Abstract Methods


public abstract String getIdentifier()


public abstract void accept(@Nonnull ToServerPacket var1)

## Instance Methods


public Channel getChannel()


public ProtocolVersion getProtocolVersion()


public final void registered(@Nullable PacketHandler oldHandler)


public final void unregistered(@Nullable PacketHandler newHandler)


public void handle(@Nonnull ToServerPacket packet)

Delegates to `accept(ToServerPacket)`.


public void write(@Nonnull ToClientPacket... packets)

Writes one or more packets on the same network channel. All packets must share the same channel. Supports queued or immediate flush modes.


public void write(@Nonnull ToClientPacket[] packets, @Nonnull ToClientPacket finalPacket)


public void write(@Nonnull ToClientPacket packet)


public void writeNoCache(@Nonnull ToClientPacket packet)


public void writePacket(@Nonnull ToClientPacket packet, boolean cache)


public void disconnect(@Nonnull String message)

Logs the disconnect reason and sends a `Disconnect` packet to the client.


public PacketStatsRecorder getPacketStatsRecorder()


public PingInfo getPingInfo(@Nonnull PongType pongType)


public long getOperationTimeoutThreshold()

Returns timeout threshold in milliseconds based on 2x average tick ping plus 3000ms.


public void tickPing(float dt)


public void sendPing()


public void handlePong(@Nonnull Pong packet)


public void setQueuePackets(boolean queuePackets)


public void tryFlush()


public PlayerAuthentication getAuth()


public boolean stillActive()


public int getQueuedPacketsCount()


public boolean isLocalConnection()


public boolean isLANConnection()


public String getSniHostname()


public DisconnectReason getDisconnectReason()


public void setClientReadyForChunksFuture(@Nonnull CompletableFuture<Void> clientReadyFuture)


public CompletableFuture<Void> getClientReadyForChunksFuture()


public Channel getChannel(@Nonnull NetworkChannel networkChannel)


public void setChannel(@Nonnull NetworkChannel networkChannel, @Nonnull Channel channel)

## Static Methods


public static void logConnectionTimings(@Nonnull Channel channel, @Nonnull String message, @Nonnull Level level)

## Inner Classes

### DisconnectReason


public static class DisconnectReason

Tracks the reason for disconnection, either server-initiated (string message) or client-initiated (`DisconnectType`). Setting one clears the other.

### PingInfo


public static class PingInfo

Tracks per-connection ping metrics for a given `PongType` (Raw, Direct, Tick). Maintains a thread-safe queue of sent ping IDs and timestamps, computing round-trip latency via `HistoricMetric` across 1-second, 1-minute, and 5-minute windows.

Known subclasses: GenericConnectionPacketHandler, GenericPacketHandler, InitialPacketHandler

Also in this package: DisconnectReason, NetworkSerializable, NetworkSerializer, NetworkSerializers, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Complete API:
  public Channel getChannel()
  public void setCompressionEnabled(boolean compressionEnabled)
  public boolean isCompressionEnabled()
  public abstract String getIdentifier()
  public ProtocolVersion getProtocolVersion()
  public final void registered(PacketHandler oldHandler)
  protected void registered0(PacketHandler oldHandler)
  public final void unregistered(PacketHandler newHandler)
  protected void unregistered0(PacketHandler newHandler)
  public void handle(ToServerPacket packet)
  public abstract void accept(ToServerPacket var1)
  public void logCloseMessage()
  public void closed(ChannelHandlerContext ctx)
  public void setQueuePackets(boolean queuePackets)
  public void tryFlush()
  public void write(ToClientPacket packets)
  public void write(ToClientPacket[] packets, ToClientPacket finalPacket)
  public void write(ToClientPacket packet)
  public void writeNoCache(ToClientPacket packet)
  public void writePacket(ToClientPacket packet, boolean cache)
  private void handleOutboundAndCachePackets(ToClientPacket[] packets, ToClientPacket[] cachedPackets)
  private ToClientPacket handleOutboundAndCachePacket(ToClientPacket packet)
  public void disconnect(String message)
  protected void disconnect0(String message)
  public PacketStatsRecorder getPacketStatsRecorder()
  public PacketHandler.PingInfo getPingInfo(PongType pongType)
  public long getOperationTimeoutThreshold()
  public void tickPing(float dt)
  public void sendPing()
  public void handlePong(Pong packet)
  protected void initStage(String stage, Duration timeout, BooleanSupplier condition)
  protected void enterStage(String stage, Duration timeout, BooleanSupplier condition)
  protected void enterStage(String stage, Duration timeout)
  protected void continueStage(String stage, Duration timeout, BooleanSupplier condition)
  private void setStageTimeout(String stageId, Duration timeout, BooleanSupplier meets)
  private void updatePacketTimeout(Duration timeout)
  protected void clearTimeout()
  public PlayerAuthentication getAuth()
  public boolean stillActive()
  public int getQueuedPacketsCount()
  public boolean isLocalConnection()
  public boolean isLANConnection()
  public String getSniHostname()
  public PacketHandler.DisconnectReason getDisconnectReason()
  public void setClientReadyForChunksFuture(CompletableFuture<Void> clientReadyFuture)
  public CompletableFuture<Void> getClientReadyForChunksFuture()
  public Channel getChannel(NetworkChannel networkChannel)
  public void setChannel(NetworkChannel networkChannel, Channel channel)
  public static void logConnectionTimings(Channel channel, String message, Level level)

Fields:
public static final int MAX_PACKET_ID
public static final Map<NetworkChannel,QuicStreamPriority> DEFAULT_STREAM_PRIORITIES
private static final HytaleLogger LOGIN_TIMING_LOGGER
private static final AttributeKey<Long> LOGIN_START_ATTRIBUTE_KEY
protected final Channel[] channels
protected final ProtocolVersion protocolVersion
protected PlayerAuthentication auth
protected boolean queuePackets
protected final AtomicInteger queuedPackets
protected final SecureRandom pingIdRandom
protected final PacketHandler.PingInfo[] pingInfo
private float pingTimer
protected boolean registered
private ScheduledFuture<?> timeoutTask
protected Throwable clientReadyForChunksFutureStack
protected CompletableFuture<Void> clientReadyForChunksFuture
protected final PacketHandler.DisconnectReason disconnectReason
