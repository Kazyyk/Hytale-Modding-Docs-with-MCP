# NPCMountSystems.DismountOnPlayerDeath

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: DeathSystems.OnDeathSystem

public static class DismountOnPlayerDeath extends DeathSystems.OnDeathSystem

Dismounts the player from their NPC mount when the player dies. Reacts to `DeathComponent` being added to player entities and delegates to `MountPlugin.checkDismountNpc()`.

## Query

Matches entities with `Player`.

## Related Types

- NPCMountSystems -- enclosing class
- NPCMountSystems.DismountOnMountDeath -- handles the reverse case (mount dies)

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onComponentAdded(Ref<EntityStore> ref, DeathComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,Player> playerComponentType
