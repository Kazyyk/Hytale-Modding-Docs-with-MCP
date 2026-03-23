# PortalInvalidDestinationSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems

public class PortalInvalidDestinationSystem

System that handles invalid portal destinations by cleaning up portal references when the destination world no longer exists.

Also in this package: CloseWorldWhenBreakingDeviceSystems, ComponentRemoved, EntityRemoved, PortalTrackerSystems, TrackerSystem, UiTickingSystem

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public Query<ChunkStore> getQuery()
  public static void turnOffPortalsInWorld(World originWorld, World destinationWorld)
  private static void turnOffPortalBlock(World world, PortalDevice portalDevice, BlockModule.BlockStateInfo blockStateInfo)
