# Transport

Type: interface | Package: com.hypixel.hytale.server.core.io.transport

public interface Transport

## Methods

- TransportType getType()
- ChannelFuture bind(InetSocketAddress var1)
- void shutdown()

Known implementors: QUICTransport, TCPTransport

Also in this package: QUICTransport, QuicChannelInboundHandlerAdapter, TCPTransport, TransportType

Complete API:
  TransportType getType()
  ChannelFuture bind(InetSocketAddress var1)
  void shutdown()
