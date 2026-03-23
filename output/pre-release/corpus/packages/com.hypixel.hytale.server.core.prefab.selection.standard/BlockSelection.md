# BlockSelection

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.standard | Implements: NetworkSerializable<EditorBlocksChange>, MetricProvider

public class BlockSelection implements NetworkSerializable<EditorBlocksChange>, MetricProvider

Core data structure representing a 3D selection of blocks, fluids, and entities. Supports placing into worlds, rotating, flipping, iterating blocks/fluids/entities, anchor positioning, and clipboard operations. Thread-safe with read-write locks for both block and entity data.

Also in this package: BlockComparingIterator, BlockHolder, BlockIterator, FallbackMode, FeedbackConsumer, FluidHolder, FluidIterator, TintIterator

Complete API:
  public int getX()
  public int getY()
  public int getZ()
  public int getAnchorX()
  public int getAnchorY()
  public int getAnchorZ()
  public Vector3i getSelectionMin()
  public Vector3i getSelectionMax()
  public boolean hasSelectionBounds()
  public int getBlockCount()
  public int getFluidCount()
  public int getTintCount()
  public int getSelectionVolume()
  public int getEntityCount()
  public void setPosition(int x, int y, int z)
  public void setAnchorAtWorldPos(int anchorX, int anchorY, int anchorZ)
  public void setAnchor(int anchorX, int anchorY, int anchorZ)
  public void setSelectionArea(Vector3i min, Vector3i max)
  public void setPrefabId(int id)
  public void copyPropertiesFrom(BlockSelection other)
  public boolean canPlace(World world, Vector3i position, IntList mask)
  public boolean matches(World world, Vector3i position)
  public boolean compare(BlockSelection.BlockComparingIterator iterator)
  public boolean hasBlockAtWorldPos(int x, int y, int z)
  public boolean hasBlockAtLocalPos(int x, int y, int z)
  public int getBlockAtWorldPos(int x, int y, int z)
  private int getBlockAtLocalPos(int x, int y, int z)
  public BlockSelection.BlockHolder getBlockHolderAtWorldPos(int x, int y, int z)
  private BlockSelection.BlockHolder getBlockHolderAtLocalPos(int x, int y, int z)
  public int getFluidAtWorldPos(int x, int y, int z)
  private int getFluidAtLocalPos(int x, int y, int z)
  public byte getFluidLevelAtWorldPos(int x, int y, int z)
  private byte getFluidLevelAtLocalPos(int x, int y, int z)
  public int getSupportValueAtWorldPos(int x, int y, int z)
  private int getSupportValueAtLocalPos(int x, int y, int z)
  public Holder<ChunkStore> getStateAtWorldPos(int x, int y, int z)
  private Holder<ChunkStore> getStateAtLocalPos(int x, int y, int z)
  public void forEachBlock(BlockSelection.BlockIterator iterator)
  public void addTintAtLocalPos(int x, int z, int color)
  public void addTintAtWorldPos(int worldX, int worldZ, int color)
  public int getTintAtWorldPos(int worldX, int worldZ)
  public boolean hasTintAtWorldPos(int worldX, int worldZ)
  public void forEachTint(BlockSelection.TintIterator iterator)
  public void forEachFluid(BlockSelection.FluidIterator iterator)
  public void forEachEntity(Consumer<Holder<EntityStore>> consumer)
  public void copyFromAtWorld(int x, int y, int z, WorldChunk other, BlockPhysics blockPhysics)
  public void addEmptyAtWorldPos(int x, int y, int z)
  public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
  public void addBlockAtWorldPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue)
  public void addBlockAtLocalPos(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  private void addBlock0(int x, int y, int z, int block, int rotation, int filler, int supportValue, Holder<ChunkStore> state)
  private void addBlock0(int x, int y, int z, BlockSelection.BlockHolder block)
  public void addFluidAtWorldPos(int x, int y, int z, int fluidId, byte fluidLevel)
  public void addFluidAtLocalPos(int x, int y, int z, int fluidId, byte fluidLevel)
  private void addFluid0(int x, int y, int z, int fluidId, byte fluidLevel)
  private void addEntity0(Holder<EntityStore> holder)
  public void reserializeBlockStates(ChunkStore store, boolean destructive)
  public void clearAllSupportValues()
  public void addEntityFromWorld(Holder<EntityStore> entityHolder)
  public void addEntityHolderRaw(Holder<EntityStore> entityHolder)
  public void sortEntitiesByPosition()
  public void placeNoReturn(World world, Vector3i position, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, ComponentAccessor<EntityStore> componentAccessor)
  public void placeNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, Vector3i position, BlockMask blockMask, ComponentAccessor<EntityStore> componentAccessor)
  private void placeBlockNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, BlockMask blockMask, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, int totalBlocks, int counter, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int newBlockId, int newRotation, int newFiller, Holder<ChunkStore> holder, ComponentAccessor<EntityStore> componentAccessor)
  private void placeFluidNoReturn(String feedbackKey, CommandSender feedback, FeedbackConsumer feedbackConsumer, World outerWorld, BlockMask blockMask, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, int totalBlocks, int counter, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int newFluidId, byte newFluidLevel, ComponentAccessor<EntityStore> componentAccessor)
  private void clearFluidAtPosition(World world, WorldChunk chunk, int blockX, int blockY, int blockZ)
  public BlockSelection place(CommandSender feedback, World outerWorld)
  public BlockSelection place(CommandSender feedback, World outerWorld, BlockMask blockMask)
  public BlockSelection place(CommandSender feedback, World outerWorld, Vector3i position, BlockMask blockMask)
  public BlockSelection place(CommandSender feedback, World outerWorld, Vector3i position, BlockMask blockMask, Consumer<Ref<EntityStore>> entityConsumer)
  private void placeBlock(CommandSender feedback, World outerWorld, BlockMask blockMask, BlockSelection before, LongSet dirtyChunks, BlockTypeAssetMap<String,BlockType> assetMap, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int localX, int localY, int localZ, int newBlockId, int newRotation, int newFiller, Holder<ChunkStore> holder, int newSupportValue)
  private void placeFluid(CommandSender feedback, World outerWorld, BlockSelection before, LongSet dirtyChunks, IndexedLookupTableAssetMap<String,Fluid> assetMap, long chunkIndex, WorldChunk chunk, int blockX, int blockY, int blockZ, int localX, int localY, int localZ, int newFluidId, byte newFluidLevel)
  private void placeEntities(World world, Vector3i pos)
  private void placeEntities(World world, Vector3i pos, Consumer<Ref<EntityStore>> entityConsumer)
  private Ref<EntityStore> placeEntity(World world, Holder<EntityStore> entityHolder, Vector3i pos, int prefabId)
  public BlockSelection rotate(Axis axis, int angle)
  public BlockSelection rotate(Axis axis, int angle, Vector3f originOfRotation)
  private static void composeAxisRotation(Matrix4d axisRotation, Vector3f euler)
  private static double[] matrixToQuaternion(Matrix4d m)
  public BlockSelection rotateArbitrary(float yawDegrees, float pitchDegrees, float rollDegrees)
  public BlockSelection flip(Axis axis)
  public BlockSelection relativize()
  public BlockSelection relativize(int originX, int originY, int originZ)
  public BlockSelection cloneSelection()
  public void add(BlockSelection other)
  public MetricResults toMetricResults()
  public EditorBlocksChange toPacket()
  public static ClipboardEntityChange toClipboardEntityChange(Holder<EntityStore> holder, double anchorX, double anchorY, double anchorZ)
  public EditorBlocksChange toSelectionPacket()
  public EditorBlocksChange toPacketWithSelection()
  public void tryFixFiller(boolean allowDestructive)
  public void reserializeEntities(Store<EntityStore> store, boolean destructive)
  public String toString()

Fields:
public static final Consumer<Ref<EntityStore>> DEFAULT_ENTITY_CONSUMER
public static final MetricsRegistry<BlockSelection> METRICS_REGISTRY
private static final HytaleLogger LOGGER
private int x
private int y
private int z
private int anchorX
private int anchorY
private int anchorZ
private int prefabId
private Vector3i min
private Vector3i max
private final Long2ObjectMap<BlockSelection.BlockHolder> blocks
private final Long2ObjectMap<BlockSelection.FluidHolder> fluids
private final List<Holder<EntityStore>> entities
private final Long2IntMap tints
private final ReentrantReadWriteLock blocksLock
private final ReentrantReadWriteLock entitiesLock
