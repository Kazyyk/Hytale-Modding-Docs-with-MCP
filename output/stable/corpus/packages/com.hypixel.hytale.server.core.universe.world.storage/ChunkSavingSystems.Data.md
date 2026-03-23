# ChunkSavingSystems.Data

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: Resource<ChunkStore>

public class Data implements Resource<ChunkStore>

Resource tracking the chunk save queue, save futures, timer, and progress counters. Queue update interval: 0.5 seconds.

Also in this package: ChunkSavingSystems, ChunkUnloadingSystem, Data, Ticking, WorldRemoved

Complete API:
  public Resource<ChunkStore> clone()
  public void clearSaveQueue()
  public void push(Ref<ChunkStore> reference)
  public Ref<ChunkStore> poll()
  public boolean checkTimer(float dt)
  public CompletableFuture<Void> waitForSavingChunks()

Fields:
public static final float QUEUE_UPDATE_INTERVAL
private final Set<Ref<ChunkStore>> set
private final Deque<Ref<ChunkStore>> queue
private final List<CompletableFuture<Void>> chunkSavingFutures
private float time
public boolean isSaving
private final AtomicInteger savedCount
private final AtomicInteger toSaveTotal
