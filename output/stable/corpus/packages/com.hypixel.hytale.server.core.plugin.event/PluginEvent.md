# PluginEvent

Type: abstract class | Package: com.hypixel.hytale.server.core.plugin.event | Implements: IEvent

public abstract class PluginEvent implements IEvent<Class<? extends PluginBase>>

Server lifecycle event.

## Accessors

- getPlugin() | PluginBase | Accessor method.

Known subclasses: PluginSetupEvent

Also in this package: PluginSetupEvent

Complete API:
  public PluginBase getPlugin()
  public String toString()

Fields:
private final PluginBase plugin
