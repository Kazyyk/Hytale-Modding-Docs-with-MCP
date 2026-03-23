# BlockFlipType

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Enum

public enum BlockFlipType

Defines how a block's yaw rotation is transformed when the block is flipped along an axis. Used by the block placement and editor systems to compute correct rotations after mirroring operations.

## Enum Constants

- ORTHOGONAL | Standard orthogonal flip behavior
- ORTHOGONAL_INVERSE | Inverse orthogonal flip behavior
- SYMMETRIC | Symmetric flip (adds 180 degrees when aligned on the flip axis)

## Methods


public Rotation flipYaw(@Nonnull Rotation rotation, Axis axis)

Computes the new yaw Rotation after flipping along the given axis.

## Related Types

- Rotation -- rotation enum used for yaw/pitch/roll
- RotationTuple -- uses this during flip operations

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public Rotation flipYaw(Rotation rotation, Axis axis)
  private Rotation flipComponent(Rotation rotation, Axis axis, Axis ownAxis, Axis negateAxis, Axis alignment)
