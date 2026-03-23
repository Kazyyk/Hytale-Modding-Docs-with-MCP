# GeneratedBlockStateChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class GeneratedBlockStateChunk

Stores block states (e.g., spawner configurations) generated during world generation. Maps block positions to `Holder<ChunkStore>` instances containing block state data.

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  public Holder<ChunkStore> getState(int x, int y, int z)
  public void setState(int x, int y, int z, Holder<ChunkStore> state)
  public BlockComponentChunk toBlockComponentChunk()

Fields:
private final Int2ObjectMap<Holder<ChunkStore>> mapping
