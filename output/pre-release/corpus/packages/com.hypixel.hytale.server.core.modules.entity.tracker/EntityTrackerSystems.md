# EntityTrackerSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.tracker

public class EntityTrackerSystems

Container class for the core entity visibility and network update ECS systems. These systems determine which entities are visible to each viewer, track visibility state changes between ticks, queue component and effect updates for visible entities, and send the final `EntityUpdates` packets to clients.

The systems form an ordered pipeline executed each tick:

1. **ClearEntityViewers** -- resets each viewer's visible set (runs before `FIND_VISIBLE_ENTITIES_GROUP`).
2. **ClearPreviouslyVisible** -- swaps current and previous visibility maps on each `Visible` component.
3. **CollectVisible** -- spatial query to populate each viewer's visible set (runs in `FIND_VISIBLE_ENTITIES_GROUP`).
4. **EnsureVisibleComponent** -- adds `Visible` components to newly visible entities.
5. **AddToVisible** -- populates the `Visible.visibleTo` map from viewer data.
6. **RemoveEmptyVisibleComponent** -- removes `Visible` from entities no longer seen by anyone.
7. **EffectControllerSystem** -- queues effect updates for visible entities (runs in `QUEUE_UPDATE_GROUP`).
8. **SendPackets** -- serializes and sends `EntityUpdates` packets (runs in `EntityStore.SEND_PACKET_GROUP`, after `QUEUE_UPDATE_GROUP`).

Additionally, `RemoveVisibleComponent` is a holder system that cleans up `Visible` on entity removal.

## System Groups


@Nonnull
public static final SystemGroup<EntityStore> FIND_VISIBLE_ENTITIES_GROUP = EntityStore.REGISTRY.registerSystemGroup()

System group for all systems that discover which entities are visible to viewers. `CollectVisible` runs inside this group.


@Nonnull
public static final SystemGroup<EntityStore> QUEUE_UPDATE_GROUP = EntityStore.REGISTRY.registerSystemGroup()

System group for systems that queue network updates for visible entities. `EffectControllerSystem` and the legacy tracker systems run inside this group.

## Static Methods


public static boolean despawnAll(@Nonnull Ref<EntityStore> viewerRef, @Nonnull Store<EntityStore> store)

Sends a removal packet for all entities currently tracked by the given viewer, then clears the viewer's tracking state (preserving the viewer's own network ID). Returns `false` if the viewer ref is invalid or lacks an `EntityViewer` component.


public static boolean clear(@Nonnull Ref<EntityStore> viewerRef, @Nonnull Store<EntityStore> store)

Clears the viewer's sent entity map and removes the viewer from every tracked entity's `Visible.visibleTo` set. Returns `false` if the viewer ref is invalid or lacks an `EntityViewer` component.

## Inner Classes

### AddToVisible


public static class AddToVisible extends EntityTickingSystem<EntityStore>

Per-tick system that populates each `Visible` component's `visibleTo` map. For every entity in a viewer's visible set, calls `Visible.addViewerParallel()` to register the viewer. Runs after `EnsureVisibleComponent`.

Supports parallel execution.

### ClearEntityViewers


public static class ClearEntityViewers extends EntityTickingSystem<EntityStore>

Per-tick system that resets each `EntityViewer`'s visible set, `lodExcludedCount`, and `hiddenCount` to zero. Runs before `FIND_VISIBLE_ENTITIES_GROUP` to prepare for the next visibility pass.

Supports parallel execution.

### ClearPreviouslyVisible


public static class ClearPreviouslyVisible extends EntityTickingSystem<EntityStore>

Per-tick system that rotates the `Visible` component's visibility maps. Swaps `visibleTo` into `previousVisibleTo`, then clears `visibleTo` and `newlyVisibleTo`. Runs after `ClearEntityViewers` and after `FIND_VISIBLE_ENTITIES_GROUP`.

Supports parallel execution.

### CollectVisible


public static class CollectVisible extends EntityTickingSystem<EntityStore>

