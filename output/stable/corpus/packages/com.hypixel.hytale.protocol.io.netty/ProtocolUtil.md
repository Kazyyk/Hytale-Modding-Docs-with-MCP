# ProtocolUtil

Type: class | Package: com.hypixel.hytale.protocol.io.netty

public final class ProtocolUtil

Class in the netty subsystem.

## Fields

- APPLICATION_NO_ERROR | int | Static final int field.
- APPLICATION_RATE_LIMITED | int | Static final int field.
- APPLICATION_AUTH_FAILED | int | Static final int field.
- APPLICATION_INVALID_VERSION | int | Static final int field.
- APPLICATION_TIMEOUT | int | Static final int field.
- APPLICATION_CLIENT_OUTDATED | int | Static final int field.
- APPLICATION_SERVER_OUTDATED | int | Static final int field.
- CLOSE_ON_COMPLETE | ChannelFutureListener | Static final ChannelFutureListener field.

## Constructors

- ProtocolUtil() | Creates a new ProtocolUtil instance.

## Methods

- closeConnection(@Nonnull Channel channel) | void | static public method.
- closeConnection(@Nonnull Channel channel, @Nonnull QuicTransportError error) | void | static public method.
- closeApplicationConnection(@Nonnull Channel channel) | void | static public method.
- closeApplicationConnection(@Nonnull Channel channel, int errorCode) | void | static public method.
- closeApplicationConnection(@Nonnull Channel channel, int errorCode, @Nonnull String reason) | void | static public method.
- closeApplicationOnComplete(ChannelFuture future) | void | static private method.

Also in this package: PacketDecoder, PacketEncoder

Complete API:
  public static void closeConnection(Channel channel)
  public static void closeConnection(Channel channel, QuicTransportError error)
  public static void closeApplicationConnection(Channel channel)
  public static void closeApplicationConnection(Channel channel, int errorCode)
  public static void closeApplicationConnection(Channel channel, int errorCode, String reason)
  private static void closeApplicationOnComplete(ChannelFuture future)

Fields:
public static final AttributeKey<NetworkChannel> STREAM_CHANNEL_KEY
public static final AttributeKey<Duration> PACKET_TIMEOUT_KEY
public static final int APPLICATION_NO_ERROR
public static final int APPLICATION_RATE_LIMITED
public static final int APPLICATION_AUTH_FAILED
public static final int APPLICATION_INVALID_VERSION
public static final int APPLICATION_TIMEOUT
public static final int APPLICATION_CLIENT_OUTDATED
public static final int APPLICATION_SERVER_OUTDATED
public static final ChannelFutureListener CLOSE_ON_COMPLETE
