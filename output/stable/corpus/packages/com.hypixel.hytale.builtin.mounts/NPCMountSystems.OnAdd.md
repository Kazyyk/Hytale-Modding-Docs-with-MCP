# NPCMountSystems.OnAdd

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<EntityStore>

public static class OnAdd extends RefSystem<EntityStore>

Handles NPCMountComponent addition on NPC entities. When an NPC gains a mount component:

- **With owner player:** Resolves the NPC's `NetworkId`, sends a `MountNPC` packet to the owning player with the anchor offset and network ID, sets the player's mount entity ID, and removes the `Interactable` component to prevent further interactions.
- **Without owner player:** Resets the NPC to its original role via `RoleChangeSystem.requestRoleChange()`, removes the `NPCMountComponent`, and re-ensures the `Interactable` component. This handles the case where the mount component was loaded from persistence without an active player.

## Query

Matches entities with `NPCMountComponent`, `NPCEntity`, and `NetworkId`.

## Behavior

- **onEntityAdded:** Processes the mount component as described above.
- **onEntityRemove:** No-op.

## Related Types

- NPCMountSystems -- enclosing class
- NPCMountComponent -- the component being watched
- ActionMount -- the NPC action that creates the component

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void resetOriginalRoleMount(Ref<EntityStore> ref, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, NPCMountComponent mountComponent)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,NPCMountComponent> mountComponentType
private final ComponentType<EntityStore,NPCEntity> npcEntityComponentType
private final ComponentType<EntityStore,NetworkId> networkIdComponentType
private final Query<EntityStore> query
