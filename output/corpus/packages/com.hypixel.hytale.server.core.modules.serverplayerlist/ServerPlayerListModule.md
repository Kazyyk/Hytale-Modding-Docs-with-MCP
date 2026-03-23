# ServerPlayerListModule

Type: class | Package: com.hypixel.hytale.server.core.modules.serverplayerlist | Extends: JavaPlugin

public class ServerPlayerListModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static final int PING_UPDATE_INTERVAL_SECONDS
- private static ServerPlayerListModule instance

## Methods

- @Nonnull public static ServerPlayerListModule get()
- @Override protected void setup()
- private void onPlayerConnect(PlayerConnectEvent event)
- private void onPlayerDisconnect(PlayerDisconnectEvent event)
- private void onPlayerAddedToWorld(AddPlayerToWorldEvent event)
- private void broadcastPingUpdates()
- private static int getPingValue(PacketHandler handler)
- @Nonnull private static ServerPlayerListPlayer createServerPlayerListPlayer(PlayerRef playerRef)
