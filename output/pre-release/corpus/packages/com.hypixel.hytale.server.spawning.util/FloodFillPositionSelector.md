# FloodFillPositionSelector

Type: class | Package: com.hypixel.hytale.server.spawning.util | Implements: Component<EntityStore>

public class FloodFillPositionSelector implements Component<EntityStore>

ECS component that performs flood-fill-based spawn position selection around a beacon. Builds a height grid via flood fill, creates multi-resolution bitmaps to find candidate positions, then filters by spawn suppression, block type, fluid, and light conditions. Supports weighted random selection biased toward a target distance from the player.

## Methods

- public static ComponentType<EntityStore, FloodFillPositionSelector> getComponentType()
- public void setCalculatePositionsAfter(double calculatePositionsAfter)
- public boolean tickCalculatePositionsAfter(float dt)
- public boolean hasPositionsForRole(int roleIndex)
- public boolean prepareSpawnContext(@Nonnull Vector3d playerPosition, int spawnsThisRound, int roleIndex, @Nonnull SpawningContext spawningContext, @Nonnull BeaconSpawnWrapper spawnWrapper)
- public boolean shouldRebuildCache()
- public void forceRebuildCache()
- public void init()
- public void buildPositionCache(@Nonnull Vector3d origin, @Nonnull FloodFillEntryPoolSimple pool)
- public static int getPositionIndex(int x, int z, int size)
- public static int xFromIndex(int index, int size)
- public static int zFromIndex(int index, int size)

## Inner Types

### Debug (enum)

`DISABLED`, `IRREGULARITIES`, `ALL` -- controls debug output during position selection.

Also in this package: ChunkColumnMask, Debug, FloodFillEntryPoolProviderSimple, FloodFillEntryPoolSimple, LightRangePredicate, RandomChunkColumnIterator, SortBufferProvider, WeightedPosition

Complete API:
  public static ComponentType<EntityStore,FloodFillPositionSelector> getComponentType()
  public void setCalculatePositionsAfter(double calculatePositionsAfter)
  public boolean tickCalculatePositionsAfter(float dt)
  public boolean hasPositionsForRole(int roleIndex)
  public boolean prepareSpawnContext(Vector3d playerPosition, int spawnsThisRound, int roleIndex, SpawningContext spawningContext, BeaconSpawnWrapper spawnWrapper)
  public boolean shouldRebuildCache()
  public void forceRebuildCache()
  public void init()
  public void buildPositionCache(Vector3d origin, FloodFillEntryPoolSimple pool)
  private void floodFill(int worldX, int worldY, int worldZ, int setX, int setZ, FloodFillEntryPoolSimple pool)
  private void findPositions(int originX, int originZ)
  private int buildLowerResolutionMap(BitSet targetMap, int mapSize, BitSet parentMap, int parentMapSize)
  private int pickOpenSegment(int lowResolutionIndex, int lowResolutionMapSize, BitSet higherResolutionMap, int highResolutionMapSize)
  private int shiftIndexAwayFromWall(int index)
  private boolean canSpawn(int x, int y, int z, int roleIndex, ChunkSuppressionEntry suppressionEntry)
  private String debugDumpBaseFloodFill()
  private String debugDumpLowResolutionMap(BitSet map, int size)
  public static int getPositionIndex(int x, int z, int size)
  public static int xFromIndex(int index, int size)
  public static int zFromIndex(int index, int size)
  public Component<EntityStore> clone()

Fields:
private static final int MAX_SPAWN_POSITIONS_HINT
private static final double SPAWN_POSITION_DENSITY
private static final int CONCURRENT_POSITION_OPTION_MULTIPLIER
private static final double MAX_FAILED_SPAWN_POSITION_RATIO
private static final double IRREGULAR_MIN_SPAWNS_MULTIPLIER
private static final double IRREGULAR_MAX_SPAWNS_MULTIPLIER
private static final int NOT_CHECKED
private static final int BLOCKED
private static final int TOO_HIGH
private static final int TOO_LOW
private static final int MAX_RESOLUTION_DIVISOR
private static final ThreadLocal<FloodFillPositionSelector.SortBufferProvider> sortBufferProvider
private static final Comparator<Object> WEIGHTED_POSITION_COMPARATOR
private final World world
private ChunkAccessor<WorldChunk> chunkAccessor
private final int size
private int minY
private int maxY
private final BeaconSpawnWrapper spawnWrapper
private final int[] roleIndexes
private final int[] heightGrid
private final Int2ObjectMap<BitSet> resolutionMaps
private final BitSet fullResolutionMap
private int desiredPositionCount
private final IntArrayList highResolutionOptions
private final Deque<int[]> floodFillQueue
private final SpawningContext spawningContext
private WorldChunk chunk
private final IntSet positionIndexes
private final Int2ObjectMap<ObjectArrayList<FloodFillPositionSelector.WeightedPosition>> positionsByRole
private final Int2IntMap failedSpawnsByRole
private boolean hasRun
private FloodFillPositionSelector.Debug debug
private boolean irregularCase
private IntSet failedPositionTestIndexes
private double calculatePositionsAfter
