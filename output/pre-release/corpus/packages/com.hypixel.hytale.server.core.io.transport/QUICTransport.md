# QUICTransport

Type: class | Package: com.hypixel.hytale.server.core.io.transport | Implements: Transport

public class QUICTransport implements Transport

## Fields

- public static final AttributeKey<X509Certificate> CLIENT_CERTIFICATE_ATTR
- public static final AttributeKey<Integer> ALPN_REJECT_ERROR_CODE_ATTR
- public static final AttributeKey<String> SNI_HOSTNAME_ATTR
- private final EventLoopGroup workerGroup
- private final Bootstrap bootstrapIpv4
- private final Bootstrap bootstrapIpv6
- private final QuicSslContext sslContext

## Methods

- @Override @Nonnull public TransportType getType()
- @Override public ChannelFuture bind(@Nonnull InetSocketAddress address)
- @Override public void shutdown()
- public boolean isSharable()
- public void channelActive(@Nonnull ChannelHandlerContext ctx)
- public void userEventTriggered(ChannelHandlerContext ctx, Object evt)
- private int parseProtocolVersion(String alpn)
- public void channelInactive(@Nonnull ChannelHandlerContext ctx)
- public void exceptionCaught(@Nonnull ChannelHandlerContext ctx, Throwable cause)
- @Nullable private X509Certificate extractClientCertificate(QuicChannel channel)

## Inner Types

- `QUICTransport.QuicChannelInboundHandlerAdapter`

Also in this package: QuicChannelInboundHandlerAdapter, TCPTransport, Transport, TransportType

Complete API:
  public TransportType getType()
  public ChannelFuture bind(InetSocketAddress address)
  public void shutdown()

Fields:
private static final HytaleLogger LOGGER
public static final AttributeKey<X509Certificate> CLIENT_CERTIFICATE_ATTR
public static final AttributeKey<QuicApplicationErrorCode> ALPN_REJECT_ERROR_CODE_ATTR
public static final AttributeKey<String> SNI_HOSTNAME_ATTR
private final EventLoopGroup workerGroup
private final Bootstrap bootstrapIpv4
private final Bootstrap bootstrapIpv6
