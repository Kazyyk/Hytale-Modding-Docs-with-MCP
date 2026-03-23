# HytaleServer

Type: class | Package: com.hypixel.hytale.server.core

public class HytaleServer

The main server class and entry point for the Hytale dedicated server. Manages the complete server lifecycle: initialization, plugin setup, asset loading and validation, boot sequence, shutdown, and singleplayer progress reporting. Holds references to the `EventBus`, `PluginManager`, `CommandManager`, and `HytaleServerConfig`.

## Constants

- public static final int DEFAULT_PORT

## Key Methods

- public static HytaleServer get()
- @Nonnull public EventBus getEventBus()
- @Nonnull public PluginManager getPluginManager()
- @Nonnull public CommandManager getCommandManager()
- @Nonnull public HytaleServerConfig getConfig()
- public String getServerName()
- public boolean isBooting()
- public boolean isBooted()
- public boolean isShuttingDown()
- @Nonnull public Instant getBoot()
- public long getBootStart()
- @Nullable public ShutdownReason getShutdownReason()
- public void shutdownServer()
- public void shutdownServer(@Nonnull ShutdownReason reason)
- public void doneSetup(PluginBase plugin)
- public void doneStart(PluginBase plugin)
- public void doneStop(PluginBase plugin)
- public void reportSaveProgress(@Nonnull World world, int saved, int total)
