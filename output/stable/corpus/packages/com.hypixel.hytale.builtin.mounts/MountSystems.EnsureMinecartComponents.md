# MountSystems.EnsureMinecartComponents

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: HolderSystem<EntityStore>

public static class EnsureMinecartComponents extends HolderSystem<EntityStore>

Ensures that minecart entities have the required supporting components when added to the store. On entity add, ensures `Interactable` and `PrefabCopyableComponent` exist, and adds a `NetworkId` with a fresh network ID from the entity store.

## Query

Matches entities with MinecartComponent.

## Dependencies

Root dependency (runs first).

## Behavior

- **onEntityAdd:** Ensures `Interactable`, adds `NetworkId`, ensures `PrefabCopyableComponent`.
- **onEntityRemoved:** No-op.

## Related Types

- MountSystems -- enclosing class
- MinecartComponent -- the query component
- MountSystems.OnMinecartHit -- handles minecart damage

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()

Fields:
private final ComponentType<EntityStore,MinecartComponent> minecartComponentType
private final ComponentType<EntityStore,Interactable> interactableComponentType
private final ComponentType<EntityStore,NetworkId> networkIdComponentType
private final ComponentType<EntityStore,PrefabCopyableComponent> prefabCopyableComponentType
