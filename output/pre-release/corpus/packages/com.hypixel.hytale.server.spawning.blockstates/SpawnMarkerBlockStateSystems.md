# SpawnMarkerBlockStateSystems

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates

public class SpawnMarkerBlockStateSystems

Container for ECS systems managing spawn marker block state lifecycle: creating marker entities when blocks are placed and cleaning up when blocks or markers are removed.

Also in this package: AddOrRemove, Data, SpawnMarkerAddedFromExternal, SpawnMarkerBlock, SpawnMarkerBlockReference, SpawnMarkerTickHeartbeat, TickHeartbeat

Complete API:
  private static void createMarker(Ref<ChunkStore> ref, SpawnMarkerBlock state, BlockModule.BlockStateInfo info, Store<EntityStore> store, CommandBuffer<ChunkStore> commandBuffer)

Fields:
private static final HytaleLogger LOGGER
