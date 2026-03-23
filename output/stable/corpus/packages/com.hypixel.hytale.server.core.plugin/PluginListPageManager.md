# PluginListPageManager

Type: class | Package: com.hypixel.hytale.server.core.plugin

public class PluginListPageManager

Manages plugin list UI pages. Notifies registered pages when plugins are enabled or disabled.

## Methods

- @Nonnull public static PluginListPageManager get()
- public void registerPluginListPage(@Nonnull PluginListPage page)
- public void deregisterPluginListPage(@Nonnull PluginListPage page)
- public void notifyPluginChange(@Nonnull Map<PluginIdentifier, PluginBase> plugins, @Nonnull PluginIdentifier pluginIdentifier)

## Inner Classes

### SessionSettings

`Component<EntityStore>` that stores per-player plugin list display settings.

Also in this package: JavaPlugin, JavaPluginInit, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginManager, PluginState, PluginType, SessionSettings

Complete API:
  public static PluginListPageManager get()
  public void registerPluginListPage(PluginListPage page)
  public void deregisterPluginListPage(PluginListPage page)
  public void notifyPluginChange(Map<PluginIdentifier,PluginBase> plugins, PluginIdentifier pluginIdentifier)

Fields:
public static PluginListPageManager instance
private final List<PluginListPage> activePages
