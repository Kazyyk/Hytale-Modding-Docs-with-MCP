# ChunkLightingManager

Type: class | Package: com.hypixel.hytale.server.core.universe.world.lighting | Extends: null | Implements: Runnable

public class ChunkLightingManager implements Runnable

## Fields

- private final HytaleLogger logger
- private final Thread thread
- private final World world
- private final Semaphore semaphore
- private final Set<Vector3i> set
- private final ObjectArrayFIFOQueue<Vector3i> queue
- private LightCalculation lightCalculation
- int lastSize
- int count
- Vector3i pos
- int currentSize
- int i
- StringBuilder sb
- Vector3i chunkPos
- WorldChunk chunk
- BlockSection section
- int x
- int z

## Constructors

- public ChunkLightingManager(@Nonnull World world)

## Methods

- protected HytaleLogger getLogger()
- public World getWorld()
- public void setLightCalculation(LightCalculation lightCalculation)
- public LightCalculation getLightCalculation()
- public void start()
- public void run()
- private void process(Vector3i chunkPosition)
- public boolean interrupt()
- public void stop()
- public void init(WorldChunk worldChunk)
- public void addToQueue(Vector3i chunkPosition)
- public boolean isQueued(int chunkX, int chunkZ)
- public boolean isQueued(Vector3i chunkPosition)
- public int getQueueSize()
- public boolean invalidateLightAtBlock(WorldChunk worldChunk, int blockX, int blockY, int blockZ, BlockType blockType, int oldHeight, int newHeight)
- public boolean invalidateLightInChunk(WorldChunk worldChunk)
- public boolean invalidateLightInChunkSection(WorldChunk worldChunk, int sectionIndex)
- public boolean invalidateLightInChunkSections(WorldChunk worldChunk, int sectionIndexFrom, int sectionIndexTo)
- public void invalidateLoadedChunks()

## Related Types

- FloodLightCalculation
- LightCalculation
