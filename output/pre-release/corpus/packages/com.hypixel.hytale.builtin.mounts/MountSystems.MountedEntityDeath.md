# MountSystems.MountedEntityDeath

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, DeathComponent>

public static class MountedEntityDeath extends RefChangeSystem<EntityStore, DeathComponent>

Dismounts an entity when it dies. Reacts to `DeathComponent` being added to entities that have a MountedComponent, and removes the `MountedComponent` via the command buffer.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`DeathComponent` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Related Types

- MountSystems -- enclosing class
- MountSystems.TeleportMountedEntity -- similar dismount-on-event pattern

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,DeathComponent> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, DeathComponent oldComponent, DeathComponent newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
private final ComponentType<EntityStore,DeathComponent> deathComponentType
