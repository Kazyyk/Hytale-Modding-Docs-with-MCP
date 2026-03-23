# GeneratedChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class GeneratedChunk

Composite container for all data generated for a single chunk: blocks, block states, entities, and section holders. Converts to a `WorldChunk` holder for insertion into the world.

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  public GeneratedBlockChunk getBlockChunk()
  public GeneratedBlockStateChunk getBlockStateChunk()
  public GeneratedEntityChunk getEntityChunk()
  public Holder<ChunkStore>[] getSections()
  public Holder<ChunkStore> toWorldChunk(World world)
  public Holder<ChunkStore> toHolder(World world)
  public static Holder<ChunkStore>[] makeSections()

Fields:
private final GeneratedBlockChunk generatedBlockChunk
private final GeneratedBlockStateChunk generatedBlockStateChunk
private final GeneratedEntityChunk generatedEntityChunk
private final Holder<ChunkStore>[] sections
