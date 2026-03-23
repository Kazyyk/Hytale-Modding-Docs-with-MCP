# IWorldGen

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public interface IWorldGen

Core interface for world generation implementations. Defines the contract for generating chunks, providing spawn points, and timing collection.

## Methods

- WorldGenTimingsCollector getTimings()
- CompletableFuture<GeneratedChunk> generate(int seed, long chunkIndex, int x, int z, LongPredicate predicate)
- Transform[] getSpawnPoints(int seed)
- default ISpawnProvider getDefaultSpawnProvider(int seed)
- default void shutdown()
