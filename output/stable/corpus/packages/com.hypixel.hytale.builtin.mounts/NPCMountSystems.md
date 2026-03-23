# NPCMountSystems

Type: class | Package: com.hypixel.hytale.builtin.mounts

public class NPCMountSystems

Container class for NPC-specific mount ECS systems. All systems are declared as static inner classes and registered by MountPlugin.setup().

## Inner Classes

- OnAdd -- handles NPC mount component addition
- DismountOnPlayerDeath -- dismounts player on death
- DismountOnMountDeath -- resets player on mount death
- OnPlayerRemove -- dismounts player on entity removal

## Related Types

- MountSystems -- entity-mount systems
- NPCMountComponent -- the NPC mount component
- MountPlugin -- registers all systems

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)
