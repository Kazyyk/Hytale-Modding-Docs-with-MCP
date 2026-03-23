# MountSystems

Type: class | Package: com.hypixel.hytale.builtin.mounts

public class MountSystems

Container class for entity-mount ECS systems. All systems are declared as static inner classes and registered by MountPlugin.setup(). Also contains a private static helper method `handleMountedRemoval` used by multiple systems to clean up mount relationships.

## Private Helper

### handleMountedRemoval


private static void handleMountedRemoval(
    @Nonnull Ref<EntityStore> ref, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull MountedComponent component
)

Cleans up both sides of a mount relationship:
- If mounted to an entity, removes the passenger from the target's MountedByComponent.
- If mounted to a block, removes the seated entity from the BlockMountComponent and removes the component if no entities remain.

## Inner Classes

- TrackerUpdate -- queues network updates for mounted entities
- TrackerRemove -- sends remove updates on dismount
- TrackedMounted -- maintains `MountedByComponent` passenger lists
- PlayerMount -- sets mount IDs on player input
- HandleMountInput -- processes player movement while mounted
- MountedEntityDeath -- dismounts on death
- TeleportMountedEntity -- dismounts on teleport
- RemoveMounted -- cleans up when mounted entity is removed
- RemoveMountedBy -- dismounts passengers when mount is removed
- RemoveMountedHolder -- strips component from holder
- RemoveBlockSeat -- dismounts on block seat removal
- EnsureMinecartComponents -- ensures minecart support components
- OnMinecartHit -- handles minecart damage

## Related Types

- MountPlugin -- registers all systems
- NPCMountSystems -- NPC-specific mount systems

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  private static void handleMountedRemoval(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, MountedComponent component)
