# VariantRotation

Type: enum | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.VariantRotation>

Defines rotation variant modes for blocks. Values: `None`, `Wall`, `UpDown`, `Pipe`, `DoublePipe`, `NESW`, `UpDownNESW`, `Debug`, `All`. Each value specifies the valid rotation tuples, a verification function, and X/Z rotation functions. Controls which orientations a block can have when placed.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType (and 8 more)

Complete API:
  private static Rotation validatePipe(Rotation yaw)
  public RotationTuple[] getRotations()
  public RotationTuple rotateX(RotationTuple pair, Rotation rotation)
  public RotationTuple rotateZ(RotationTuple pair, Rotation rotation)
  public RotationTuple verify(RotationTuple pair)
  public com.hypixel.hytale.protocol.VariantRotation toPacket()

Fields:
public static final VariantRotation[] EMPTY_ARRAY
private final com.hypixel.hytale.protocol.VariantRotation protocolType
private final RotationTuple[] rotations
private final Function<RotationTuple,RotationTuple> verify
private final BiFunction<RotationTuple,Rotation,RotationTuple> rotateX
private final BiFunction<RotationTuple,Rotation,RotationTuple> rotateZ