Per-tick system that performs spatial queries to find entities within each viewer's view radius. Reads the viewer's position from `TransformComponent` and queries the `NetworkSendableSpatialResource` spatial structure. Results are added to the viewer's visible set. Runs in `FIND_VISIBLE_ENTITIES_GROUP`, after `NetworkSendableSpatialSystem`.

Queries for entities matching both `EntityViewer` and `TransformComponent`.

Supports parallel execution.

### EffectControllerSystem


public static class EffectControllerSystem extends EntityTickingSystem<EntityStore>

Per-tick system that queues entity effect updates for network transmission. For newly visible viewers, sends a full effect initialization via `EffectControllerComponent.createInitUpdates()`. For existing viewers whose effects have changed, sends delta updates via `consumeChanges()`. Runs in `QUEUE_UPDATE_GROUP`.

Queries for entities matching both `Visible` and `EffectControllerComponent`.

Supports parallel execution.

### EnsureVisibleComponent


public static class EnsureVisibleComponent extends EntityTickingSystem<EntityStore>

Per-tick system that ensures every entity in a viewer's visible set has a `Visible` component. If the entity's archetype does not contain the `Visible` component type, it is added via the command buffer. Runs after `ClearPreviouslyVisible`.

Supports parallel execution.

### EntityUpdate


public static class EntityUpdate

Thread-safe container for pending network updates to a single entity. Uses `StampedLock` for concurrent write access to the removed component types (`EnumSet<ComponentUpdateType>`) and update list (`List<ComponentUpdate>`).

#### Constructors


public EntityUpdate()

Creates an empty update.


public EntityUpdate(@Nonnull EntityTrackerSystems.EntityUpdate other)

Copy constructor.

#### Methods


@Nonnull
public EntityTrackerSystems.EntityUpdate clone()

Returns a copy of this update.


public void queueRemove(@Nonnull ComponentUpdateType type)

Thread-safely adds a component type to the removal set.


public void queueUpdate(@Nonnull ComponentUpdate update)

Thread-safely adds a component update to the update list.


@Nullable
public ComponentUpdateType[] toRemovedArray()

Returns the removed types as an array, or `null` if empty.


@Nullable
public ComponentUpdate[] toUpdatesArray()

Returns the updates as an array, or `null` if empty.

### EntityViewer


public static class EntityViewer implements Component<EntityStore>

ECS component attached to entities that can observe other entities (typically player entities). Tracks the viewer's view radius, visible entity set, pending entity updates, and the mapping of entity references to network IDs (`sent` map).

#### Fields


public int viewRadiusBlocks

View radius in blocks for spatial visibility queries.


@Nonnull
public IPacketReceiver packetReceiver

Network connection for sending packets to this viewer.


@Nonnull
public Set<Ref<EntityStore>> visible

Set of entity references currently visible to this viewer (populated each tick).


@Nonnull
public Map<Ref<EntityStore>, EntityTrackerSystems.EntityUpdate> updates

Pending per-entity updates to be sent in the next packet. Backed by `ConcurrentHashMap`.


@Nonnull
public Object2IntMap<Ref<EntityStore>> sent

Map of entity references to assigned network IDs. Default return value is `-1`.


public int lodExcludedCount

Number of entities excluded this tick by LOD culling.


public int hiddenCount

Number of entities hidden this tick by entity hiding rules.

#### Component Type Accessor


public static ComponentType<EntityStore, EntityTrackerSystems.EntityViewer> getComponentType()

Returns the registered component type via `EntityModule.get().getEntityViewerComponentType()`.

#### Constructors


public EntityViewer(int viewRadiusBlocks, @Nonnull IPacketReceiver packetReceiver)

Creates a new viewer with the given radius and network receiver.


public EntityViewer(@Nonnull EntityTrackerSystems.EntityViewer other)

Copy constructor. Deep-copies the updates map and sent map.

#### Methods


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a deep copy.


public void queueRemove(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentUpdateType type)

Queues a component removal for a visible entity. Throws `IllegalArgumentException` if the entity is not in the visible set.


public void queueUpdate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentUpdate update)

