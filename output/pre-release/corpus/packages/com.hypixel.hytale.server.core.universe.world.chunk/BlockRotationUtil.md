# BlockRotationUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk

public class BlockRotationUtil

Utility class for computing flipped and rotated block rotations and filler coordinates. Handles rotation tuple manipulation with optional `BlockFlipType` corrections across X/Y/Z axes.

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockOperations, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static RotationTuple getFlipped(RotationTuple blockRotation, BlockFlipType flipType, Axis axis)
  public static RotationTuple getRotated(RotationTuple blockRotation, Axis axis, Rotation rotation, VariantRotation variantRotation)
  private static RotationTuple get(Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll, Axis axis, Rotation rotation, VariantRotation variantRotation, boolean preventPitchRotation)
  public static int getFlippedFiller(int filler, Axis axis)
  public static int getRotatedFiller(int filler, Axis axis, Rotation rotation)

Fields:
private static final int[][][] LOCAL_FLIP_CORRECTIONS
