# BlockMovementSettings

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BlockMovementSettings>

Configures how entities move when in contact with a block. Properties include climbability, bounciness, bounce velocity, drag (default 0.82), friction (default 0.18), climb speed multipliers (up/down/lateral), terminal velocity modifier, horizontal speed multiplier, and jump force multiplier.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockMovementSettings toPacket()
  public boolean isClimbable()
  public boolean isBouncy()
  public float getBounceVelocity()
  public float getDrag()
  public float getFriction()
  public float getClimbUpSpeedMultiplier()
  public float getClimbDownSpeedMultiplier()
  public float getClimbLateralSpeedMultiplier()
  public float getTerminalVelocityModifier()
  public float getHorizontalSpeedMultiplier()
  public float jumpForceMultiplier()
  public String toString()

Fields:
public static final BuilderCodec<BlockMovementSettings> CODEC
private boolean isClimbable
private boolean isBouncy
private float bounceVelocity
private float drag
private float friction
private float climbUpSpeedMultiplier
private float climbDownSpeedMultiplier
private float climbLateralSpeedMultiplier
private float terminalVelocityModifier
private float horizontalSpeedMultiplier
private float jumpForceMultiplier
