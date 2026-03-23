# CaveGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class CaveGenerator

Generates cave structures by recursively creating and linking cave nodes based on type configuration, biome masks, and height conditions.

## Key Methods

- public CaveType[] getCaveTypes()
- public Cave generate(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull CaveType caveType, int x, int y, int z)
- protected Cave newCave(CaveType caveType)
- protected void startCave(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull Cave cave, @Nonnull Vector3d origin, @Nonnull Random random)
- protected void continueNode(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull Cave cave, @Nonnull CaveNode parent, int depth, @Nonnull Random random)
- protected int getChildrenCount(@Nonnull CaveNodeType type, Random random)
- protected CaveNodeType.CaveNodeChildEntry[] getChildEntriesRandomized(@Nonnull CaveNodeType type, @Nonnull Random random)
- protected int getRepeatCounter(@Nonnull CaveNodeType.CaveNodeChildEntry entry, Random random)
- protected PrefabRotation getRotation(@Nonnull CaveNode caveNode)
- protected Vector3d getChildOrigin(@Nonnull CaveNode parentNode, @Nullable PrefabRotation parentRotation, @Nonnull CaveNodeType.CaveNodeChildEntry childEntry)
- protected float getChildYaw(@Nonnull CaveNode parentNode, @Nullable PrefabRotation parentRotation, @Nonnull CaveNodeType.CaveNodeChildEntry childEntry, Random random)
- protected boolean shouldGenerateChild(@Nonnull CaveNodeType.CaveNodeChildEntry entry, @Nonnull Random random)
- protected boolean isMatchingHeight(int seed, @Nonnull Vector3d vec, @Nonnull ICoordinateCondition condition)
- protected int getNextDepth(@Nonnull CaveNodeType.CaveNodeChildEntry entry, int depth, Random random)
- protected void generatePrefabs(int seed, @Nonnull ChunkGenerator chunkGenerator, CaveNode parent, @Nonnull CaveNode node)
- protected void generatePrefab(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nullable CaveNode parent, @Nonnull CaveNode caveNode, @Nonnull CavePrefabContainer.CavePrefabEntry entry, @Nonnull Random random)
- protected boolean isMatchingBiome(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull IIntCondition condition, int x, int z)
- protected int getBiomeMaskResult(int seed, @Nonnull ChunkGenerator chunkGenerator, @Nonnull Int2FlagsCondition mask, @Nonnull Vector3d vec)

Also in this package: Cave, CaveBiomeMaskFlags, CaveBlockPriorityModifier, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CavePrefabPlacement, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public CaveType[] getCaveTypes()
  public Cave generate(int seed, ChunkGenerator chunkGenerator, CaveType caveType, int x, int y, int z)
  protected Cave newCave(CaveType caveType)
  protected void startCave(int seed, ChunkGenerator chunkGenerator, Cave cave, Vector3d origin, Random random)
  protected void continueNode(int seed, ChunkGenerator chunkGenerator, Cave cave, CaveNode parent, int depth, Random random)
  protected int getChildrenCount(CaveNodeType type, Random random)
  protected CaveNodeType.CaveNodeChildEntry[] getChildEntriesRandomized(CaveNodeType type, Random random)
  protected int getRepeatCounter(CaveNodeType.CaveNodeChildEntry entry, Random random)
  protected PrefabRotation getRotation(CaveNode caveNode)
  protected Vector3d getChildOrigin(CaveNode parentNode, PrefabRotation parentRotation, CaveNodeType.CaveNodeChildEntry childEntry)
  protected float getChildYaw(CaveNode parentNode, PrefabRotation parentRotation, CaveNodeType.CaveNodeChildEntry childEntry, Random random)
  protected boolean shouldGenerateChild(CaveNodeType.CaveNodeChildEntry entry, Random random)
  protected boolean isMatchingHeight(int seed, Vector3d vec, ICoordinateCondition condition)
  protected int getNextDepth(CaveNodeType.CaveNodeChildEntry entry, int depth, Random random)
  protected void generatePrefabs(int seed, ChunkGenerator chunkGenerator, CaveNode parent, CaveNode node)
  protected void generatePrefab(int seed, ChunkGenerator chunkGenerator, CaveNode parent, CaveNode caveNode, CavePrefabContainer.CavePrefabEntry entry, Random random)
  protected boolean isMatchingBiome(int seed, ChunkGenerator chunkGenerator, IIntCondition condition, int x, int z)
  protected int getBiomeMaskResult(int seed, ChunkGenerator chunkGenerator, Int2FlagsCondition mask, Vector3d vec)

Fields:
private final CaveType[] caveTypes
