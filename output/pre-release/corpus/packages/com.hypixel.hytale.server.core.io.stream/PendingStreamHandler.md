# PendingStreamHandler

Type: class | Package: com.hypixel.hytale.server.core.io.stream | Extends: ChannelInboundHandlerAdapter

public class PendingStreamHandler extends ChannelInboundHandlerAdapter

Netty handler for newly opened auxiliary QUIC streams. Expects a `StreamOpen` packet as the first message. Validates the stream type, enforces rate limits and maximum auxiliary stream count (4), creates the appropriate handler via `StreamManager`, replaces itself in the pipeline, and sends a `StreamOpenResponse`.

## Constants

- private static final int MAX_AUXILIARY_STREAMS

## Constructors

- public PendingStreamHandler(PacketHandler packetHandler)
- public PendingStreamHandler(PacketHandler packetHandler, StreamManager streamManager)

## Relationships

- Extends `ChannelInboundHandlerAdapter`
- Works with StreamManager and PacketHandler

Also in this package: StreamHandlerFactory, StreamManager, StreamRegistration

Complete API:
  public void channelRead(ChannelHandlerContext ctx, Object msg)
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
  public void channelInactive(ChannelHandlerContext ctx)

Fields:
private static final HytaleLogger LOGGER
private static final int MAX_AUXILIARY_STREAMS
private final PacketHandler packetHandler
private final StreamManager streamManager
