# TimeModule

Type: class | Package: com.hypixel.hytale.server.core.modules.time | Extends: JavaPlugin

public class TimeModule extends JavaPlugin

Plugin module managing the game time system. Registers world time resources, time systems, and the time command.

## Methods

- public static TimeModule get()
- public ResourceType<EntityStore, WorldTimeResource> getWorldTimeResourceType()
- public ResourceType<EntityStore, TimeResource> getTimeResourceType()

Also in this package: Init, Ticking, TimePacketSystem, TimeResource, TimeSystem, WorldTimeResource, WorldTimeSystems

Complete API:
  public static TimeModule get()
  protected void setup()
  public ResourceType<EntityStore,WorldTimeResource> getWorldTimeResourceType()
  public ResourceType<EntityStore,TimeResource> getTimeResourceType()

Fields:
public static final PluginManifest MANIFEST
private static TimeModule instance
private ResourceType<EntityStore,WorldTimeResource> worldTimeResourceType
private ResourceType<EntityStore,TimeResource> timeResourceType
