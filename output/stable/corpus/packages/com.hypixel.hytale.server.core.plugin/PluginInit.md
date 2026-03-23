# PluginInit

Type: class | Package: com.hypixel.hytale.server.core.plugin

public class PluginInit

Initialization data for creating a `PluginBase` instance. Contains the plugin manifest and data directory.

## Constructors

- PluginInit(@Nonnull PluginManifest pluginManifest, @Nonnull Path dataDirectory)

## Methods

- @Nonnull public PluginManifest getPluginManifest()
- @Nonnull public Path getDataDirectory()
- public boolean isInServerClassPath()
