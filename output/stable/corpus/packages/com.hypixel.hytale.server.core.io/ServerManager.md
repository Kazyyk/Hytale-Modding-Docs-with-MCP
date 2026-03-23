# ServerManager

Type: class | Package: com.hypixel.hytale.server.core.io | Extends: JavaPlugin

public class ServerManager extends JavaPlugin

Core plugin responsible for managing the server's network transport layer. Handles binding/unbinding listeners on TCP or QUIC transports, managing sub-packet handlers, and coordinating the server startup/shutdown lifecycle for networking. Implements the singleton pattern via `get()`.

## Static Methods


public static ServerManager get()

## Constructors


public ServerManager(@Nonnull JavaPluginInit init)

## Instance Methods


public void init()

Initializes the transport layer asynchronously based on the configured transport type (TCP or QUIC).


public boolean bind(@Nonnull InetSocketAddress address)

Binds a listener to the given address. For QUIC with wildcard addresses, binds IPv4, IPv6, and IPv6 localhost separately.


public boolean unbind(@Nonnull Channel channel)


public void unbindAllListeners()


public List<Channel> getListeners()


public InetSocketAddress getLocalOrPublicAddress()


public InetSocketAddress getNonLoopbackAddress()


public InetSocketAddress getPublicAddress()


public void waitForBindComplete()


public void registerSubPacketHandlers(@Nonnull Function<IPacketHandler, SubPacketHandler> supplier)


public void populateSubPacketHandlers(@Nonnull GamePacketHandler packetHandler)
