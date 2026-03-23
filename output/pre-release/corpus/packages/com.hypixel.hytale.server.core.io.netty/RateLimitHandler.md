# RateLimitHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

public class RateLimitHandler extends ChannelInboundHandlerAdapter

Netty handler that enforces per-connection packet rate limits. Tracks incoming packet counts within a sliding time window and disconnects clients that exceed the configured threshold. Uses `RateLimitConfig` for limit parameters.
