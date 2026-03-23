# PortalsPlugin

Type: class | Package: com.hypixel.hytale.builtin.portals | Extends: JavaPlugin

public class PortalsPlugin extends JavaPlugin

## Fields

- private static PortalsPlugin instance
- private ResourceType<EntityStore,PortalWorld> portalResourceType
- private ComponentType<ChunkStore,PortalDevice> portalDeviceComponentType
- private ComponentType<EntityStore,VoidEvent> voidEventComponentType
- private ComponentType<EntityStore,VoidSpawner> voidPortalComponentType
- public static final int MAX_CONCURRENT_FRAGMENTS

## Methods

- public static PortalsPlugin getInstance()
- @Override protected void setup()
- private void turnOffPortalWhenWorldRemoved(RemoveWorldEvent event)
- public int countActiveFragments()
- public ResourceType<EntityStore,PortalWorld> getPortalResourceType()
- public ComponentType<ChunkStore,PortalDevice> getPortalDeviceComponentType()
- public ComponentType<EntityStore,VoidEvent> getVoidEventComponentType()
- public ComponentType<EntityStore,VoidSpawner> getVoidPortalComponentType()
