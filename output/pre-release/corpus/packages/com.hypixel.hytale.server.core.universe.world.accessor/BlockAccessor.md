# BlockAccessor

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.accessor

public interface BlockAccessor

Interface for reading and writing block data within a single chunk. Provides methods for getting/setting blocks by ID or `BlockType`, breaking blocks, testing placement validity, querying block types, managing ticking state, accessing fluid/support/filler/rotation data, and setting block interaction states. Default methods provide convenient overloads for common operations.

Known implementors: EmptyBlockAccessor, WorldChunk

Also in this package: ChunkAccessor, EmptyBlockAccessor, IChunkAccessorSync, LocalCachedChunkAccessor, OverridableChunkAccessor, TestBlockFunction

Complete API:
  int getX()
  int getZ()
  ChunkAccessor getChunkAccessor()
  int getBlock(int var1, int var2, int var3)
  default int getBlock(Vector3i pos)
  boolean setBlock(int var1, int var2, int var3, int var4, BlockType var5, int var6, int var7, int var8)
  default boolean setBlock(int x, int y, int z, int id, BlockType blockType)
  default boolean setBlock(int x, int y, int z, String blockTypeKey)
  default boolean setBlock(int x, int y, int z, String blockTypeKey, int settings)
  default boolean setBlock(int x, int y, int z, int id)
  default boolean setBlock(int x, int y, int z, int id, int settings)
  default boolean setBlock(int x, int y, int z, BlockType blockType)
  default boolean setBlock(int x, int y, int z, BlockType blockType, int settings)
  default boolean breakBlock(int x, int y, int z, int filler, int settings)
  default boolean breakBlock(int x, int y, int z)
  default boolean breakBlock(int x, int y, int z, int settings)
  default boolean testBlocks(int x, int y, int z, BlockType blockTypeToTest, int rotation, TriIntPredicate predicate)
  default boolean testBlockTypes(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)
  default boolean placeBlock(int x, int y, int z, String originalBlockTypeKey, Rotation yaw, Rotation pitch, Rotation roll, int settings)
  default boolean placeBlock(int x, int y, int z, String originalBlockTypeKey, RotationTuple rotationTuple, int settings, boolean validatePlacement)
  default boolean placeBlock(int x, int y, int z, String blockTypeKey, Rotation yaw, Rotation pitch, Rotation roll)
  default boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotationIndex)
  default boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotationIndex, IChunkAccessorSync.TestBlockFunction filter)
  default BlockType getBlockType(int x, int y, int z)
  default BlockType getBlockType(Vector3i block)
  boolean setTicking(int var1, int var2, int var3, boolean var4)
  boolean isTicking(int var1, int var2, int var3)
  Holder<ChunkStore> getBlockComponentHolder(int var1, int var2, int var3)
  default void setBlockInteractionState(Vector3i blockPosition, BlockType blockType, String state)
  default void setBlockInteractionState(int x, int y, int z, BlockType blockType, String state, boolean force)
  static String getCurrentInteractionState(BlockType blockType)
  int getFluidId(int var1, int var2, int var3)
  byte getFluidLevel(int var1, int var2, int var3)
  int getSupportValue(int var1, int var2, int var3)
  int getFiller(int var1, int var2, int var3)
  int getRotationIndex(int var1, int var2, int var3)
  default RotationTuple getRotation(int x, int y, int z)
