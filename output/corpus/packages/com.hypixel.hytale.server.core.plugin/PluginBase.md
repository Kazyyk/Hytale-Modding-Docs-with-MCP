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
