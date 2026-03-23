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
