# BlockOperations

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk

public class BlockOperations

Utility class for chunk-level block operations. Provides static methods for updating ticking state of block areas based on bounding boxes, updating height maps when blocks change, and spawning block particle effects (build, break, physics) via the world notification handler.

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static void updateBlockArea(ChunkStore chunkStore, BlockSection section, BlockType blockType, int rotation, int x, int y, int z)
  public static short updateBlockHeight(BlockChunk blockChunk, int newBlockId, BlockType newBlock, int x, int y, int z, short oldHeight)
  public static void spawnBlockParticles(ChunkStore chunkStore, int oldBlockId, int newBlockId, int x, int y, int z, boolean isPhysics)
