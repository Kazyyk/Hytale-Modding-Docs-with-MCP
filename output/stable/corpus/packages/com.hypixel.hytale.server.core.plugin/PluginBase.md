# PluginBase

Type: class | Package: com.hypixel.hytale.server.core.plugin | Implements: CommandOwner

public abstract class PluginBase implements CommandOwner

Abstract base class for all server plugins. Provides lifecycle management (setup, start, shutdown), and registries for commands, events, entities, ECS components/resources, assets, codecs, block states, and tasks. Each plugin has an identifier, manifest, logger, data directory, and state machine.

## Lifecycle

The plugin progresses through states: `NONE` -> `SETUP` -> `START` -> `ENABLED` -> `SHUTDOWN` -> `DISABLED`. On error, transitions to `FAILED`.

## Methods

- @Nonnull public String getName()
- @Nonnull public HytaleLogger getLogger()
- @Nonnull public PluginIdentifier getIdentifier()
- @Nonnull public PluginManifest getManifest()
- @Nonnull public Path getDataDirectory()
- @Nonnull public PluginState getState()
- @Nonnull public ClientFeatureRegistry getClientFeatureRegistry()
- @Nonnull public CommandRegistry getCommandRegistry()
- @Nonnull public EventRegistry getEventRegistry()
- @Nonnull public BlockStateRegistry getBlockStateRegistry()
- @Nonnull public EntityRegistry getEntityRegistry()
- @Nonnull public TaskRegistry getTaskRegistry()
- @Nonnull public ComponentRegistryProxy<EntityStore> getEntityStoreRegistry()
- @Nonnull public ComponentRegistryProxy<ChunkStore> getChunkStoreRegistry()
- @Nonnull public AssetRegistry getAssetRegistry()
- public boolean isDisabled()
- public boolean isEnabled()
- @Nonnull public abstract PluginType getType()
- @Nullable public CompletableFuture<Void> preLoad()
- @Nonnull protected final <T> Config<T> withConfig(@Nonnull BuilderCodec<T> configCodec)
- @Nonnull protected final <T> Config<T> withConfig(@Nonnull String name, @Nonnull BuilderCodec<T> configCodec)

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
  public BlockStateRegistry getBlockStateRegistry()
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
private final BlockStateRegistry blockStateRegistry
private final EntityRegistry entityRegistry
private final TaskRegistry taskRegistry
private final ComponentRegistryProxy<EntityStore> entityStoreRegistry
private final ComponentRegistryProxy<ChunkStore> chunkStoreRegistry
private final AssetRegistry assetRegistry
private final Map<Codec<?>,IRegistry> codecMapRegistries
private final String basePermission
private Throwable failureCause
