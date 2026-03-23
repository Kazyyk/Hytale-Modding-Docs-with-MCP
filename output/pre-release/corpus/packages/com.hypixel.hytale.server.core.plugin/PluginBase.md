# PluginBase

Type: class | Package: com.hypixel.hytale.server.core.plugin | Implements: CommandOwner

public abstract class PluginBase implements CommandOwner

Base class for all server plugins (both Java plugins and scripted addons). Provides the plugin lifecycle (`NONE` -> `SETUP` -> `START` -> `ENABLED` -> `SHUTDOWN` -> `DISABLED`), registry accessors for commands, events, entities, tasks, entity store components, chunk store components, asset codecs, and config files.

Plugins access per-plugin registries that are automatically cleaned up on shutdown. Config files registered via `withConfig()` are auto-loaded during `preLoad()` and auto-registered with the schema generator.

## Methods

- @Nonnull String getName()
- @Nonnull HytaleLogger getLogger()
- @Nonnull PluginIdentifier getIdentifier()
- @Nonnull PluginManifest getManifest()
- @Nonnull Path getDataDirectory()
- @Nonnull PluginState getState()
- @Nonnull ClientFeatureRegistry getClientFeatureRegistry()
- @Nonnull CommandRegistry getCommandRegistry()
- @Nonnull EventRegistry getEventRegistry()
- @Nonnull EntityRegistry getEntityRegistry()
- @Nonnull TaskRegistry getTaskRegistry()
- @Nonnull ComponentRegistryProxy<EntityStore> getEntityStoreRegistry()
- @Nonnull ComponentRegistryProxy<ChunkStore> getChunkStoreRegistry()
- @Nonnull AssetRegistry getAssetRegistry()
- @Nonnull <T, C extends Codec<? extends T>> CodecMapRegistry<T, C> getCodecRegistry(@Nonnull StringCodecMapCodec<T, C> mapCodec)
- @Nonnull String getBasePermission()
- boolean isDisabled()
- boolean isEnabled()
- @Nullable CompletableFuture<Void> preLoad()
- @Nonnull abstract PluginType getType()

## Lifecycle Methods (Protected)

- setup() | Called during plugin setup phase. Override to register components, commands, and event listeners.
- start() | Called after setup completes. Override for post-setup initialization.
- shutdown() | Called during plugin shutdown. Override for cleanup.

Known subclasses: JavaPlugin

Also in this package: JavaPlugin, JavaPluginInit, MissingPluginDependencyException, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginListPageManager, PluginManager, PluginState, PluginType, SessionSettings

Complete API:
  protected final Config<T> withConfig(BuilderCodec<T> configCodec)
  protected final Config<T> withConfig(String name, BuilderCodec<T> configCodec)
  public CompletableFuture<Void> preLoad()
  public String getName()
  public HytaleLogger getLogger()
  public PluginIdentifier getIdentifier()
  public PluginManifest getManifest()
  public Path getDataDirectory()
  public PluginState getState()
  public ClientFeatureRegistry getClientFeatureRegistry()
  public CommandRegistry getCommandRegistry()
  public EventRegistry getEventRegistry()
  public EntityRegistry getEntityRegistry()
  public TaskRegistry getTaskRegistry()
  public ComponentRegistryProxy<EntityStore> getEntityStoreRegistry()
  public ComponentRegistryProxy<ChunkStore> getChunkStoreRegistry()
  public AssetRegistry getAssetRegistry()
  public CodecMapRegistry<T,C> getCodecRegistry(StringCodecMapCodec<T,C> mapCodec)
  public CodecMapRegistry.Assets<T,?> getCodecRegistry(AssetCodecMapCodec<K,T> mapCodec)
  public MapKeyMapRegistry<V> getCodecRegistry(MapKeyMapCodec<V> mapCodec)
  public final String getBasePermission()
  public boolean isDisabled()
  public boolean isEnabled()
  protected void setup0()
  protected void setup()
  protected void start0()
  protected void start()
  protected void shutdown0(boolean shutdown)
  protected void shutdown()
  void cleanup(boolean shutdown)
  Throwable getFailureCause()
  void setFailureCause(Throwable t)
  public abstract PluginType getType()

Fields:
public static final MetricsRegistry<PluginBase> METRICS_REGISTRY
private final HytaleLogger logger
private final PluginIdentifier identifier
private final PluginManifest manifest
private final Path dataDirectory
private final List<Config<?>> configs
private PluginState state
private final String notEnabledString
private final CopyOnWriteArrayList<BooleanConsumer> shutdownTasks
private final ClientFeatureRegistry clientFeatureRegistry
private final CommandRegistry commandRegistry
private final EventRegistry eventRegistry
private final EntityRegistry entityRegistry
private final TaskRegistry taskRegistry
private final ComponentRegistryProxy<EntityStore> entityStoreRegistry
private final ComponentRegistryProxy<ChunkStore> chunkStoreRegistry
private final AssetRegistry assetRegistry
private final Map<Codec<?>,IRegistry> codecMapRegistries
private final String basePermission
private Throwable failureCause
