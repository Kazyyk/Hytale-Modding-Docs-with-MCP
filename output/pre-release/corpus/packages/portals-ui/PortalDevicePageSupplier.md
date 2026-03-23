# PortalDevicePageSupplier

Type: class | Package: com.hypixel.hytale.builtin.portals.ui | Extends: OpenCustomUIInteraction.CustomPageSupplier

Supplies the appropriate portal device UI page based on the current state of the portal device block. Implements `OpenCustomUIInteraction.CustomPageSupplier`. Validates block types, block states, and creates either a `PortalDeviceSummonPage` (no active portal) or `PortalDeviceActivePage` (active portal).

## Hierarchy

- **Extends:** `OpenCustomUIInteraction.CustomPageSupplier`

## Methods

- tryCreate(Ref<EntityStore>, ComponentAccessor<EntityStore>, PlayerRef, InteractionContext) | CustomUIPage | Determines the portal device state and returns the appropriate UI page. Returns null if the block is misconfigured.

Also in this package: CanSpawnPortal, Data, Data, Error, Error, InstanceKeyNotFound, Material, PortalDeviceActivePage, PortalDeviceSummonPage, PortalIsOpen, PortalSpawnFinder, PortalTypeNotFound, State, State

Complete API:
  public CustomUIPage tryCreate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> store, PlayerRef playerRef, InteractionContext context)
  private static boolean isPortalWorldValid(World world)

Fields:
public static final BuilderCodec<PortalDevicePageSupplier> CODEC
private PortalDeviceConfig config
