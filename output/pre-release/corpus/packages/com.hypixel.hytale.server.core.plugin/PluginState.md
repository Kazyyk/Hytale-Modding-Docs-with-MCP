# PluginState

Type: enum | Package: com.hypixel.hytale.server.core.plugin

public enum PluginState

Lifecycle states for a plugin.

## Values

- NONE: Initial state before setup
- SETUP: Plugin is being set up
- START: Plugin is being started
- ENABLED: Plugin is fully running
- SHUTDOWN: Plugin is shutting down
- DISABLED: Plugin has been cleanly disabled
- FAILED: Plugin encountered an error

## Methods

- public boolean isInactive()

Also in this package: JavaPlugin, JavaPluginInit, MissingPluginDependencyException, PluginBase, PluginBridgeClassLoader, PluginClassLoader, PluginInit, PluginListPageManager, PluginManager, PluginType, SessionSettings

Complete API:
  public boolean isInactive()
