# MountSystems.RemoveBlockSeat

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefSystem<ChunkStore>

public static class RemoveBlockSeat extends RefSystem<ChunkStore>

A `ChunkStore` system that dismounts all seated entities when a block seat chunk entity is removed. Registered on the chunk store registry by MountPlugin.

## Query

Matches chunk entities with BlockMountComponent.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Collects all seated entity references from the `BlockMountComponent`, removes each from the seat, and schedules removal of the MountedComponent on the world thread for each valid seated entity.

## Related Types

- MountSystems -- enclosing class
- BlockMountComponent -- the component tracking seated entities

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove (and 8 more)

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,BlockMountComponent> blockMountComponentType
private final ComponentType<EntityStore,MountedComponent> mountedComponentType
