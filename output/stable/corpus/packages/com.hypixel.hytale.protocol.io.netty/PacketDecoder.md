# PacketDecoder

Type: class | Package: com.hypixel.hytale.protocol.io.netty | Extends: ByteToMessageDecoder

public class PacketDecoder extends ByteToMessageDecoder

Concrete implementation extending `ByteToMessageDecoder`.

## Fields

- LENGTH_PREFIX_SIZE | int | Static final int field.
- PACKET_ID_SIZE | int | Static final int field.
- MIN_FRAME_SIZE | int | Static final int field.
- CHECK_INTERVAL_MS | long | Static final long field.
- lastPacketTimeNanos | long | long field.
- timeoutCheckFuture | ScheduledFuture<?> | ScheduledFuture<?> field.

## Methods

- handlerAdded(@Nonnull ChannelHandlerContext ctx) | void | public method.
- channelActive(@Nonnull ChannelHandlerContext ctx) | void | public method.
- channelInactive(@Nonnull ChannelHandlerContext ctx) | void | public method.
- initialize(@Nonnull ChannelHandlerContext ctx) | void | private method.
- cancelTimeoutCheck() | void | private method.
- checkTimeout(@Nonnull ChannelHandlerContext ctx) | void | private method.
- decode(@Nonnull ChannelHandlerContext ctx, @Nonnull ByteBuf in, @Nonnull List<Object> out) | void | protected method.
