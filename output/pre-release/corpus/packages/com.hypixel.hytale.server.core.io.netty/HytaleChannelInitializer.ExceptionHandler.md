# HytaleChannelInitializer.ExceptionHandler

Type: class | Package: com.hypixel.hytale.server.core.io.netty | Extends: ChannelInboundHandlerAdapter

private static class HytaleChannelInitializer.ExceptionHandler extends ChannelInboundHandlerAdapter

Handles Netty pipeline exceptions for game streams. Distinguishes read/write/connection timeouts from general errors. Sends a graceful disconnect message before closing. Uses atomic flag to prevent handling the same exception twice.

## Relationships

- Inner class of HytaleChannelInitializer
