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

Also in this package: JavaPlugin, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginListPageManager, PluginManager, PluginState, PluginType, SessionSettings

Complete API:
  public Path getFile()
  public PluginClassLoader getClassLoader()
  public boolean isInServerClassPath()

Fields:
private final Path file
private final PluginClassLoader classLoader
