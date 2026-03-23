# LatencySimulationHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelDuplexHandler

public class LatencySimulationHandler extends ChannelDuplexHandler

Netty handler that artificially delays inbound and outbound packets to simulate network latency. Used for development and testing. Configurable delay is applied by scheduling messages on the event loop.
