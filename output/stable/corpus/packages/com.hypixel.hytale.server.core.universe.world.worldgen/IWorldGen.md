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

Known implementors: DummyWorldGen, FlatWorldGen, Handle, IBenchmarkableWorldGen, VoidWorldGen

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  WorldGenTimingsCollector getTimings()
  CompletableFuture<GeneratedChunk> generate(int var1, long var2, int var4, int var5, LongPredicate var6)
  Transform[] getSpawnPoints(int var1)
  default ISpawnProvider getDefaultSpawnProvider(int seed)
  default void shutdown()
