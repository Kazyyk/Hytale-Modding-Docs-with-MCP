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
