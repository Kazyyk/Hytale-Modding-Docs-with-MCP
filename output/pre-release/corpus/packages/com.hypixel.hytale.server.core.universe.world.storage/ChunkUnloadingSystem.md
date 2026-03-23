# ChunkUnloadingSystem

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Extends: TickingSystem<ChunkStore> | Implements: RunWhenPausedSystem<ChunkStore>

public class ChunkUnloadingSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>

Periodic system that unloads chunks no longer visible to any player. Uses RAM pressure detection (85% threshold) to increase poll rate. Respects keep-alive timers and keep-loaded regions.

Also in this package: ChunkSavingSystems, Data, Data, Ticking, WorldRemoved

Complete API:
  public void tick(float dt, int systemIndex, Store<ChunkStore> store)
  public static void tryUnload(int index, ArchetypeChunk<ChunkStore> archetypeChunk, CommandBuffer<ChunkStore> commandBuffer)
  public static ChunkTracker.ChunkVisibility getChunkVisibility(List<ChunkTracker> playerChunkTrackers, long chunkIndex)
  private static boolean isChunkInBox(Box2D box, int x, int z)
  private static void collectTrackers(ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)

Fields:
public static final double DESPERATE_UNLOAD_RAM_USAGE_THRESHOLD
public static final int DESPERATE_UNLOAD_MAX_POLL_COUNT
public static final int TICKS_BEFORE_CHUNK_UNLOADING_REMINDER
public int ticksUntilUnloadingReminder
