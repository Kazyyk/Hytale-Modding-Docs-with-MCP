# LANDiscoveryPlugin

Type: class | Package: com.hypixel.hytale.builtin.landiscovery | Extends: JavaPlugin

public class LANDiscoveryPlugin extends JavaPlugin

Plugin that registers commands for the builtin subsystem.

## Fields

- lanDiscoveryThread | LANDiscoveryThread | LANDiscoveryThread field.
- instance | LANDiscoveryPlugin | Static LANDiscoveryPlugin field.

## Constructors

- LANDiscoveryPlugin(@Nonnull JavaPluginInit init) | Creates a new LANDiscoveryPlugin instance.

## Methods

- get() | LANDiscoveryPlugin | static public method.
- setup() | void | protected method.
- start() | void | protected method.
- shutdown() | void | protected method.
- setLANDiscoveryEnabled(boolean enabled) | void | public method.
- isLANDiscoveryEnabled() | boolean | public method.
- getLanDiscoveryThread() | LANDiscoveryThread | public method.

Also in this package: LANDiscoveryCommand, LANDiscoveryThread

Complete API:
  public static LANDiscoveryPlugin get()
  protected void setup()
  protected void start()
  protected void shutdown()
  public void setLANDiscoveryEnabled(boolean enabled)
  public boolean isLANDiscoveryEnabled()
  public LANDiscoveryThread getLanDiscoveryThread()

Fields:
private LANDiscoveryThread lanDiscoveryThread
private static LANDiscoveryPlugin instance
