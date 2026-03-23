# MountSystems.RemoveMountedHolder

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: HolderSystem<EntityStore>

public static class RemoveMountedHolder extends HolderSystem<EntityStore>

Strips the MountedComponent from the entity holder during entity removal. This ensures the component is removed at the holder level (pre-archetype), complementing the ref-level cleanup in RemoveMounted.

## Query

Matches entities with `MountedComponent`.

## Behavior

- **onEntityAdd:** No-op.
- **onEntityRemoved:** Calls `holder.removeComponent(mountedComponentType)`.

## Related Types

- MountSystems -- enclosing class
- MountSystems.RemoveMounted -- ref-level removal cleanup

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
