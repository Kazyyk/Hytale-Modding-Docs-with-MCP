# ChunkWorldgenBenchmark

Type: class | Package: com.hypixel.hytale.server.worldgen.benchmark | Implements: IWorldGenBenchmark

public class ChunkWorldgenBenchmark implements IWorldGenBenchmark

Utility type in the `benchmark` subsystem.

## Accessors

- isEnabled() | boolean | Boolean accessor.

## Methods

- start() | void | Instance method.
- stop() | void | Instance method.
- buildReport() | CompletableFuture<String> | Instance method.
- registerPrefab(String name) | void | Instance method.
- registerCaveNode(String name) | void | Instance method.

Complete API:
  public void start()
  public void stop()
  public CompletableFuture<String> buildReport()
  public boolean isEnabled()
  public void registerPrefab(String name)
  public void registerCaveNode(String name)

Fields:
private final ConcurrentHashMap<String,AtomicInteger> prefabCounts
private final ConcurrentHashMap<String,AtomicInteger> caveNodeCounts
private boolean enabled
