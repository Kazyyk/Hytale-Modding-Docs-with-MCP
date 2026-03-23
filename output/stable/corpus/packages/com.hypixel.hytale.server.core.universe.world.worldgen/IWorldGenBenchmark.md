# IWorldGenBenchmark

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public interface IWorldGenBenchmark

Interface for worldgen benchmark operations.

## Methods

- void start()
- void stop()
- CompletableFuture<String> buildReport()

Known implementors: ChunkWorldgenBenchmark

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  void start()
  void stop()
  CompletableFuture<String> buildReport()
