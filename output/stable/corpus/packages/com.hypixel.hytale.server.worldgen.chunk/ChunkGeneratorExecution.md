# ChunkGeneratorExecution

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null

public class ChunkGeneratorExecution

## Fields

- private final ChunkGenerator chunkGenerator
- private final GeneratedBlockChunk blockChunk
- private final GeneratedBlockStateChunk blockStateChunk
- private final GeneratedEntityChunk entityChunk
- private final Holder<ChunkStore>[] sections
- private final BlockPriorityChunk priorityChunk
- private final HeightThresholdInterpolator interpolator
- private BlockPriorityModifier blockPriorityModifier
- long start
- WorldGenTimingsCollector timings
- int radius
- int[] rawTint
- int m
- int r
- int g
- int b
- int counter
- int c
- int envId
- byte newPriority
- byte newFlags
- byte oldPriority
- byte oldModified
- Holder<ChunkStore> section
- BlockType blockType
- FluidSection fluidSection

## Constructors

- public ChunkGeneratorExecution(int seed,
        @Nonnull ChunkGenerator chunkGenerator,
        GeneratedBlockChunk blockChunk,
        GeneratedBlockStateChunk blockStateChunk,
        GeneratedEntityChunk entityChunk,
        Holder<ChunkStore>[] sections)` |

## Methods

- public void execute(int seed)
- public ChunkGenerator getChunkGenerator()
- public GeneratedBlockChunk getChunk()
- public GeneratedBlockStateChunk getBlockStateChunk()
- public GeneratedEntityChunk getEntityChunk()
- public BlockPriorityChunk getPriorityChunk()
- public HeightThresholdInterpolator getInterpolator()
- public Holder<ChunkStore> getSection(int y)
- public ZoneBiomeResult zoneBiomeResult(int cx, int cz)
- public CoreDataCacheEntry[] getCoreDataEntries()
- public long getIndex()
- public int getX()
- public int getZ()
- public void setPriorityModifier(BlockPriorityModifier blockPriorityModifier)
- private void generateTintMapping(int seed)
- public static int tintIndexLocal(int x, int z)
- private void generateEnvironmentMapping(int seed)
- public int getBlock(int x, int y, int z)
- public int getRotationIndex(int x, int y, int z)
- public void setEnvironment(int x, int y, int z, int environment)
- public boolean setBlock(int x, int y, int z, byte type, int block)
- public boolean setBlock(int x, int y, int z, byte type, BlockFluidEntry entry)
- public boolean setBlock(int x, int y, int z, byte type, int block, int environment)
- public boolean setBlock(int x, int y, int z, byte type, BlockFluidEntry entry, int environment)
- public boolean setBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder)
- public boolean setBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder, int supportValue, int rotation, int filler)
- public boolean setFluid(int x, int y, int z, byte type, int fluid, int environment)
- public boolean setFluid(int x, int y, int z, byte type, int fluid)
- public boolean setFluid(int x, int y, int z, byte type, int fluid, byte fluidLevel)
- public int getFluid(int x, int y, int z)
- public void overrideBlock(int x, int y, int z, byte type, int block)
- public void overrideBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder)
- public void overrideBlock(int x, int y, int z, byte type, BlockFluidEntry entry)
- public void overrideBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder, int rotation, int filler)
- public void overrideFluid(int x, int y, int z, byte type, int fluid)
- protected int localX(int x)
- protected int localZ(int z)
- public int globalX(int localX)
- public int globalZ(int localZ)

## Related Types

- BlockPriorityChunk
- BlockPriorityModifier
- ChunkGenerator
- HeightThresholdInterpolator
- ZoneBiomeResult

Also in this package: BlockPriorityChunk, BlockPriorityModifier, ChunkGenerator, HeightThresholdInterpolator, MaskProvider, ValidationUtil, ZoneBiomeResult

Complete API:
  public void execute(int seed)
  public ChunkGenerator getChunkGenerator()
  public GeneratedBlockChunk getChunk()
  public GeneratedBlockStateChunk getBlockStateChunk()
  public GeneratedEntityChunk getEntityChunk()
  public BlockPriorityChunk getPriorityChunk()
  public HeightThresholdInterpolator getInterpolator()
  public Holder<ChunkStore> getSection(int y)
  public ZoneBiomeResult zoneBiomeResult(int cx, int cz)
  public CoreDataCacheEntry[] getCoreDataEntries()
  public long getIndex()
  public int getX()
  public int getZ()
  public void setPriorityModifier(BlockPriorityModifier blockPriorityModifier)
  private void generateTintMapping(int seed)
  public static int tintIndexLocal(int x, int z)
  private void generateEnvironmentMapping(int seed)
  public int getBlock(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)
  public void setEnvironment(int x, int y, int z, int environment)
  public boolean setBlock(int x, int y, int z, byte type, int block)
  public boolean setBlock(int x, int y, int z, byte type, BlockFluidEntry entry)
  public boolean setBlock(int x, int y, int z, byte type, int block, int environment)
  public boolean setBlock(int x, int y, int z, byte type, BlockFluidEntry entry, int environment)
  public boolean setBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder)
  public boolean setBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder, int supportValue, int rotation, int filler)
  public boolean setFluid(int x, int y, int z, byte type, int fluid, int environment)
  public boolean setFluid(int x, int y, int z, byte type, int fluid)
  public boolean setFluid(int x, int y, int z, byte type, int fluid, byte fluidLevel)
  public int getFluid(int x, int y, int z)
  public void overrideBlock(int x, int y, int z, byte type, int block)
  public void overrideBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder)
  public void overrideBlock(int x, int y, int z, byte type, BlockFluidEntry entry)
  public void overrideBlock(int x, int y, int z, byte type, int block, Holder<ChunkStore> holder, int rotation, int filler)
  public void overrideFluid(int x, int y, int z, byte type, int fluid)
  protected int localX(int x)
  protected int localZ(int z)
  public int globalX(int localX)
  public int globalZ(int localZ)

Fields:
private final ChunkGenerator chunkGenerator
private final GeneratedBlockChunk blockChunk
private final GeneratedBlockStateChunk blockStateChunk
private final GeneratedEntityChunk entityChunk
private final Holder<ChunkStore>[] sections
private final BlockPriorityChunk priorityChunk
private final HeightThresholdInterpolator interpolator
private BlockPriorityModifier blockPriorityModifier
