# BlockMountAPI.BlockMountResult

Type: sealed interface | Package: com.hypixel.hytale.builtin.mounts

public sealed interface BlockMountResult permits BlockMountAPI.Mounted, BlockMountAPI.DidNotMount

Sealed result type returned by BlockMountAPI.mountOnBlock(). Permits exactly two implementations:

- Mounted -- successful mount
- DidNotMount -- failure with a specific reason

## Related Types

- BlockMountAPI -- enclosing class

Known implementors: DidNotMount, Mounted

Also in this package: BlockMountAPI, BlockMountComponent, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountGamePacketHandler, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)
