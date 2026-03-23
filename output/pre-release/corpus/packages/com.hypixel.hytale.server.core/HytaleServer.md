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

Also in this package: AuthMode, AuthModeConverter, Constants, Defaults, HytaleServerConfig, LevelValueConverter, MaybeBoolCodec, Message, Module, NameMatching, Options, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public EventBus getEventBus()
  public PluginManager getPluginManager()
  public CommandManager getCommandManager()
  public HytaleServerConfig getConfig()
  private void boot()
  public void shutdownServer()
  public void shutdownServer(ShutdownReason reason)
  void shutdown0(ShutdownReason reason)
  public void doneSetup(PluginBase plugin)
  public void doneStart(PluginBase plugin)
  public void doneStop(PluginBase plugin)
  public void sendSingleplayerProgress()
  public String getServerName()
  public boolean isBooting()
  public boolean isBooted()
  public boolean isShuttingDown()
  public Instant getBoot()
  public long getBootStart()
  public ShutdownReason getShutdownReason()
  private void sendSingleplayerSignal(String message)
  public void reportSingleplayerStatus(Message message)
  public void reportSingleplayerStatus(Message message, double progress)
  public void reportSaveProgress(World world, int saved, int total)
  public static HytaleServer get()

Fields:
public static final int DEFAULT_PORT
public static final ScheduledExecutorService SCHEDULED_EXECUTOR
public static final MetricsRegistry<HytaleServer> METRICS_REGISTRY
private static final HytaleLogger LOGGER
private static HytaleServer instance
private final Semaphore aliveLock
private final AtomicBoolean booting
private final AtomicBoolean booted
private final AtomicReference<ShutdownReason> shutdown
private final EventBus eventBus
private final PluginManager pluginManager
private final CommandManager commandManager
private final HytaleServerConfig hytaleServerConfig
private final Instant boot
private final long bootStart
private int pluginsProgress
