# BlockGathering

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BlockGathering>

Defines how a block is gathered (broken/harvested). Contains sub-configurations for breaking, harvesting, soft block, and physics drop types, plus per-tool overrides via `BlockToolData`. The `useDefaultDropWhenPlaced` flag controls whether player-placed blocks use default drops instead of drop lists.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockGathering toPacket()
  public BlockBreakingDropType getBreaking()
  public HarvestingDropType getHarvest()
  public SoftBlockDropType getSoft()
  public boolean isHarvestable()
  public boolean isSoft()
  public PhysicsDropType getPhysics()
  public boolean shouldUseDefaultDropWhenPlaced()
  public String toString()
  public Map<String,BlockGathering.BlockToolData> getToolData()

Fields:
public static final BuilderCodec<BlockGathering> CODEC
protected BlockBreakingDropType breaking
protected HarvestingDropType harvest
protected SoftBlockDropType soft
protected PhysicsDropType physics
protected BlockGathering.BlockToolData[] toolDataRaw
protected Map<String,BlockGathering.BlockToolData> toolData
protected boolean useDefaultDropWhenPlaced
