# MountSystems.TeleportMountedEntity

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, Teleport>

public static class TeleportMountedEntity extends RefChangeSystem<EntityStore, Teleport>

Dismounts an entity when it is teleported. Reacts to `Teleport` component being added to entities with a MountedComponent, and removes the `MountedComponent`.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`Teleport` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Dependencies

Ordered `BEFORE` both `TeleportSystems.MoveSystem` and `TeleportSystems.PlayerMoveSystem` with `CLOSEST` priority.

## Related Types

- MountSystems -- enclosing class
- MountSystems.MountedEntityDeath -- similar dismount-on-event pattern

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,Teleport> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, Teleport component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, Teleport oldComponent, Teleport newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, Teleport component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Set<Dependency<EntityStore>> getDependencies()

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,Teleport> teleportComponentType
private final Set<Dependency<EntityStore>> dependencies
