# PacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io | Implements: IPacketReceiver

public abstract class PacketHandler implements IPacketReceiver

Abstract base class for all server-side network packet handlers. Manages Netty channel lifecycle, packet writing (queued and immediate), ping/pong measurement, connection stage timeouts, disconnect handling, auxiliary QUIC stream management, and protocol version tracking. Extended by `InitialPacketHandler`, `GamePacketHandler`, and authentication handlers.

## Constants

- public static final int MAX_PACKET_ID
- public static final Map<NetworkChannel, QuicStreamPriority> DEFAULT_STREAM_PRIORITIES

## Key Methods

- public Channel getChannel()
- public Channel getChannel(StreamType type)
- public abstract String getIdentifier()
- public ProtocolVersion getProtocolVersion()
- public void write(ToClientPacket packet)
- public void write(ToClientPacket... packets)
- public void writeNoCache(ToClientPacket packet)
- public void disconnect(Message message)
- public void disconnect(FormattedMessage message)
- public abstract void accept(ToServerPacket packet)
- public void tickPing(float dt)
- public void sendPing()
- public void handlePong(Pong packet)
- public PingInfo getPingInfo(PongType pongType)
- public long getOperationTimeoutThreshold()
- public boolean stillActive()
- public boolean isLocalConnection()
- public boolean isLANConnection()
- public String getSniHostname()
- public void setChannel(StreamType type, Channel channel)
- public boolean checkStreamOpenRateLimit()
- public DisconnectReason getDisconnectReason()
- public PlayerAuthentication getAuth()
- public void setQueuePackets(boolean queuePackets)
- public void tryFlush()

## Inner Classes

- PacketHandler.DisconnectReason | Tracks server or client disconnect reason
- PacketHandler.PingInfo | Per-pong-type ping measurement with metric history

## Relationships

- Implements `IPacketReceiver`
- Extended by `GamePacketHandler`, `InitialPacketHandler`, authentication handlers

Known subclasses: GenericConnectionPacketHandler, GenericPacketHandler, InitialPacketHandler

Also in this package: DisconnectReason, NetworkSerializable, NetworkSerializer, NetworkSerializers, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Complete API:
  public Channel getChannel()
  public Channel getChannel(StreamType type)
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
  public void disconnect(Message message)
  public void disconnect(FormattedMessage message)
  protected void disconnect0(FormattedMessage message)
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
  public boolean checkStreamOpenRateLimit()
  public PacketHandler.DisconnectReason getDisconnectReason()
  public void setClientReadyForChunksFuture(CompletableFuture<Void> clientReadyFuture)
  public CompletableFuture<Void> getClientReadyForChunksFuture()
  public Channel getChannel(NetworkChannel networkChannel)
  public void setChannel(NetworkChannel networkChannel, Channel channel)
  public void setChannel(StreamType type, Channel channel)
  public boolean compareAndSetChannel(StreamType type, Channel expected, Channel newValue)
  public int getAuxiliaryChannelCount()
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
private final Map<StreamType,Channel> auxiliaryChannels
private final AtomicLong lastStreamOpenTimeNanos
private static final long STREAM_OPEN_MIN_INTERVAL_NANOS
