# PlayerChannelHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

public class PlayerChannelHandler extends ChannelInboundHandlerAdapter

Per-player Netty channel handler that dispatches decoded packets to the player's packet handler. Manages the player's connection lifecycle, handles disconnection cleanup, and tracks the player's network channel state.
