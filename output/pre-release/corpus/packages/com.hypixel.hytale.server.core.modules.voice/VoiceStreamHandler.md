# VoiceStreamHandler

Type: class | Package: com.hypixel.hytale.server.core.modules.voice | Extends: SimpleChannelInboundHandler<Packet>

public class VoiceStreamHandler extends SimpleChannelInboundHandler<Packet>

Netty channel handler for the dedicated voice stream. Validates incoming voice data packets against rate limits, mute state, silence state, packet size, and routing status before dispatching to the voice executor for routing. Disables routing after 10 consecutive errors.

## Methods

- void handlerAdded(@Nonnull ChannelHandlerContext ctx)
- protected void channelRead0(@Nonnull ChannelHandlerContext ctx, @Nonnull Packet packet)
- void channelInactive(@Nonnull ChannelHandlerContext ctx)
- void exceptionCaught(@Nonnull ChannelHandlerContext ctx, @Nonnull Throwable cause)

Also in this package: ListenerCandidate, PositionSnapshot, VoiceModule, VoiceModuleConfig, VoicePacketHandler, VoicePlayerState, VoiceRouter

Complete API:
  public void handlerAdded(ChannelHandlerContext ctx)
  protected void channelRead0(ChannelHandlerContext ctx, Packet packet)
  private void handleVoiceData(PlayerRef playerRef, VoiceData data)
  private PlayerRef getPlayerRef()
  public void channelInactive(ChannelHandlerContext ctx)
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)

Fields:
private final PacketHandler packetHandler
private final VoiceModule voiceModule
private final HytaleLogger logger
private volatile PlayerRef cachedPlayerRef
private volatile boolean loggedFirstPacket
private volatile boolean loggedFirstVoiceData
