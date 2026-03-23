# FloodLightCalculation

Type: class | Package: com.hypixel.hytale.server.core.universe.world.lighting | Extends: null | Implements: LightCalculation

public class FloodLightCalculation implements LightCalculation

## Fields

- protected final ChunkLightingManager chunkLightingManager
- protected final AverageCollector emptyAvg
- protected final AverageCollector blocksAvg
- protected final AverageCollector borderAvg
- protected final AverageCollector avgChunk
- protected final BlockSection[][] fromSections
- int x
- int z
- WorldChunk chunk
- BlockSection section
- int chunkX
- int chunkY
- int chunkZ
- WorldChunk worldChunk
- AtomicLong chunkLightTiming
- boolean fineLoggable
- LocalCachedChunkAccessor accessor
- BlockSection toSection
- FluidSection fluidSection
- Ref<ChunkStore> sectionx
- CalculationResult localLightResult
- CalculationResult globalLightResult
- long chunkDiff
- boolean done
- long start
- boolean solidAir
- ChunkLightDataBuilder localLight
- long end
- long diff
- ChunkLightDataBuilder globalLight
- BitSet bitSetQueue
- int oldHeightChunk
- int newHeightChunk
- int from
- int to
- boolean handled
- World world
- WorldChunk worldChunkTemp
- int sectionY
- ChunkLightDataBuilder light
- int column
- short height
- IntSet changedColumns
- int counter
- IntIterator iterator
- int columnx
- byte skyLight
- int zx
- byte propagatedValue
- int nx
- int nz
- int neighbourColumn
- byte neighbourSkyLight
- ChunkLightDataBuilder toLight
- int blockIndex
- byte skyValue
- short lightValue
- int blockId
- BlockType blockType
- ColorLight blockTypeLight
- int fluidId
- Fluid fluid
- ColorLight fluidLight
- int originY
- boolean hasSky
- BlockType fromBlockType
- Opacity fromOpacity
- byte redLight
- byte greenLight
- byte blueLight
- byte propagatedRedValue
- byte propagatedGreenValue
- byte propagatedBlueValue
- byte propagatedSkyValue
- int y
- int ny
- int neighbourBlock
- Vector3i[][] blockParts
- BlockSection[] partSections
- Vector3i[] directions
- Vector3i side
- BlockSection fromSection
- WorldChunk neighbourChunk
- BlockSection[] fromSectionsSides
- int i
- ChunkLightData fromLight
- int fromBlockIndex
- int toBlockIndex
- BlockSection[] fromSectionsEdges
- BlockSection[] fromSectionsCorners
- BlockType toBlockType
- Opacity toOpacity
- short oldLightValue
- byte neighbourRedLight
- byte neighbourGreenLight
- byte neighbourBlueLight
- short newLightValue

## Constructors

- public FloodLightCalculation(ChunkLightingManager chunkLightingManager)

## Methods

