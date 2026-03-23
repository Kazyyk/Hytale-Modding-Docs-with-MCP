# AnchorActionModule

Type: class | Package: com.hypixel.hytale.server.core.modules.anchoraction | Extends: JavaPlugin

public class AnchorActionModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static final HytaleLogger LOGGER
- private static AnchorActionModule instance
- private final Map<String,AnchorActionHandler> handlers

## Methods

- public static AnchorActionModule get()
- public void register(String action, AnchorActionHandler handler)
- public void register(String action, AnchorActionModule.WorldThreadAnchorActionHandler handler)
- public void unregister(String action)
- public boolean tryHandle(PlayerRef playerRef, String rawData)

## Inner Types

- `AnchorActionModule.WorldThreadAnchorActionHandler`

Also in this package: AnchorActionHandler, WorldThreadAnchorActionHandler

Complete API:
  public static AnchorActionModule get()
  public void register(String action, AnchorActionHandler handler)
  public void register(String action, AnchorActionModule.WorldThreadAnchorActionHandler handler)
  public void unregister(String action)
  public boolean tryHandle(PlayerRef playerRef, String rawData)

Fields:
public static final PluginManifest MANIFEST
private static final HytaleLogger LOGGER
private static AnchorActionModule instance
private final Map<String,AnchorActionHandler> handlers
