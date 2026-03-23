# TCPTransport

Type: class | Package: com.hypixel.hytale.server.core.io.transport | Implements: Transport

public class TCPTransport implements Transport

## Fields

- private final EventLoopGroup bossGroup
- private final EventLoopGroup workerGroup
- private final ServerBootstrap bootstrap

## Methods

- @Override @Nonnull public TransportType getType()
- @Override public ChannelFuture bind(InetSocketAddress address)
- @Override public void shutdown()
