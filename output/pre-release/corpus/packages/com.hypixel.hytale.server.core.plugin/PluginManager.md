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
