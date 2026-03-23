# PortalDeviceActivePage

Type: class | Package: com.hypixel.hytale.builtin.portals.ui | Extends: InteractiveCustomUIPage

UI page displayed when a player interacts with a portal device that already has an active portal. Shows portal type information, player count inside the fragment world, remaining time, and whether the player previously died inside.

## Hierarchy

- **Extends:** `InteractiveCustomUIPage`

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Builds the UI command set for the active portal page. Displays portal title, description, player count, and remaining duration.
- computeState(Ref<EntityStore>, ComponentAccessor<EntityStore>) | PortalDeviceActivePage.State | Computes the current state by checking block ref validity, portal device component, destination world, and portal world existence.
- createPlayerCountMsg(World) | Message | Creates a localized player count message with pink color formatting.

## Inner Types

### Data

*class*

Empty codec data class for UI event handling.

### Error

*enum*

Error states: `INVALID_BLOCK`, `INVALID_WORLD`, `DESTINATION_NOT_FRAGMENT`, `INACTIVE_PORTAL`.

### PortalIsOpen

*record*

Record holding the destination `World`, `PortalWorld`, and `diedInside` flag.

### State

*sealed interface*

Sealed interface permitting `PortalIsOpen` and `Error`.

Also in this package: CanSpawnPortal, Data, Data, Error, Error, InstanceKeyNotFound, Material, PortalDevicePageSupplier, PortalDeviceSummonPage, PortalIsOpen, PortalSpawnFinder, PortalTypeNotFound, State, State

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  private static Message createPlayerCountMsg(World world)
  private PortalDeviceActivePage.State computeState(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private final PortalDeviceConfig config
private final Ref<ChunkStore> blockRef
