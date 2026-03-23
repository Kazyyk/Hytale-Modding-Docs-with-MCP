# PluginManager

Type: class | Package: com.hypixel.hytale.server.core.plugin

public class PluginManager

Central manager for all server plugins. Handles discovery, dependency resolution, load ordering, lifecycle management (setup/start/shutdown), and runtime load/unload/reload operations. Loads plugins from core registrations, classpath JARs, builtin directory, and the `mods/` directory.

## Methods

- public static PluginManager get()
- public void registerCorePlugin(@Nonnull PluginManifest builder)
- public void setup()
- public void start()
- public void shutdown()
- @Nonnull public PluginState getState()
- @Nonnull public List<PluginBase> getPlugins()
- @Nullable public PluginBase getPlugin(PluginIdentifier identifier)
- public boolean hasPlugin(PluginIdentifier identifier, @Nonnull SemverRange range)
- public boolean reload(@Nonnull PluginIdentifier identifier)
- public boolean unload(@Nonnull PluginIdentifier identifier)
- public boolean load(@Nonnull PluginIdentifier identifier)
- @Nonnull public Map<PluginIdentifier, PluginManifest> getAvailablePlugins()

## Constants

- @Nonnull public static final Path MODS_PATH

Also in this package: JavaPlugin, JavaPluginInit, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginListPageManager, PluginState, PluginType, SessionSettings

Complete API:
  public static PluginManager get()
  public void registerCorePlugin(PluginManifest builder)
  private boolean canLoadOnBoot(PendingLoadPlugin plugin)
  public void setup()
  public void start()
  private void collectFailedPlugins(StringBuilder sb)
  public void shutdown()
  public PluginState getState()
  public PluginManager.PluginBridgeClassLoader getBridgeClassLoader()
  private void validatePluginDeps(PendingLoadPlugin pendingLoadPlugin, Map<PluginIdentifier,PendingLoadPlugin> pending)
  private void loadPluginsFromDirectory(Map<PluginIdentifier,PendingLoadPlugin> pending, Path path, boolean create, Map<PluginIdentifier,PluginManifest> bootRejectMap)
  private PendingLoadJavaPlugin loadPendingJavaPlugin(Path file)
  private void loadPluginsInClasspath(Map<PluginIdentifier,PendingLoadPlugin> pending, Map<PluginIdentifier,PluginManifest> rejectedBootList)
  public List<PluginBase> getPlugins()
  public PluginBase getPlugin(PluginIdentifier identifier)
  public boolean hasPlugin(PluginIdentifier identifier, SemverRange range)
  public boolean reload(PluginIdentifier identifier)
  public boolean unload(PluginIdentifier identifier)
  protected void unloadJavaPlugin(JavaPlugin plugin)
  public boolean load(PluginIdentifier identifier)
  private boolean findAndLoadPlugin(PluginIdentifier identifier)
  private Boolean findPluginInDirectory(PluginIdentifier identifier, Path modsPath)
  private static PluginManifest loadManifest(Path file)
  private boolean load(PendingLoadPlugin pendingLoadPlugin)
  private boolean setup(PluginBase plugin)
  private boolean start(PluginBase plugin)
  private boolean dependenciesMatchState(PluginBase plugin, PluginState requiredState, PluginState stage)
  private static void loadPendingPlugin(Map<PluginIdentifier,PendingLoadPlugin> pending, PendingLoadPlugin plugin)
  public Map<PluginIdentifier,PluginManifest> getAvailablePlugins()
  public ComponentType<EntityStore,PluginListPageManager.SessionSettings> getSessionSettingsComponentType()

Fields:
private static final HytaleLogger LOGGER
public static final Path MODS_PATH
public static final MetricsRegistry<PluginManager> METRICS_REGISTRY
private static PluginManager instance
private final PluginClassLoader corePluginClassLoader
private final List<PendingLoadPlugin> corePlugins
private final PluginManager.PluginBridgeClassLoader bridgeClassLoader
private final ReentrantReadWriteLock lock
private final Map<PluginIdentifier,PluginBase> plugins
private final Map<Path,PluginClassLoader> classLoaders
private boolean hasOutdatedPlugins
private final boolean loadExternalPlugins
private PluginState state
private List<PendingLoadPlugin> loadOrder
private Map<PluginIdentifier,PluginBase> loading
private final Map<PluginIdentifier,PluginManifest> availablePlugins
public PluginListPageManager pluginListPageManager
private ComponentType<EntityStore,PluginListPageManager.SessionSettings> sessionSettingsComponentType