Queues a component update for a visible entity. Throws `IllegalArgumentException` if the entity is not in the visible set.

### RemoveEmptyVisibleComponent


public static class RemoveEmptyVisibleComponent extends EntityTickingSystem<EntityStore>

Per-tick system that removes the `Visible` component from entities that are no longer visible to any viewer. Runs after `AddToVisible` and before `QUEUE_UPDATE_GROUP`.

Supports parallel execution.

### RemoveVisibleComponent


public static class RemoveVisibleComponent extends HolderSystem<EntityStore>

Holder lifecycle system that removes the `Visible` component when an entity is removed from the store. The `onEntityAdd` callback is a no-op; cleanup happens in `onEntityRemoved`.

### SendPackets


public static class SendPackets extends EntityTickingSystem<EntityStore>

Per-tick system that builds and sends `EntityUpdates` packets to each viewer. Runs in `EntityStore.SEND_PACKET_GROUP`, after `QUEUE_UPDATE_GROUP`.

For each viewer:
1. Removes updates for invalid entity references.
2. Iterates the `sent` map, collecting network IDs of entities no longer visible or valid for removal.
3. Assigns network IDs to newly visible entities via NetworkId.
4. Constructs an `EntityUpdates` packet containing removed entity IDs and per-entity updates.
5. Sends the packet via `IPacketReceiver.writeNoCache()`.

Supports parallel execution.

### Visible


public static class Visible implements Component<EntityStore>

ECS component attached to entities that are currently visible to at least one viewer. Tracks which viewers can see this entity, which viewers could see it last tick, and which viewers are newly seeing it this tick.

Uses a `StampedLock` for thread-safe parallel writes in `addViewerParallel()`.

#### Fields


@Nonnull
public Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> previousVisibleTo

Viewers that could see this entity last tick. Swapped from `visibleTo` by `ClearPreviouslyVisible`.


@Nonnull
public Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo

Viewers that can see this entity this tick.


@Nonnull
public Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> newlyVisibleTo

Viewers seeing this entity for the first time this tick (not present in `previousVisibleTo`).

#### Component Type Accessor


@Nonnull
public static ComponentType<EntityStore, EntityTrackerSystems.Visible> getComponentType()

Returns the registered component type via `EntityModule.get().getVisibleComponentType()`.

#### Methods


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a new empty `Visible` instance (visibility state is not cloned).


public void addViewerParallel(@Nonnull Ref<EntityStore> ref, @Nonnull EntityTrackerSystems.EntityViewer entityViewerComponent)

Thread-safely adds a viewer to the `visibleTo` map. If the viewer was not in `previousVisibleTo`, also adds to `newlyVisibleTo`.

## Related Types

- LegacyEntityTrackerSystems -- legacy systems for model, skin, equipment, hiding, and LOD culling
- NetworkId -- network ID component read by `SendPackets`
- `EntityModule` -- registers all tracker component types and systems
- `EntityStore` -- the ECS store all tracker systems operate on
- `TransformComponent` -- position component used by `CollectVisible`
- `EffectControllerComponent` -- effect state component used by `EffectControllerSystem`
- `NetworkSendableSpatialSystem` -- spatial indexing system that `CollectVisible` depends on

Also in this package: AddToVisible, ClearEntityViewers, ClearPreviouslyVisible, CollectVisible, EffectControllerSystem, EnsureVisibleComponent, EntityUpdate, EntityViewer, LegacyEntityModel, LegacyEntitySkin, LegacyEntityTrackerSystems, LegacyEquipment, LegacyHideFromEntity, LegacyLODCull, NetworkId, RemoveEmptyVisibleComponent, RemoveVisibleComponent, SendPackets, Visible

Complete API:
  public static boolean despawnAll(Ref<EntityStore> viewerRef, Store<EntityStore> store)
  public static boolean clear(Ref<EntityStore> viewerRef, Store<EntityStore> store)

Fields:
public static final SystemGroup<EntityStore> FIND_VISIBLE_ENTITIES_GROUP
public static final SystemGroup<EntityStore> QUEUE_UPDATE_GROUP
