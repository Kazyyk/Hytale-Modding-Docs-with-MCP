# StreamManager

Type: class | Package: com.hypixel.hytale.server.core.io.stream

public class StreamManager

Singleton registry for auxiliary QUIC stream handlers. Maps `StreamType` to factory/priority pairs. Used by `PendingStreamHandler` to create the appropriate `ChannelHandler` when a client opens a new stream. The Game stream type cannot be registered here as it uses the main pipeline.

## Static Fields

- public static final QuicStreamPriority GAME_STREAM_PRIORITY
- public static final QuicStreamPriority DEFAULT_AUXILIARY_PRIORITY

## Methods

- public static StreamManager getInstance()
- public void registerHandler(StreamType type, StreamHandlerFactory factory)
- public void registerHandler(StreamType type, StreamHandlerFactory factory, QuicStreamPriority priority)
- public void unregisterHandler(StreamType type)
- public boolean isSupported(StreamType type)
- public ChannelHandler createHandler(StreamType type, PacketHandler packetHandler)
- public void clearAll()
- public QuicStreamPriority getStreamPriority(StreamType type)

## Inner Types

- StreamManager.StreamHandlerFactory | interface | Functional interface: `ChannelHandler create(PacketHandler)
- StreamManager.StreamRegistration | record | Pairs a factory with a priority

## Relationships

- Used by PendingStreamHandler
