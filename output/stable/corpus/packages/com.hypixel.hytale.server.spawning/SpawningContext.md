# SpawningContext

Type: class | Package: com.hypixel.hytale.server.spawning

public class SpawningContext

Central position validation mechanism shared by all spawn modes (world spawning, beacons, and spawn markers). Resolves a spawn position within a chunk column by analyzing spawn spans (contiguous empty blocks), checking ground level, water level, air height, block materials, and model bounding box fit.

## Key Fields

- world | World | Target world
- worldChunk | WorldChunk | Target chunk
- xBlock` / `zBlock | int | Block position within chunk
- groundLevel | int | Y level of the ground block
- groundBlockType | BlockType | Block type at ground level
- waterLevel | int | Y level of water surface (-1 if no water)
- airHeight | int | Y level of first air block above ground/water
- xSpawn` / `ySpawn` / `zSpawn | double | Final computed spawn position

## Key Methods

- setSpawnable(ISpawnableWithModel) | boolean | Resolves the model and bounding box for spawn fit checks
- setSpawnable(ISpawnableWithModel, boolean) | boolean | Resolves model with optional max-scale mode
- setChunk(WorldChunk, int) | void | Sets the target chunk and environment index
- setColumn(int, int, int, int[]) | boolean | Scans a column for valid spawn spans within Y range
- setColumn(int, int, int, int[], SuppressionSpanHelper) | boolean | Scans a column with suppression zone exclusions
- set(World, double, double, double) | boolean | Sets a specific world position and resolves the nearest spawn span
- canSpawn(boolean, boolean) | SpawnTestResult | Master validation checking block and entity overlap
- canSpawn() | SpawnTestResult | Validates both block and entity overlap
- isOnSolidGround() | boolean | Checks for solid block beneath spawn position
- isInWater(float) | boolean | Checks for sufficient water depth
- isInAir(double) | boolean | Checks for air spawn at given height
- canBreathe(boolean, boolean) | boolean | Breathing validation for air/water respiration
- validatePosition(int) | boolean | Collision module position check against invalid materials
- selectRandomSpawnSpan() | boolean | Selects a random valid spawn span from the current set
- newPosition() | Vector3d | Creates a new position vector from computed spawn coordinates
- newRotation() | Vector3f | Creates a new rotation vector with random yaw

## Inner Classes

- `SpawnSpan` -- private data holder for a contiguous span of empty blocks with bottom, top, water level, and ground level.

Also in this package: ISpawnable, ISpawnableWithModel, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnRejection, SpawnSpan, SpawnTestResult, SpawningPlugin

Complete API:
  public boolean setSpawnable(ISpawnableWithModel spawnable)
  public boolean setSpawnable(ISpawnableWithModel spawnable, boolean maxScale)
  private boolean setModel(String modelName, boolean maxScale)
  private void clearModel()
  public void newModel()
  public Model getModel()
  public void setChunk(WorldChunk worldChunk, int environmentIndex)
  public boolean setColumn(int x, int z, int yHint, int[] yRange)
  public boolean setColumn(int x, int z, int yHint, int[] yRange, SuppressionSpanHelper suppressionHelper)
  public void setColumn(int x, int z, SuppressionSpanHelper suppressionHelper)
  public Scope getModifierScope()
  public boolean set(World world, double x, double y, double z)
  public void deleteCurrentSpawnSpan()
  public boolean selectRandomSpawnSpan()
  private boolean selectSpawnSpan(int index)
  private void splitRangeToSpawnSpans(int min, int max)
  private void addSpawnSpan(int top, int span, int groundLevel, int waterLevel)
  private int isSpawnSpanBlock(int x, int y, int z)
  private void commonInit()
  public SpawnTestResult canSpawn(boolean testOverlapBlocks, boolean testOverlapEntities)
  public SpawnTestResult canSpawn()
  private SpawnTestResult intersectsEntity()
  private SpawnTestResult intersectsBlock()
  public static boolean isWaterBlock(int fluidId)
  public int getWaterLevel()
  public int getAirHeight()
  public boolean isInsideSpan(double y)
  public boolean isInWater(float minDepth)
  public boolean isOnSolidGround()
  public boolean isInAir(double height)
  public boolean validatePosition(int invalidMaterials)
  public boolean canBreathe(boolean breathesInAir, boolean breathesInWater)
  public void release()
  public void releaseFull()
  public ExecutionContext getExecutionContext()
  public Vector3d newPosition()
  public Vector3f newRotation()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
private static final BlockTypeAssetMap<String,BlockType> BLOCK_ASSET_MAP
public World world
public WorldChunk worldChunk
public int xBlock
public int zBlock
public double ySpawnHint
public int groundLevel
public int groundBlockId
public int groundRotation
public BlockType groundBlockType
public int groundFluidId
public Fluid groundFluid
public int ySpanMin
public int ySpanMax
public int yBlock
public int waterLevel
public int airHeight
public double ySpawnMin
public double xSpawn
public double zSpawn
public double ySpawn
private int environmentIndex
private int minSpawnSpanHeight
public double yaw
public double pitch
public double roll
private ISpawnableWithModel spawnable
private Model spawnModel
private Scope modifierScope
private final CollisionResult collisionResult
private final Vector3d position
private final ExecutionContext executionContext
private SpawningContext.SpawnSpan[] spawnSpans
private int spawnSpansUsed
private int currentSpawnSpanIndex
private static final int SOLID_BLOCK
private static final int EMPTY_BLOCK
private static final int FLUID_BLOCK
