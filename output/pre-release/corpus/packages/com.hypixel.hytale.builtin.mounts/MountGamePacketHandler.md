# MountGamePacketHandler

Type: class | Package: com.hypixel.hytale.builtin.mounts | Implements: SubPacketHandler

public class MountGamePacketHandler implements SubPacketHandler

Handles incoming `DismountNPC` packets from clients. Registered by MountPlugin via `ServerManager.get().registerSubPacketHandlers()`.

## Constructor


public MountGamePacketHandler(IPacketHandler packetHandler)

Stores the parent packet handler for player reference resolution.

## Methods

### registerHandlers


@Override
public void registerHandlers()

Registers a handler for packet ID `294` (`DismountNPC`).

### handle


public void handle(DismountNPC packet)

Processes a dismount request from the client. Resolves the player's entity reference and executes on the world thread:

1. If the player has no MountedComponent, delegates to `MountPlugin.checkDismountNpc()` to handle NPC dismount.
2. If the player has a `MountedComponent` with controller type `BlockMount`, removes the `MountedComponent` to dismount from the block.

Throws `RuntimeException` if the player reference is invalid.

## Related Types

- MountPlugin -- registers this handler
- MountedComponent -- checked and removed during dismount

Also in this package: BlockMountAPI, BlockMountComponent, BlockMountResult, DidNotMount, DismountOnMountDeath, DismountOnPlayerDeath, EnsureMinecartComponents, HandleMountInput, MountPlugin, MountSystems, Mounted, MountedByComponent, MountedComponent, MountedEntityDeath, NPCMountComponent, NPCMountSystems, OnAdd, OnMinecartHit, OnPlayerRemove, PlayerMount (and 8 more)

Complete API:
  public void registerHandlers()
  public void handle(DismountNPC packet)

Fields:
private final IPacketHandler packetHandler
