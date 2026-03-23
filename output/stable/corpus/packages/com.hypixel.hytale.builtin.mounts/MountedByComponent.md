# MountedByComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts | Implements: Component<EntityStore>

public class MountedByComponent implements Component<EntityStore>

An `EntityStore` ECS component that tracks which entities are currently riding a given mount entity. Maintained automatically by MountSystems.TrackedMounted when `MountedComponent` is added or removed from passenger entities.

## Component Type


public static ComponentType<EntityStore, MountedByComponent> getComponentType()

Delegates to `MountPlugin.getInstance().getMountedByComponentType()`.

## Methods

### getPassengers


@Nonnull
public List<Ref<EntityStore>> getPassengers()

Returns the list of passenger entity references after removing any invalid references.

### addPassenger


public void addPassenger(Ref<EntityStore> passenger)

Adds a passenger reference to the list.

### removePassenger


public void removePassenger(Ref<EntityStore> ref)

Removes a passenger reference from the list.

### withPassenger


@Nonnull
public MountedByComponent withPassenger(Ref<EntityStore> passenger)

Fluent variant of `addPassenger` that returns `this`.

### removeInvalid


public void removeInvalid()

Removes all invalid (stale) references from the passenger list.

## Clone


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a new empty `MountedByComponent`. Passengers are not copied.

## Related Types

- MountedComponent -- the component on passenger entities
- MountSystems.TrackedMounted -- system maintaining this component
- MountSystems.RemoveMountedBy -- dismounts passengers on mount removal

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public static ComponentType<EntityStore,MountedByComponent> getComponentType()
  public void removeInvalid()
  public List<Ref<EntityStore>> getPassengers()
  public void addPassenger(Ref<EntityStore> passenger)
  public void removePassenger(Ref<EntityStore> ref)
  public MountedByComponent withPassenger(Ref<EntityStore> passenger)
  public Component<EntityStore> clone()

Fields:
private final List<Ref<EntityStore>> passengers
