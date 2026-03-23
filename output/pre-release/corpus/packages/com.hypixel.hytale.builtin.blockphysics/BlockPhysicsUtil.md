# BlockPhysicsUtil

Type: class | Package: com.hypixel.hytale.builtin.blockphysics

public class BlockPhysicsUtil

Utility methods for evaluating block physics support requirements, testing face support constraints, and removing unsupported blocks.

## Enum Constants

- `INVALID`
- `VALID`
- `WAITING_CHUNK`

## Constants

- int DOESNT_SATISFY
- int IGNORE
- int SATISFIES_SUPPORT
- int WAITING_CHUNK

## Key Methods

- public static BlockPhysicsUtil.Result applyBlockPhysics(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, @Nonnull BlockPhysics blockPhysics, @Nonnull FluidSection fluidSection, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int rotation, int filler)
- public static int testBlockPhysics(@Nonnull BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, @Nullable BlockPhysics blockPhysics, @Nonnull FluidSection fluidSection, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int rotation, int filler)
- public static boolean doesSatisfyRequirements(@Nonnull BlockType blockType, Vector3i blockFillerOffset, Vector3i neighbourFillerOffset, BlockFace blockFace, BlockFace neighbourBlockFace, int neighbourBlockId, @Nonnull BlockType neighbourBlockType, int neighbourRotation, int neighbourFluidId, @Nonnull Fluid neighbourFluid, @Nonnull RequiredBlockFaceSupport requiredBlockFaceSupport)
- public static boolean doesMatchFaceType(Vector3i fillerOffset, @Nonnull String faceType, BlockFace blockFace, @Nonnull Map<BlockFace, BlockFaceSupport[]> supporting)

Also in this package: BlockPhysicsPlugin, BlockPhysicsSystems, CachedAccessor, PrefabBufferValidator, Result, Ticking, ValidateBlockEvent, WorldValidationUtil

Complete API:
  public static BlockPhysicsUtil.Result applyBlockPhysics(ComponentAccessor<EntityStore> componentAccessor, Ref<ChunkStore> chunkReference, BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, BlockPhysics blockPhysics, FluidSection fluidSection, int blockX, int blockY, int blockZ, BlockType blockType, int rotation, int filler)
  public static int testBlockPhysics(BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, BlockPhysics blockPhysics, FluidSection fluidSection, int blockX, int blockY, int blockZ, BlockType blockType, int rotation, int filler)
  public static boolean doesSatisfyRequirements(BlockType blockType, Vector3i blockFillerOffset, Vector3i neighbourFillerOffset, BlockFace blockFace, BlockFace neighbourBlockFace, int neighbourBlockId, BlockType neighbourBlockType, int neighbourRotation, int neighbourFluidId, Fluid neighbourFluid, RequiredBlockFaceSupport requiredBlockFaceSupport)
  public static boolean doesMatchFaceType(Vector3i fillerOffset, String faceType, BlockFace blockFace, Map<BlockFace,BlockFaceSupport[]> supporting)

Fields:
public static final int DOESNT_SATISFY
public static final int IGNORE
public static final int SATISFIES_SUPPORT
public static final int WAITING_CHUNK
