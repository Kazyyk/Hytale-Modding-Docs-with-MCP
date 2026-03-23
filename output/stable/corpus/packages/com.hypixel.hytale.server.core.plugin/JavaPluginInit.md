# JavaPluginInit

Type: class | Package: com.hypixel.hytale.server.core.plugin | Extends: PluginInit

public class JavaPluginInit extends PluginInit

Initialization data for `JavaPlugin` instances. Extends `PluginInit` with the JAR file path and `PluginClassLoader`.

## Constructors

- JavaPluginInit(@Nonnull PluginManifest pluginManifest, @Nonnull Path dataDirectory, @Nonnull Path file, @Nonnull PluginClassLoader classLoader)

## Methods

- @Nonnull public Path getFile()
- @Nonnull public PluginClassLoader getClassLoader()
- @Override public boolean isInServerClassPath()
