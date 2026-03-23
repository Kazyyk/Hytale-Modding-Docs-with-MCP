# MountSystems.PlayerMount

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, MountedComponent>

public static class PlayerMount extends RefChangeSystem<EntityStore, MountedComponent>

Reacts to MountedComponent changes on player entities (those with `PlayerInput`) to synchronize the mount network ID on the player's input component.

## Behavior

- **onComponentAdded:** Resolves the mount target entity's `NetworkId` and sets it on `PlayerInput.setMountId()`. Clears the movement update queue.
- **onComponentRemoved:** Resets `PlayerInput.setMountId(0)`.
- **onComponentSet:** No-op.

## Query

Matches entities with `PlayerInput`.

## Related Types

- MountSystems -- enclosing class
- MountSystems.HandleMountInput -- processes input while mounted

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,MountedComponent> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, MountedComponent oldComponent, MountedComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, MountedComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,PlayerInput> playerInputComponentType
private final ComponentType<EntityStore,NetworkId> networkIdComponentType
private final Query<EntityStore> query
