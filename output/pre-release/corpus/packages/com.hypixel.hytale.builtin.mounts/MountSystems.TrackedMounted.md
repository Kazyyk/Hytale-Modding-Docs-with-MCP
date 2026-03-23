# MountSystems.TrackedMounted

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, MountedComponent>

public static class TrackedMounted extends RefChangeSystem<EntityStore, MountedComponent>

Maintains the bidirectional mount relationship between a mounted entity and its mount target. Reacts to MountedComponent lifecycle events.

## Behavior

- **onComponentAdded:** If the mount target entity is valid, ensures a MountedByComponent exists on the target and adds the mounted entity as a passenger.
- **onComponentRemoved:** Delegates to `MountSystems.handleMountedRemoval()` to clean up both sides of the relationship.
- **onComponentSet:** No-op.

## Query

Matches entities with `MountedComponent`.

## Related Types

- MountSystems -- enclosing class
- MountedByComponent -- the component maintained on mount targets

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,MountedComponent> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, MountedComponent oldComponent, MountedComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,MountedByComponent> mountedByComponentType