- public void init(@Nonnull WorldChunk chunk)
- private void initChunk(int x, int z)
- private void initChunk(@Nonnull WorldChunk chunk, int x, int z)
- private void initNeighbours(int x, int z)
- private void initSection(@Nonnull WorldChunk chunk, int x, int y, int z)
- private void initNeighbours(@Nonnull LocalCachedChunkAccessor accessor, int chunkX, int chunkY, int chunkZ)
- private void initNeighbourSections(@Nonnull LocalCachedChunkAccessor accessor, int x, int y, int z)
- public CalculationResult calculateLight(@Nonnull Vector3i chunkPosition)
- public CalculationResult updateLocalLight(LocalCachedChunkAccessor accessor,
        @Nonnull WorldChunk worldChunk,
        int chunkX,
        int chunkY,
        int chunkZ,
        @Nonnull BlockSection toSection,
        @Nonnull FluidSection fluidSection,
        @Nonnull AtomicLong chunkLightTiming,
        boolean fineLoggable)` |
| `public` | `CalculationResult` | `updateGlobalLight(@Nonnull LocalCachedChunkAccessor accessor,
        @Nonnull WorldChunk worldChunk,
        int chunkX,
        int chunkY,
        int chunkZ,
        @Nonnull BlockSection toSection,
        @Nonnull AtomicLong chunkLightTiming,
        boolean fineLoggable)` |
| `public` | `boolean` | `invalidateLightAtBlock(@Nonnull WorldChunk worldChunk, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int oldHeight, int newHeight)` |
| `public` | `boolean` | `invalidateLightInChunkSections(@Nonnull WorldChunk worldChunk, int sectionIndexFrom, int sectionIndexTo)` |
| `private` | `ChunkLightDataBuilder` | `floodEmptyChunkSection(@Nonnull WorldChunk worldChunk, short changeCounter, int chunkY)` |
| `private` | `ChunkLightDataBuilder` | `floodChunkSection(@Nonnull WorldChunk worldChunk, @Nonnull BlockSection toSection, @Nonnull FluidSection fluidSection, int chunkY)` |
| `` | `protected byte` | `getSkyValue(WorldChunk worldChunk, int chunkY, int blockX, int blockY, int blockZ, int sectionY, int height)` |
| `` | `private void` | `propagateLight(@Nonnull BitSet bitSetQueue, @Nonnull BlockSection section, @Nonnull ChunkLightDataBuilder light)` |
| `` | `public boolean` | `testNeighboursForLocalLight(@Nonnull LocalCachedChunkAccessor accessor, @Nonnull WorldChunk worldChunk, int chunkX, int chunkY, int chunkZ)` |
| `` | `public void` | `propagateSides(@Nonnull BlockSection toSection, @Nonnull ChunkLightDataBuilder globalLight, @Nonnull BitSet bitSetQueue)` |
| `` | `private void` | `propagateSide(@Nonnull BitSet bitSetQueue,
        @Nullable BlockSection fromSection,
        @Nonnull BlockSection toSection,
        @Nonnull ChunkLightDataBuilder toLight,
        @Nonnull IntBinaryOperator fromIndex,
        @Nonnull IntBinaryOperator toIndex)` |
| `` | `public void` | `propagateEdges(@Nonnull BlockSection toSection, @Nonnull ChunkLightDataBuilder globalLight, @Nonnull BitSet bitSetQueue)` |
| `` | `private void` | `propagateEdge(@Nonnull BitSet bitSetQueue,
        @Nullable BlockSection fromSection,
        @Nonnull BlockSection toSection,
        @Nonnull ChunkLightDataBuilder toLight,
        @Nonnull Int2IntFunction fromIndex,
        @Nonnull Int2IntFunction toIndex)` |
| `` | `public void` | `propagateCorners(@Nonnull BlockSection toSection, @Nonnull ChunkLightDataBuilder globalLight, @Nonnull BitSet bitSetQueue)` |
| `` | `private void` | `propagateCorner(@Nonnull BitSet bitSetQueue,
        @Nullable BlockSection fromSection,
        @Nonnull BlockSection toSection,
        @Nonnull ChunkLightDataBuilder toLight,
        int fromBlockIndex,
        int toBlockIndex)` |
| `` | `private void` | `propagateLight(@Nonnull BitSet bitSetQueue,
        byte propagatedRedValue,
        byte propagatedGreenValue,
        byte propagatedBlueValue,
        byte propagatedSkyValue,
        @Nonnull BlockSection toSection,
        @Nonnull ChunkLightDataBuilder toLight,
        int toBlockIndex)` |

## Related Types

- CalculationResult
- ChunkLightingManager
- LightCalculation

Also in this package: CalculationResult, ChunkLightingManager, FullBrightLightCalculation, LightCalculation

Complete API:
  public void init(WorldChunk chunk)
  private void initChunk(int x, int z)
  private void initChunk(WorldChunk chunk, int x, int z)
  private void initNeighbours(int x, int z)
  private void initSection(WorldChunk chunk, int x, int y, int z)
  private void initNeighbours(LocalCachedChunkAccessor accessor, int chunkX, int chunkY, int chunkZ)
  private void initNeighbourSections(LocalCachedChunkAccessor accessor, int x, int y, int z)
  public CalculationResult calculateLight(Vector3i chunkPosition)
  public CalculationResult updateLocalLight(LocalCachedChunkAccessor accessor, WorldChunk worldChunk, int chunkX, int chunkY, int chunkZ, BlockSection toSection, FluidSection fluidSection, AtomicLong chunkLightTiming, boolean fineLoggable)
  public CalculationResult updateGlobalLight(LocalCachedChunkAccessor accessor, WorldChunk worldChunk, int chunkX, int chunkY, int chunkZ, BlockSection toSection, AtomicLong chunkLightTiming, boolean fineLoggable)
  public boolean invalidateLightAtBlock(ChunkStore chunkStore, int blockX, int blockY, int blockZ, BlockType blockType, int oldHeight, int newHeight)
  private void invalidateLightingFor(ChunkStore chunkStore, int chunkX, int chunkZ, int sectionIndexFrom, int sectionIndexTo)
  public boolean invalidateLightInChunkSections(ChunkStore chunkStore, int chunkX, int chunkZ, int sectionIndexFrom, int sectionIndexTo)
  private ChunkLightDataBuilder floodEmptyChunkSection(WorldChunk worldChunk, short changeCounter, int chunkY)
  private ChunkLightDataBuilder floodChunkSection(WorldChunk worldChunk, BlockSection toSection, FluidSection fluidSection, int chunkY)
  protected byte getSkyValue(WorldChunk worldChunk, int chunkY, int blockX, int blockY, int blockZ, int sectionY, int height)
  private void propagateLight(BitSet bitSetQueue, BlockSection section, ChunkLightDataBuilder light)
  public boolean testNeighboursForLocalLight(LocalCachedChunkAccessor accessor, WorldChunk worldChunk, int chunkX, int chunkY, int chunkZ)
  public void propagateSides(BlockSection toSection, ChunkLightDataBuilder globalLight, BitSet bitSetQueue)
  private void propagateSide(BitSet bitSetQueue, BlockSection fromSection, BlockSection toSection, ChunkLightDataBuilder toLight, IntBinaryOperator fromIndex, IntBinaryOperator toIndex)
  public void propagateEdges(BlockSection toSection, ChunkLightDataBuilder globalLight, BitSet bitSetQueue)
  private void propagateEdge(BitSet bitSetQueue, BlockSection fromSection, BlockSection toSection, ChunkLightDataBuilder toLight, Int2IntFunction fromIndex, Int2IntFunction toIndex)
  public void propagateCorners(BlockSection toSection, ChunkLightDataBuilder globalLight, BitSet bitSetQueue)
  private void propagateCorner(BitSet bitSetQueue, BlockSection fromSection, BlockSection toSection, ChunkLightDataBuilder toLight, int fromBlockIndex, int toBlockIndex)
  private void propagateLight(BitSet bitSetQueue, byte propagatedRedValue, byte propagatedGreenValue, byte propagatedBlueValue, byte propagatedSkyValue, BlockSection toSection, ChunkLightDataBuilder toLight, int toBlockIndex)

Fields:
protected final ChunkLightingManager chunkLightingManager
protected final AverageCollector emptyAvg
protected final AverageCollector blocksAvg
protected final AverageCollector borderAvg
protected final AverageCollector avgChunk
protected final BlockSection[][] fromSections
